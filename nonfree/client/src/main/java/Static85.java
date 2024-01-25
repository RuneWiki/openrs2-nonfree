import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString10;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString11;

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString13;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString14;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString15;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	public static final int anInt1679 = 3;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable1 = new Hashtable(16);

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "J")
	public static volatile long aLong53 = 0L;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Ljava/io/File;")
	public static File method1466(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable1.get(arg0);
		if (local4 != null) {
			return local4;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString13, "/tmp/", "" };
		@Pc(66) String[] local66 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(68) int local68 = 0; local68 < 2; local68++) {
			for (@Pc(80) int local80 = 0; local80 < local66.length; local80++) {
				for (@Pc(83) int local83 = 0; local83 < local43.length; local83++) {
					@Pc(114) String local114 = local43[local83] + local66[local80] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
					@Pc(116) RandomAccessFile local116 = null;
					try {
						@Pc(121) File local121 = new File(local114);
						if (local68 != 0 || local121.exists()) {
							@Pc(133) String local133 = local43[local83];
							if (local68 != 1 || local133.length() <= 0 || (new File(local133)).exists()) {
								(new File(local43[local83] + local66[local80])).mkdir();
								if (arg2 != null) {
									(new File(local43[local83] + local66[local80] + "/" + arg2)).mkdir();
								}
								local116 = new RandomAccessFile(local121, "rw");
								@Pc(197) int local197 = local116.read();
								local116.seek(0L);
								local116.write(local197);
								local116.seek(0L);
								local116.close();
								aHashtable1.put(arg0, local121);
								return local121;
							}
						}
					} catch (@Pc(216) Exception local216) {
						try {
							if (local116 != null) {
								local116.close();
							}
						} catch (@Pc(224) Exception local224) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
