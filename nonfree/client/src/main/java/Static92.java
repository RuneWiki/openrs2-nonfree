import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString14;

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString15;

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString17;

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString18;

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString19;

	@OriginalMember(owner = "client!dj", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString20;

	@OriginalMember(owner = "client!dj", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString21;

	@OriginalMember(owner = "client!dj", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!dj", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
	public static final int anInt2161 = 3;

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable3 = new Hashtable(16);

	@OriginalMember(owner = "client!dj", name = "y", descriptor = "J")
	public static volatile long aLong49 = 0L;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Ljava/io/File;")
	public static File method1996(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable3.get(arg0);
		if (local4 != null) {
			return local4;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString21, "/tmp/", "" };
		@Pc(66) String[] local66 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(68) int local68 = 0; local68 < 2; local68++) {
			for (@Pc(71) int local71 = 0; local71 < local66.length; local71++) {
				for (@Pc(74) int local74 = 0; local74 < local43.length; local74++) {
					@Pc(105) String local105 = local43[local74] + local66[local71] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
					@Pc(107) RandomAccessFile local107 = null;
					try {
						@Pc(112) File local112 = new File(local105);
						if (local68 != 0 || local112.exists()) {
							@Pc(124) String local124 = local43[local74];
							if (local68 != 1 || local124.length() <= 0 || (new File(local124)).exists()) {
								(new File(local43[local74] + local66[local71])).mkdir();
								if (arg2 != null) {
									(new File(local43[local74] + local66[local71] + "/" + arg2)).mkdir();
								}
								local107 = new RandomAccessFile(local112, "rw");
								@Pc(188) int local188 = local107.read();
								local107.seek(0L);
								local107.write(local188);
								local107.seek(0L);
								local107.close();
								aHashtable3.put(arg0, local112);
								return local112;
							}
						}
					} catch (@Pc(207) Exception local207) {
						try {
							if (local107 != null) {
								local107.close();
							}
						} catch (@Pc(215) Exception local215) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
