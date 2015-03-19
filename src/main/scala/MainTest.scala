import java.io.File

import org.apache.lucene.index.{IndexWriterConfig, IndexWriter}
import org.apache.lucene.store.SimpleFSDirectory

/**
 * Created by arthur on 3/19/15.
 */
class MainTest {

  def main(args: Array[String]) {

  }

}


class TestLuceneIndexer(val luceneIndexDir: String, val conf: IndexWriterConfig) {
  val indexWriter: IndexWriter = new IndexWriter(new SimpleFSDirectory(new File(luceneIndexDir)), conf)

  def Close(): Unit = {
    indexWriter.close()
  }

  def Index(dataDir: String): Int = {

    val files: Array[File] = new File(dataDir).listFiles()

    indexWriter.numDocs()
  }
}
