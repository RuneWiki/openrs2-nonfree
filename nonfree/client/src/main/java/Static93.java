import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString21;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString22;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
	private static int anInt1840;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "Z")
	private static boolean aBoolean126 = false;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
	public static File method1522(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (!aBoolean126) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable2.get(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString21, "/tmp/", "" };
		@Pc(81) String[] local81 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(83) int local83 = 0; local83 < 2; local83++) {
			for (@Pc(86) int local86 = 0; local86 < local81.length; local86++) {
				for (@Pc(89) int local89 = 0; local89 < local50.length; local89++) {
					@Pc(120) String local120 = local50[local89] + local81[local86] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(122) RandomAccessFile local122 = null;
					try {
						@Pc(127) File local127 = new File(local120);
						if (local83 != 0 || local127.exists()) {
							@Pc(139) String local139 = local50[local89];
							if (local83 != 1 || local139.length() <= 0 || (new File(local139)).exists()) {
								(new File(local50[local89] + local81[local86])).mkdir();
								if (arg1 != null) {
									(new File(local50[local89] + local81[local86] + "/" + arg1)).mkdir();
								}
								local122 = new RandomAccessFile(local127, "rw");
								@Pc(202) int local202 = local122.read();
								local122.seek(0L);
								local122.write(local202);
								local122.seek(0L);
								local122.close();
								aHashtable2.put(arg0, local127);
								return local127;
							}
						}
					} catch (@Pc(221) Exception local221) {
						try {
							if (local122 != null) {
								local122.close();
							}
						} catch (@Pc(229) Exception local229) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method1523(@OriginalArg(0) String arg0) {
		return method1522(arg0, aString22, anInt1840);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	public static void method1524(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		aString22 = arg0;
		anInt1840 = arg1;
		try {
			aString21 = System.getProperty("user.home");
			if (aString21 != null) {
				aString21 = aString21 + "/";
			}
		} catch (@Pc(19) Exception local19) {
		}
		if (aString21 == null) {
			aString21 = "~/";
		}
		aBoolean126 = true;
	}
}
