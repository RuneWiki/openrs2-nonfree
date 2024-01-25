import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!st")
public final class Class329 {

	@OriginalMember(owner = "loader!st", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString91;

	@OriginalMember(owner = "loader!st", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString92;

	@OriginalMember(owner = "loader!st", name = "e", descriptor = "I")
	private static int anInt9503;

	@OriginalMember(owner = "loader!st", name = "b", descriptor = "Z")
	private static boolean aBoolean695 = false;

	@OriginalMember(owner = "loader!st", name = "a", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!st", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method7850(@OriginalArg(0) String arg0) {
		return method7852(arg0, aString92, anInt9503);
	}

	@OriginalMember(owner = "loader!st", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method7851(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		aString92 = arg1;
		anInt9503 = arg0;
		try {
			aString91 = System.getProperty("user.home");
			if (aString91 != null) {
				aString91 = aString91 + "/";
			}
		} catch (@Pc(27) Exception local27) {
		}
		aBoolean695 = true;
		if (aString91 == null) {
			aString91 = "~/";
		}
	}

	@OriginalMember(owner = "loader!st", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
	private static File method7852(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (!aBoolean695) {
			throw new RuntimeException("ClientDiskCache not inited!");
		}
		@Pc(11) File local11 = (File) aHashtable9.get(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString91, "/tmp/", "" };
		@Pc(83) String[] local83 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(85) int local85 = 0; local85 < 2; local85++) {
			for (@Pc(92) int local92 = 0; local92 < local83.length; local92++) {
				for (@Pc(98) int local98 = 0; local98 < local50.length; local98++) {
					@Pc(132) String local132 = local50[local98] + local83[local92] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(134) RandomAccessFile local134 = null;
					try {
						@Pc(139) File local139 = new File(local132);
						if (local85 != 0 || local139.exists()) {
							@Pc(150) String local150 = local50[local98];
							if (local85 != 1 || local150.length() <= 0 || (new File(local150)).exists()) {
								(new File(local50[local98] + local83[local92])).mkdir();
								if (arg1 != null) {
									(new File(local50[local98] + local83[local92] + "/" + arg1)).mkdir();
								}
								local134 = new RandomAccessFile(local139, "rw");
								@Pc(217) int local217 = local134.read();
								local134.seek(0L);
								local134.write(local217);
								local134.seek(0L);
								local134.close();
								aHashtable9.put(arg0, local139);
								return local139;
							}
						}
					} catch (@Pc(236) Exception local236) {
						System.out.println("Unable to open/write: " + local132);
						try {
							if (local134 != null) {
								local134.close();
							}
						} catch (@Pc(256) Exception local256) {
						}
					}
				}
			}
		}
		throw new RuntimeException("Fatal - could not find ANY location for file: " + arg0);
	}
}
