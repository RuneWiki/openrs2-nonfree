import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!cl")
public final class Class369 {

	@OriginalMember(owner = "loader!cl", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString245;

	@OriginalMember(owner = "loader!cl", name = "d", descriptor = "I")
	private static int anInt10613;

	@OriginalMember(owner = "loader!cl", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString246;

	@OriginalMember(owner = "loader!cl", name = "e", descriptor = "Z")
	private static boolean aBoolean722 = false;

	@OriginalMember(owner = "loader!cl", name = "c", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!cl", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public static File method8296(@OriginalArg(1) String arg0) {
		return method8297(arg0, aString246, anInt10613);
	}

	@OriginalMember(owner = "loader!cl", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
	private static File method8297(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (!aBoolean722) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable9.get(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString245, "/tmp/", "" };
		@Pc(83) String[] local83 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(85) int local85 = 0; local85 < 2; local85++) {
			for (@Pc(90) int local90 = 0; local90 < local83.length; local90++) {
				for (@Pc(96) int local96 = 0; local96 < local50.length; local96++) {
					@Pc(131) String local131 = local50[local96] + local83[local90] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(133) RandomAccessFile local133 = null;
					try {
						@Pc(138) File local138 = new File(local131);
						if (local85 != 0 || local138.exists()) {
							@Pc(149) String local149 = local50[local96];
							if (local85 != 1 || local149.length() <= 0 || (new File(local149)).exists()) {
								(new File(local50[local96] + local83[local90])).mkdir();
								if (arg1 != null) {
									(new File(local50[local96] + local83[local90] + "/" + arg1)).mkdir();
								}
								local133 = new RandomAccessFile(local138, "rw");
								@Pc(217) int local217 = local133.read();
								local133.seek(0L);
								local133.write(local217);
								local133.seek(0L);
								local133.close();
								aHashtable9.put(arg0, local138);
								return local138;
							}
						}
					} catch (@Pc(236) Exception local236) {
						try {
							if (local133 != null) {
								local133.close();
							}
						} catch (@Pc(245) Exception local245) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!cl", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	public static void method8298(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		aString246 = arg0;
		anInt10613 = arg1;
		try {
			aString245 = System.getProperty("user.home");
			if (aString245 != null) {
				aString245 = aString245 + "/";
			}
		} catch (@Pc(24) Exception local24) {
		}
		aBoolean722 = true;
		if (aString245 == null) {
			aString245 = "~/";
		}
	}
}
