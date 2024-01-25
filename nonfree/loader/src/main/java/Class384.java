import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!gf")
public final class Class384 {

	@OriginalMember(owner = "loader!gf", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString121;

	@OriginalMember(owner = "loader!gf", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString122;

	@OriginalMember(owner = "loader!gf", name = "e", descriptor = "I")
	private static int anInt10673;

	@OriginalMember(owner = "loader!gf", name = "d", descriptor = "Z")
	private static boolean aBoolean765 = false;

	@OriginalMember(owner = "loader!gf", name = "c", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!gf", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method9065(@OriginalArg(0) String arg0) {
		return method9066(arg0, anInt10673, aString121);
	}

	@OriginalMember(owner = "loader!gf", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Ljava/io/File;")
	private static File method9066(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean765) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable9.get(arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(53) String[] local53 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString122, "/tmp/", "" };
		@Pc(78) String[] local78 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(80) int local80 = 0; local80 < 2; local80++) {
			for (@Pc(87) int local87 = 0; local87 < local78.length; local87++) {
				for (@Pc(93) int local93 = 0; local93 < local53.length; local93++) {
					@Pc(131) String local131 = local53[local93] + local78[local87] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
					@Pc(133) RandomAccessFile local133 = null;
					try {
						@Pc(138) File local138 = new File(local131);
						if (local80 != 0 || local138.exists()) {
							@Pc(152) String local152 = local53[local93];
							if (local80 != 1 || local152.length() <= 0 || (new File(local152)).exists()) {
								(new File(local53[local93] + local78[local87])).mkdir();
								if (arg2 != null) {
									(new File(local53[local93] + local78[local87] + "/" + arg2)).mkdir();
								}
								local133 = new RandomAccessFile(local138, "rw");
								@Pc(220) int local220 = local133.read();
								local133.seek(0L);
								local133.write(local220);
								local133.seek(0L);
								local133.close();
								aHashtable9.put(arg0, local138);
								return local138;
							}
						}
					} catch (@Pc(239) Exception local239) {
						try {
							if (local133 != null) {
								local133.close();
							}
						} catch (@Pc(248) Exception local248) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!gf", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method9067(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		anInt10673 = arg0;
		aString121 = arg1;
		try {
			aString122 = System.getProperty("user.home");
			if (aString122 != null) {
				aString122 = aString122 + "/";
			}
		} catch (@Pc(24) Exception local24) {
		}
		if (aString122 == null) {
			aString122 = "~/";
		}
		aBoolean765 = true;
	}
}
