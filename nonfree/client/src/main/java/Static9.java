import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString1;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString2;

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString3;

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString5;

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString6;

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "client!ae", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!ae", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable1 = new Hashtable(16);

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
	public static final int anInt148 = 3;

	@OriginalMember(owner = "client!ae", name = "x", descriptor = "J")
	public static volatile long aLong9 = 0L;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
	public static File method287(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(4) File local4 = (File) aHashtable1.get(arg0);
		if (local4 != null) {
			return local4;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString2, "/tmp/", "" };
		@Pc(66) String[] local66 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(73) int local73 = 0; local73 < 2; local73++) {
			for (@Pc(76) int local76 = 0; local76 < local66.length; local76++) {
				for (@Pc(79) int local79 = 0; local79 < local43.length; local79++) {
					@Pc(110) String local110 = local43[local79] + local66[local76] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(112) RandomAccessFile local112 = null;
					try {
						@Pc(117) File local117 = new File(local110);
						if (local73 != 0 || local117.exists()) {
							@Pc(126) String local126 = local43[local79];
							if (local73 != 1 || local126.length() <= 0 || (new File(local126)).exists()) {
								(new File(local43[local79] + local66[local76])).mkdir();
								if (arg1 != null) {
									(new File(local43[local79] + local66[local76] + "/" + arg1)).mkdir();
								}
								local112 = new RandomAccessFile(local117, "rw");
								@Pc(192) int local192 = local112.read();
								local112.seek(0L);
								local112.write(local192);
								local112.seek(0L);
								local112.close();
								aHashtable1.put(arg0, local117);
								return local117;
							}
						}
					} catch (@Pc(211) Exception local211) {
						try {
							if (local112 != null) {
								local112.close();
							}
						} catch (@Pc(219) Exception local219) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
