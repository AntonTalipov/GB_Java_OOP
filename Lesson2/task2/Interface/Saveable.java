package Lesson2.task2.Interface;

import Lesson2.task2.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
