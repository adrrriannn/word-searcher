package com.adrrriannn.word.searcher.service.indexer;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

public interface IndexerService {
    Map<String, Set<String>> indexDirectory(String directoryPath);
}
