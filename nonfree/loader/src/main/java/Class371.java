import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!nea")
public final class Class371 {

	@OriginalMember(owner = "loader!nea", name = "b", descriptor = "I")
	private static int anInt9662;

	@OriginalMember(owner = "loader!nea", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString161;

	@OriginalMember(owner = "loader!nea", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString162;

	@OriginalMember(owner = "loader!nea", name = "d", descriptor = "Z")
	private static boolean aBoolean815 = false;

	@OriginalMember(owner = "loader!nea", name = "e", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!nea", name = "a", descriptor = "(BLjava/lang/String;)Ljava/io/File;")
	public static File method7772(@OriginalArg(1) String arg0) {
		return method7774(anInt9662, aString161, arg0);
	}

	@OriginalMember(owner = "loader!nea", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method7773(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		anInt9662 = arg1;
		aString161 = arg0;
		try {
			aString162 = System.getProperty("user.home");
			if (aString162 != null) {
				aString162 = aString162 + "/";
			}
		} catch (@Pc(19) Exception local19) {
		}
		aBoolean815 = true;
		if (aString162 == null) {
			aString162 = "~/";
		}
	}

	@OriginalMember(owner = "loader!nea", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	private static File method7774(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean815) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable9.get(arg2);
		if (local12 != null) {
			return local12;
		}
		@Pc(52) String[] local52 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString162, "/tmp/", "" };
		@Pc(77) String[] local77 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(79) int local79 = 0; local79 < 2; local79++) {
			for (@Pc(84) int local84 = 0; local84 < local77.length; local84++) {
				for (@Pc(90) int local90 = 0; local90 < local52.length; local90++) {
					@Pc(124) String local124 = local52[local90] + local77[local84] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(126) RandomAccessFile local126 = null;
					try {
						@Pc(131) File local131 = new File(local124);
						if (local79 != 0 || local131.exists()) {
							@Pc(145) String local145 = local52[local90];
							if (local79 != 1 || local145.length() <= 0 || (new File(local145)).exists()) {
								(new File(local52[local90] + local77[local84])).mkdir();
								if (arg1 != null) {
									(new File(local52[local90] + local77[local84] + "/" + arg1)).mkdir();
								}
								local126 = new RandomAccessFile(local131, "rw");
								@Pc(212) int local212 = local126.read();
								local126.seek(0L);
								local126.write(local212);
								local126.seek(0L);
								local126.close();
								aHashtable9.put(arg2, local131);
								return local131;
							}
						}
					} catch (@Pc(231) Exception local231) {
						try {
							if (local126 != null) {
								local126.close();
							}
						} catch (@Pc(241) Exception local241) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
