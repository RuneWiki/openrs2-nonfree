import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!dc")
public final class Class387 {

	@OriginalMember(owner = "loader!dc", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString132;

	@OriginalMember(owner = "loader!dc", name = "d", descriptor = "I")
	private static int anInt10772;

	@OriginalMember(owner = "loader!dc", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString133;

	@OriginalMember(owner = "loader!dc", name = "b", descriptor = "Z")
	private static boolean aBoolean735 = false;

	@OriginalMember(owner = "loader!dc", name = "c", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!dc", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	public static void method9052(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		anInt10772 = arg1;
		aString133 = arg0;
		try {
			aString132 = System.getProperty("user.home");
			if (aString132 != null) {
				aString132 = aString132 + "/";
			}
		} catch (@Pc(20) Exception local20) {
		}
		if (aString132 == null) {
			aString132 = "~/";
		}
		aBoolean735 = true;
	}

	@OriginalMember(owner = "loader!dc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
	private static File method9053(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (!aBoolean735) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable9.get(arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(60) String[] local60 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString132, "/tmp/", "" };
		@Pc(85) String[] local85 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(87) int local87 = 0; local87 < 2; local87++) {
			for (@Pc(94) int local94 = 0; local94 < local85.length; local94++) {
				for (@Pc(104) int local104 = 0; local104 < local60.length; local104++) {
					@Pc(139) String local139 = local60[local104] + local85[local94] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(141) RandomAccessFile local141 = null;
					try {
						@Pc(146) File local146 = new File(local139);
						if (local87 != 0 || local146.exists()) {
							@Pc(158) String local158 = local60[local104];
							if (local87 != 1 || local158.length() <= 0 || (new File(local158)).exists()) {
								(new File(local60[local104] + local85[local94])).mkdir();
								if (arg1 != null) {
									(new File(local60[local104] + local85[local94] + "/" + arg1)).mkdir();
								}
								local141 = new RandomAccessFile(local146, "rw");
								@Pc(224) int local224 = local141.read();
								local141.seek(0L);
								local141.write(local224);
								local141.seek(0L);
								local141.close();
								aHashtable9.put(arg0, local146);
								return local146;
							}
						}
					} catch (@Pc(243) Exception local243) {
						try {
							if (local141 != null) {
								local141.close();
							}
						} catch (@Pc(252) Exception local252) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!dc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method9054(@OriginalArg(0) String arg0) {
		return method9053(arg0, aString133, anInt10772);
	}
}
