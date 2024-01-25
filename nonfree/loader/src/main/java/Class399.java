import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!md")
public final class Class399 {

	@OriginalMember(owner = "loader!md", name = "a", descriptor = "I")
	private static int anInt10842;

	@OriginalMember(owner = "loader!md", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString172;

	@OriginalMember(owner = "loader!md", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString173;

	@OriginalMember(owner = "loader!md", name = "b", descriptor = "Z")
	private static boolean aBoolean753 = false;

	@OriginalMember(owner = "loader!md", name = "c", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!md", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;)Ljava/io/File;")
	private static File method9205(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean753) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable9.get(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString173, "/tmp/", "" };
		@Pc(75) String[] local75 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(77) int local77 = 0; local77 < 2; local77++) {
			for (@Pc(90) int local90 = 0; local90 < local75.length; local90++) {
				for (@Pc(96) int local96 = 0; local96 < local50.length; local96++) {
					@Pc(131) String local131 = local50[local96] + local75[local90] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
					@Pc(133) RandomAccessFile local133 = null;
					try {
						@Pc(138) File local138 = new File(local131);
						if (local77 != 0 || local138.exists()) {
							@Pc(149) String local149 = local50[local96];
							if (local77 != 1 || local149.length() <= 0 || (new File(local149)).exists()) {
								(new File(local50[local96] + local75[local90])).mkdir();
								if (arg2 != null) {
									(new File(local50[local96] + local75[local90] + "/" + arg2)).mkdir();
								}
								local133 = new RandomAccessFile(local138, "rw");
								@Pc(214) int local214 = local133.read();
								local133.seek(0L);
								local133.write(local214);
								local133.seek(0L);
								local133.close();
								aHashtable9.put(arg0, local138);
								return local138;
							}
						}
					} catch (@Pc(233) Exception local233) {
						try {
							if (local133 != null) {
								local133.close();
							}
						} catch (@Pc(242) Exception local242) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!md", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method9206(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		anInt10842 = arg1;
		aString172 = arg0;
		try {
			aString173 = System.getProperty("user.home");
			if (aString173 != null) {
				aString173 = aString173 + "/";
			}
		} catch (@Pc(22) Exception local22) {
		}
		aBoolean753 = true;
		if (aString173 == null) {
			aString173 = "~/";
		}
	}

	@OriginalMember(owner = "loader!md", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public static File method9207(@OriginalArg(1) String arg0) {
		return method9205(arg0, anInt10842, aString172);
	}
}
