import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!saa")
public final class Class398 {

	@OriginalMember(owner = "loader!saa", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString155;

	@OriginalMember(owner = "loader!saa", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString156;

	@OriginalMember(owner = "loader!saa", name = "e", descriptor = "I")
	private static int anInt10850;

	@OriginalMember(owner = "loader!saa", name = "d", descriptor = "Z")
	private static boolean aBoolean803 = false;

	@OriginalMember(owner = "loader!saa", name = "a", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable16 = new Hashtable(16);

	@OriginalMember(owner = "loader!saa", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;")
	public static File method9358(@OriginalArg(0) String arg0) {
		return method9359(arg0, anInt10850, aString155);
	}

	@OriginalMember(owner = "loader!saa", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;)Ljava/io/File;")
	private static File method9359(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean803) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable16.get(arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(52) String[] local52 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString156, "/tmp/", "" };
		@Pc(77) String[] local77 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(79) int local79 = 0; local79 < 2; local79++) {
			for (@Pc(84) int local84 = 0; local84 < local77.length; local84++) {
				for (@Pc(94) int local94 = 0; local94 < local52.length; local94++) {
					@Pc(129) String local129 = local52[local94] + local77[local84] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
					@Pc(131) RandomAccessFile local131 = null;
					try {
						@Pc(136) File local136 = new File(local129);
						if (local79 != 0 || local136.exists()) {
							@Pc(150) String local150 = local52[local94];
							if (local79 != 1 || local150.length() <= 0 || (new File(local150)).exists()) {
								(new File(local52[local94] + local77[local84])).mkdir();
								if (arg2 != null) {
									(new File(local52[local94] + local77[local84] + "/" + arg2)).mkdir();
								}
								local131 = new RandomAccessFile(local136, "rw");
								@Pc(214) int local214 = local131.read();
								local131.seek(0L);
								local131.write(local214);
								local131.seek(0L);
								local131.close();
								aHashtable16.put(arg0, local136);
								return local136;
							}
						}
					} catch (@Pc(233) Exception local233) {
						try {
							if (local131 != null) {
								local131.close();
							}
						} catch (@Pc(242) Exception local242) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!saa", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method9360(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		anInt10850 = arg0;
		aString155 = arg1;
		try {
			aString156 = System.getProperty("user.home");
			if (aString156 != null) {
				aString156 = aString156 + "/";
			}
		} catch (@Pc(19) Exception local19) {
		}
		if (aString156 == null) {
			aString156 = "~/";
		}
		aBoolean803 = true;
	}
}
