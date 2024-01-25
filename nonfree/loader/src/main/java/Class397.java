import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!bba")
public final class Class397 {

	@OriginalMember(owner = "loader!bba", name = "a", descriptor = "I")
	private static int anInt10640;

	@OriginalMember(owner = "loader!bba", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString128;

	@OriginalMember(owner = "loader!bba", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString129;

	@OriginalMember(owner = "loader!bba", name = "d", descriptor = "Z")
	private static boolean aBoolean805 = false;

	@OriginalMember(owner = "loader!bba", name = "c", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable8 = new Hashtable(16);

	@OriginalMember(owner = "loader!bba", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public static File method9006(@OriginalArg(1) String arg0) {
		return method9008(anInt10640, aString128, arg0);
	}

	@OriginalMember(owner = "loader!bba", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method9007(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		aString128 = arg1;
		anInt10640 = arg0;
		try {
			aString129 = System.getProperty("user.home");
			if (aString129 != null) {
				aString129 = aString129 + "/";
			}
		} catch (@Pc(21) Exception local21) {
		}
		if (aString129 == null) {
			aString129 = "~/";
		}
		aBoolean805 = true;
	}

	@OriginalMember(owner = "loader!bba", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	private static File method9008(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean805) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable8.get(arg2);
		if (local11 != null) {
			return local11;
		}
		@Pc(52) String[] local52 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString129, "/tmp/", "" };
		@Pc(77) String[] local77 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(79) int local79 = 0; local79 < 2; local79++) {
			for (@Pc(84) int local84 = 0; local84 < local77.length; local84++) {
				for (@Pc(90) int local90 = 0; local90 < local52.length; local90++) {
					@Pc(129) String local129 = local52[local90] + local77[local84] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(131) RandomAccessFile local131 = null;
					try {
						@Pc(136) File local136 = new File(local129);
						if (local79 != 0 || local136.exists()) {
							@Pc(150) String local150 = local52[local90];
							if (local79 != 1 || local150.length() <= 0 || (new File(local150)).exists()) {
								(new File(local52[local90] + local77[local84])).mkdir();
								if (arg1 != null) {
									(new File(local52[local90] + local77[local84] + "/" + arg1)).mkdir();
								}
								local131 = new RandomAccessFile(local136, "rw");
								@Pc(214) int local214 = local131.read();
								local131.seek(0L);
								local131.write(local214);
								local131.seek(0L);
								local131.close();
								aHashtable8.put(arg2, local136);
								return local136;
							}
						}
					} catch (@Pc(233) Exception local233) {
						try {
							if (local131 != null) {
								local131.close();
							}
						} catch (@Pc(243) Exception local243) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
