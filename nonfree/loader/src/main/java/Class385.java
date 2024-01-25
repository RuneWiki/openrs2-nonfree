import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!en")
public final class Class385 {

	@OriginalMember(owner = "loader!en", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString118;

	@OriginalMember(owner = "loader!en", name = "e", descriptor = "I")
	private static int anInt10565;

	@OriginalMember(owner = "loader!en", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString119;

	@OriginalMember(owner = "loader!en", name = "c", descriptor = "Z")
	private static boolean aBoolean890 = false;

	@OriginalMember(owner = "loader!en", name = "b", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable15 = new Hashtable(16);

	@OriginalMember(owner = "loader!en", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method8685(@OriginalArg(0) String arg0) {
		return method8687(aString119, arg0, anInt10565);
	}

	@OriginalMember(owner = "loader!en", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	public static void method8686(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		anInt10565 = arg1;
		aString119 = arg0;
		try {
			aString118 = System.getProperty("user.home");
			if (aString118 != null) {
				aString118 = aString118 + "/";
			}
		} catch (@Pc(23) Exception local23) {
		}
		if (aString118 == null) {
			aString118 = "~/";
		}
		aBoolean890 = true;
	}

	@OriginalMember(owner = "loader!en", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;I)Ljava/io/File;")
	private static File method8687(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (!aBoolean890) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable15.get(arg1);
		if (local12 != null) {
			return local12;
		}
		@Pc(53) String[] local53 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString118, "/tmp/", "" };
		@Pc(86) String[] local86 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(88) int local88 = 0; local88 < 2; local88++) {
			for (@Pc(93) int local93 = 0; local93 < local86.length; local93++) {
				for (@Pc(103) int local103 = 0; local103 < local53.length; local103++) {
					@Pc(138) String local138 = local53[local103] + local86[local93] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(140) RandomAccessFile local140 = null;
					try {
						@Pc(145) File local145 = new File(local138);
						if (local88 != 0 || local145.exists()) {
							@Pc(159) String local159 = local53[local103];
							if (local88 != 1 || local159.length() <= 0 || (new File(local159)).exists()) {
								(new File(local53[local103] + local86[local93])).mkdir();
								if (arg0 != null) {
									(new File(local53[local103] + local86[local93] + "/" + arg0)).mkdir();
								}
								local140 = new RandomAccessFile(local145, "rw");
								@Pc(224) int local224 = local140.read();
								local140.seek(0L);
								local140.write(local224);
								local140.seek(0L);
								local140.close();
								aHashtable15.put(arg1, local145);
								return local145;
							}
						}
					} catch (@Pc(243) Exception local243) {
						try {
							if (local140 != null) {
								local140.close();
							}
						} catch (@Pc(252) Exception local252) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
