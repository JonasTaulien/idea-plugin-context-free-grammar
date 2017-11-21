package codes.rudolph.idea.cfg;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import org.jetbrains.annotations.NotNull;

public class FileTypeFactory extends com.intellij.openapi.fileTypes.FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(FileType.INSTANCE, "cfgr");
    }
}