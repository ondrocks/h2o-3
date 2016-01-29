package ai.h2o.automl;

import org.junit.BeforeClass;
import org.junit.Test;

public class AutoCollectTest extends TestUtil { // requires mysql-connector-java-3.1.14-bin.jar in -cp
  @BeforeClass public static void setup() { stall_till_cloudsize(1); }
//  @Test public void testConnection() {
//    ResultSet rs = AutoCollect.query("SHOW TABLES;");
//    try {
//      while(rs.next()) {
//        System.out.println(rs.getString(1));
//      }
//    } catch (SQLException e) {
//      e.printStackTrace();
//    } finally {
//      try {
//        rs.close();
//      } catch(SQLException ex) {}
//    }
//    System.out.println();
//  }
//
//  @Test public void testHasDataset() {
//    AutoCollect ac = new AutoCollect(3600,"");
//    System.out.println(ac.hasMeta("iris"));
//    System.out.println("--");
//  }
//
//  @Test public void testPutIris(){
//    Frame fr=null;
//    try {
//      AutoCollect ac = new AutoCollect(3600, "");
//      fr = parse_test_file(Key.make("a.hex"), "/0xdata/h2o-3/smalldata/iris/iris_wheader.csv");
//      ac.computeMetaData("iris_wheader", fr, new int[]{0,1,2,3}, 4, true);
//    } finally {
//      if( fr!=null ) fr.delete();
//    }
//  }


  @Test public void testSmalldataMetaCollect() {
    AutoCollect ac = new AutoCollect(30, find_test_file_static("smalldata/meta").getAbsolutePath());
    ac.start();
  }
}
