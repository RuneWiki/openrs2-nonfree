import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!at")
public final class Class401 {

	@OriginalMember(owner = "loader!at", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString125;

	@OriginalMember(owner = "loader!at", name = "a", descriptor = "I")
	private static int anInt11219;

	@OriginalMember(owner = "loader!at", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString126;

	@OriginalMember(owner = "loader!at", name = "e", descriptor = "Z")
	private static boolean aBoolean786 = false;

	@OriginalMember(owner = "loader!at", name = "c", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable8 = new Hashtable(16);

	@OriginalMember(owner = "loader!at", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
	private static File method9519(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (!aBoolean786) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable8.get(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(51) String[] local51 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString126, "/tmp/", "" };
		@Pc(76) String[] local76 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(78) int local78 = 0; local78 < 2; local78++) {
			for (@Pc(83) int local83 = 0; local83 < local76.length; local83++) {
				for (@Pc(89) int local89 = 0; local89 < local51.length; local89++) {
					@Pc(123) String local123 = local51[local89] + local76[local83] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(125) RandomAccessFile local125 = null;
					try {
						@Pc(130) File local130 = new File(local123);
						if (local78 != 0 || local130.exists()) {
							@Pc(141) String local141 = local51[local89];
							if (local78 != 1 || local141.length() <= 0 || (new File(local141)).exists()) {
								(new File(local51[local89] + local76[local83])).mkdir();
								if (arg1 != null) {
									(new File(local51[local89] + local76[local83] + "/" + arg1)).mkdir();
								}
								local125 = new RandomAccessFile(local130, "rw");
								@Pc(204) int local204 = local125.read();
								local125.seek(0L);
								local125.write(local204);
								local125.seek(0L);
								local125.close();
								aHashtable8.put(arg0, local130);
								return local130;
							}
						}
					} catch (@Pc(223) Exception local223) {
						try {
							if (local125 != null) {
								local125.close();
							}
						} catch (@Pc(231) Exception local231) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!at", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method9520(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		anInt11219 = arg0;
		aString125 = arg1;
		try {
			aString126 = System.getProperty("user.home");
			if (aString126 != null) {
				aString126 = aString126 + "/";
			}
		} catch (@Pc(25) Exception local25) {
		}
		aBoolean786 = true;
		if (aString126 == null) {
			aString126 = "~/";
		}
	}

	@OriginalMember(owner = "loader!at", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method9521(@OriginalArg(0) String arg0) {
		return method9519(arg0, aString125, anInt11219);
	}
}
