import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!rda")
public final class Class387 {

	@OriginalMember(owner = "loader!rda", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString129;

	@OriginalMember(owner = "loader!rda", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString130;

	@OriginalMember(owner = "loader!rda", name = "b", descriptor = "I")
	private static int anInt10506;

	@OriginalMember(owner = "loader!rda", name = "c", descriptor = "Z")
	private static boolean aBoolean771 = false;

	@OriginalMember(owner = "loader!rda", name = "e", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!rda", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method8947(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		aString129 = arg1;
		anInt10506 = arg0;
		try {
			aString130 = System.getProperty("user.home");
			if (aString130 != null) {
				aString130 = aString130 + "/";
			}
		} catch (@Pc(19) Exception local19) {
		}
		aBoolean771 = true;
		if (aString130 == null) {
			aString130 = "~/";
		}
	}

	@OriginalMember(owner = "loader!rda", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method8948(@OriginalArg(0) String arg0) {
		return method8949(aString129, arg0, anInt10506);
	}

	@OriginalMember(owner = "loader!rda", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
	private static File method8949(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (!aBoolean771) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable9.get(arg1);
		if (local11 != null) {
			return local11;
		}
		@Pc(57) String[] local57 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString130, "/tmp/", "" };
		@Pc(82) String[] local82 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(84) int local84 = 0; local84 < 2; local84++) {
			for (@Pc(91) int local91 = 0; local91 < local82.length; local91++) {
				for (@Pc(101) int local101 = 0; local101 < local57.length; local101++) {
					@Pc(135) String local135 = local57[local101] + local82[local91] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(137) RandomAccessFile local137 = null;
					try {
						@Pc(142) File local142 = new File(local135);
						if (local84 != 0 || local142.exists()) {
							@Pc(155) String local155 = local57[local101];
							if (local84 != 1 || local155.length() <= 0 || (new File(local155)).exists()) {
								(new File(local57[local101] + local82[local91])).mkdir();
								if (arg0 != null) {
									(new File(local57[local101] + local82[local91] + "/" + arg0)).mkdir();
								}
								local137 = new RandomAccessFile(local142, "rw");
								@Pc(220) int local220 = local137.read();
								local137.seek(0L);
								local137.write(local220);
								local137.seek(0L);
								local137.close();
								aHashtable9.put(arg1, local142);
								return local142;
							}
						}
					} catch (@Pc(239) Exception local239) {
						try {
							if (local137 != null) {
								local137.close();
							}
						} catch (@Pc(247) Exception local247) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
