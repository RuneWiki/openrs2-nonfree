import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!et", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString18;

	@OriginalMember(owner = "client!et", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString19;

	@OriginalMember(owner = "client!et", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString21;

	@OriginalMember(owner = "client!et", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString22;

	@OriginalMember(owner = "client!et", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString23;

	@OriginalMember(owner = "client!et", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString24;

	@OriginalMember(owner = "client!et", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString25;

	@OriginalMember(owner = "client!et", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!et", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!et", name = "k", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable1 = new Hashtable(16);

	@OriginalMember(owner = "client!et", name = "r", descriptor = "I")
	public static final int anInt1987 = 3;

	@OriginalMember(owner = "client!et", name = "y", descriptor = "J")
	public static volatile long aLong70 = 0L;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Ljava/io/File;")
	public static File method1748(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable1.get(arg0);
		if (local4 != null) {
			return local4;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString18, "/tmp/", "" };
		@Pc(66) String[] local66 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(68) int local68 = 0; local68 < 2; local68++) {
			for (@Pc(71) int local71 = 0; local71 < local66.length; local71++) {
				for (@Pc(74) int local74 = 0; local74 < local43.length; local74++) {
					@Pc(105) String local105 = local43[local74] + local66[local71] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
					@Pc(107) RandomAccessFile local107 = null;
					try {
						@Pc(112) File local112 = new File(local105);
						if (local68 != 0 || local112.exists()) {
							@Pc(121) String local121 = local43[local74];
							if (local68 != 1 || local121.length() <= 0 || (new File(local121)).exists()) {
								(new File(local43[local74] + local66[local71])).mkdir();
								if (arg2 != null) {
									(new File(local43[local74] + local66[local71] + "/" + arg2)).mkdir();
								}
								local107 = new RandomAccessFile(local112, "rw");
								@Pc(185) int local185 = local107.read();
								local107.seek(0L);
								local107.write(local185);
								local107.seek(0L);
								local107.close();
								aHashtable1.put(arg0, local112);
								return local112;
							}
						}
					} catch (@Pc(204) Exception local204) {
						try {
							if (local107 != null) {
								local107.close();
							}
						} catch (@Pc(212) Exception local212) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
