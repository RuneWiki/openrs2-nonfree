import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!fi")
public final class Class382 {

	@OriginalMember(owner = "loader!fi", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString122;

	@OriginalMember(owner = "loader!fi", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString123;

	@OriginalMember(owner = "loader!fi", name = "e", descriptor = "I")
	private static int anInt10302;

	@OriginalMember(owner = "loader!fi", name = "d", descriptor = "Z")
	private static boolean aBoolean761 = false;

	@OriginalMember(owner = "loader!fi", name = "c", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!fi", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method8610(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		aString123 = arg0;
		anInt10302 = arg1;
		try {
			aString122 = System.getProperty("user.home");
			if (aString122 != null) {
				aString122 = aString122 + "/";
			}
		} catch (@Pc(26) Exception local26) {
		}
		aBoolean761 = true;
		if (aString122 == null) {
			aString122 = "~/";
		}
	}

	@OriginalMember(owner = "loader!fi", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	private static File method8611(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean761) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable9.get(arg2);
		if (local11 != null) {
			return local11;
		}
		@Pc(51) String[] local51 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString122, "/tmp/", "" };
		@Pc(81) String[] local81 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(83) int local83 = 0; local83 < 2; local83++) {
			for (@Pc(88) int local88 = 0; local88 < local81.length; local88++) {
				for (@Pc(98) int local98 = 0; local98 < local51.length; local98++) {
					@Pc(137) String local137 = local51[local98] + local81[local88] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(139) RandomAccessFile local139 = null;
					try {
						@Pc(144) File local144 = new File(local137);
						if (local83 != 0 || local144.exists()) {
							@Pc(157) String local157 = local51[local98];
							if (local83 != 1 || local157.length() <= 0 || (new File(local157)).exists()) {
								(new File(local51[local98] + local81[local88])).mkdir();
								if (arg1 != null) {
									(new File(local51[local98] + local81[local88] + "/" + arg1)).mkdir();
								}
								local139 = new RandomAccessFile(local144, "rw");
								@Pc(221) int local221 = local139.read();
								local139.seek(0L);
								local139.write(local221);
								local139.seek(0L);
								local139.close();
								aHashtable9.put(arg2, local144);
								return local144;
							}
						}
					} catch (@Pc(240) Exception local240) {
						try {
							if (local139 != null) {
								local139.close();
							}
						} catch (@Pc(249) Exception local249) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!fi", name = "a", descriptor = "(BLjava/lang/String;)Ljava/io/File;")
	public static File method8612(@OriginalArg(1) String arg0) {
		return method8611(anInt10302, aString123, arg0);
	}
}
