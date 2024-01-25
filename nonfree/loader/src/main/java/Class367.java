import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ae")
public final class Class367 {

	@OriginalMember(owner = "loader!ae", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString102;

	@OriginalMember(owner = "loader!ae", name = "e", descriptor = "I")
	private static int anInt9692;

	@OriginalMember(owner = "loader!ae", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString103;

	@OriginalMember(owner = "loader!ae", name = "b", descriptor = "Z")
	private static boolean aBoolean717 = false;

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable8 = new Hashtable(16);

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method7944(@OriginalArg(0) String arg0) {
		return method7946(anInt9692, aString103, arg0);
	}

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method7945(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		aString103 = arg0;
		anInt9692 = arg1;
		try {
			aString102 = System.getProperty("user.home");
			if (aString102 != null) {
				aString102 = aString102 + "/";
			}
		} catch (@Pc(19) Exception local19) {
		}
		aBoolean717 = true;
		if (aString102 == null) {
			aString102 = "~/";
		}
	}

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	private static File method7946(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean717) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable8.get(arg2);
		if (local12 != null) {
			return local12;
		}
		@Pc(60) String[] local60 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString102, "/tmp/", "" };
		@Pc(85) String[] local85 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(87) int local87 = 0; local87 < 2; local87++) {
			for (@Pc(94) int local94 = 0; local94 < local85.length; local94++) {
				for (@Pc(100) int local100 = 0; local100 < local60.length; local100++) {
					@Pc(135) String local135 = local60[local100] + local85[local94] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(137) RandomAccessFile local137 = null;
					try {
						@Pc(142) File local142 = new File(local135);
						if (local87 != 0 || local142.exists()) {
							@Pc(153) String local153 = local60[local100];
							if (local87 != 1 || local153.length() <= 0 || (new File(local153)).exists()) {
								(new File(local60[local100] + local85[local94])).mkdir();
								if (arg1 != null) {
									(new File(local60[local100] + local85[local94] + "/" + arg1)).mkdir();
								}
								local137 = new RandomAccessFile(local142, "rw");
								@Pc(219) int local219 = local137.read();
								local137.seek(0L);
								local137.write(local219);
								local137.seek(0L);
								local137.close();
								aHashtable8.put(arg2, local142);
								return local142;
							}
						}
					} catch (@Pc(238) Exception local238) {
						try {
							if (local137 != null) {
								local137.close();
							}
						} catch (@Pc(248) Exception local248) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
