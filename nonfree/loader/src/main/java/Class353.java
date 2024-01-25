import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!wca")
public final class Class353 {

	@OriginalMember(owner = "loader!wca", name = "a", descriptor = "I")
	private static int anInt9897;

	@OriginalMember(owner = "loader!wca", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString122;

	@OriginalMember(owner = "loader!wca", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString123;

	@OriginalMember(owner = "loader!wca", name = "d", descriptor = "Z")
	private static boolean aBoolean725 = false;

	@OriginalMember(owner = "loader!wca", name = "b", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!wca", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method8225(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		anInt9897 = arg1;
		aString123 = arg0;
		try {
			aString122 = System.getProperty("user.home");
			if (aString122 != null) {
				aString122 = aString122 + "/";
			}
		} catch (@Pc(21) Exception local21) {
		}
		aBoolean725 = true;
		if (aString122 == null) {
			aString122 = "~/";
		}
	}

	@OriginalMember(owner = "loader!wca", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;")
	public static File method8226(@OriginalArg(0) String arg0) {
		return method8227(arg0, aString123, anInt9897);
	}

	@OriginalMember(owner = "loader!wca", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
	private static File method8227(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		if (!aBoolean725) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable9.get(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(52) String[] local52 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString122, "/tmp/", "" };
		@Pc(77) String[] local77 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(79) int local79 = 0; local79 < 2; local79++) {
			for (@Pc(86) int local86 = 0; local86 < local77.length; local86++) {
				for (@Pc(92) int local92 = 0; local92 < local52.length; local92++) {
					@Pc(130) String local130 = local52[local92] + local77[local86] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(132) RandomAccessFile local132 = null;
					try {
						@Pc(137) File local137 = new File(local130);
						if (local79 != 0 || local137.exists()) {
							@Pc(149) String local149 = local52[local92];
							if (local79 != 1 || local149.length() <= 0 || (new File(local149)).exists()) {
								(new File(local52[local92] + local77[local86])).mkdir();
								if (arg1 != null) {
									(new File(local52[local92] + local77[local86] + "/" + arg1)).mkdir();
								}
								local132 = new RandomAccessFile(local137, "rw");
								@Pc(214) int local214 = local132.read();
								local132.seek(0L);
								local132.write(local214);
								local132.seek(0L);
								local132.close();
								aHashtable9.put(arg0, local137);
								return local137;
							}
						}
					} catch (@Pc(233) Exception local233) {
						try {
							if (local132 != null) {
								local132.close();
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
