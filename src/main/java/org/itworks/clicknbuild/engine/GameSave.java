package org.itworks.clicknbuild.engine;

import com.fasterxml.jackson.core.util.DefaultIndenter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public final class GameSave {
    private int dummyProgress;

    public int getDummyProgress() {
        return dummyProgress;
    }

    public void setDummyProgress(int dummyProgress) {
        this.dummyProgress = dummyProgress;
    }

    public void save(Path path) {
        if (path == null || !Files.exists(path)) return;
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.indentObjectsWith(DefaultIndenter.SYSTEM_LINEFEED_INSTANCE);
        pp.indentArraysWith(DefaultIndenter.SYSTEM_LINEFEED_INSTANCE);
        try {
            mapper.writer(pp).writeValue(Files.newBufferedWriter(path), this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("UnusedReturnValue")
    public GameSave load(Path path) throws IOException {
        if (!Files.exists(Objects.requireNonNull(path))) throw new FileNotFoundException();
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        return mapper.readerForUpdating(this).readValue(Files.newBufferedReader(path), GameSave.class);
    }
}
