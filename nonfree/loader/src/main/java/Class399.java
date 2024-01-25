import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!pda")
public final class Class399 {

	@OriginalMember(owner = "loader!pda", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString135;

	@OriginalMember(owner = "loader!pda", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString136;

	@OriginalMember(owner = "loader!pda", name = "e", descriptor = "I")
	private static int anInt11234;

	@OriginalMember(owner = "loader!pda", name = "a", descriptor = "Z")
	private static boolean aBoolean772 = false;

	@OriginalMember(owner = "loader!pda", name = "c", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable10 = new Hashtable(16);

	@OriginalMember(owner = "loader!pda", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
	private static File method9350(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (!aBoolean772) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable10.get(arg1);
		if (local11 != null) {
			return local11;
		}
		@Pc(59) String[] local59 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString135, "/tmp/", "" };
		@Pc(84) String[] local84 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(86) int local86 = 0; local86 < 2; local86++) {
			for (@Pc(93) int local93 = 0; local93 < local84.length; local93++) {
				for (@Pc(99) int local99 = 0; local99 < local59.length; local99++) {
					@Pc(137) String local137 = local59[local99] + local84[local93] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(139) RandomAccessFile local139 = null;
					try {
						@Pc(144) File local144 = new File(local137);
						if (local86 != 0 || local144.exists()) {
							@Pc(157) String local157 = local59[local99];
							if (local86 != 1 || local157.length() <= 0 || (new File(local157)).exists()) {
								(new File(local59[local99] + local84[local93])).mkdir();
								if (arg0 != null) {
									(new File(local59[local99] + local84[local93] + "/" + arg0)).mkdir();
								}
								local139 = new RandomAccessFile(local144, "rw");
								@Pc(222) int local222 = local139.read();
								local139.seek(0L);
								local139.write(local222);
								local139.seek(0L);
								local139.close();
								aHashtable10.put(arg1, local144);
								return local144;
							}
						}
					} catch (@Pc(241) Exception local241) {
						try {
							if (local139 != null) {
								local139.close();
							}
						} catch (@Pc(250) Exception local250) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!pda", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method9351(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		anInt11234 = arg1;
		aString136 = arg0;
		try {
			aString135 = System.getProperty("user.home");
			if (aString135 != null) {
				aString135 = aString135 + "/";
			}
		} catch (@Pc(31) Exception local31) {
		}
		if (aString135 == null) {
			aString135 = "~/";
		}
		aBoolean772 = true;
	}

	@OriginalMember(owner = "loader!pda", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method9352(@OriginalArg(0) String arg0) {
		return method9350(aString136, arg0, anInt11234);
	}
}
