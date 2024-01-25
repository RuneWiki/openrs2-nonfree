import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!pe")
public final class Class371 {

	@OriginalMember(owner = "loader!pe", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString146;

	@OriginalMember(owner = "loader!pe", name = "b", descriptor = "I")
	private static int anInt9449;

	@OriginalMember(owner = "loader!pe", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString147;

	@OriginalMember(owner = "loader!pe", name = "d", descriptor = "Z")
	private static boolean aBoolean739 = false;

	@OriginalMember(owner = "loader!pe", name = "e", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!pe", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/io/File;")
	public static File method7852(@OriginalArg(1) String arg0) {
		return method7854(arg0, aString146, anInt9449);
	}

	@OriginalMember(owner = "loader!pe", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method7853(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		aString146 = arg0;
		anInt9449 = arg1;
		try {
			aString147 = System.getProperty("user.home");
			if (aString147 != null) {
				aString147 = aString147 + "/";
			}
		} catch (@Pc(31) Exception local31) {
		}
		aBoolean739 = true;
		if (aString147 == null) {
			aString147 = "~/";
		}
	}

	@OriginalMember(owner = "loader!pe", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
	private static File method7854(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (!aBoolean739) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable9.get(arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(52) String[] local52 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString147, "/tmp/", "" };
		@Pc(77) String[] local77 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(85) int local85 = 0; local85 < 2; local85++) {
			for (@Pc(90) int local90 = 0; local90 < local77.length; local90++) {
				for (@Pc(100) int local100 = 0; local100 < local52.length; local100++) {
					@Pc(139) String local139 = local52[local100] + local77[local90] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(141) RandomAccessFile local141 = null;
					try {
						@Pc(146) File local146 = new File(local139);
						if (local85 != 0 || local146.exists()) {
							@Pc(158) String local158 = local52[local100];
							if (local85 != 1 || local158.length() <= 0 || (new File(local158)).exists()) {
								(new File(local52[local100] + local77[local90])).mkdir();
								if (arg1 != null) {
									(new File(local52[local100] + local77[local90] + "/" + arg1)).mkdir();
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
}
