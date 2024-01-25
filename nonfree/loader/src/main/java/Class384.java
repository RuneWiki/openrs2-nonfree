import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!kv")
public final class Class384 {

	@OriginalMember(owner = "loader!kv", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString124;

	@OriginalMember(owner = "loader!kv", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString125;

	@OriginalMember(owner = "loader!kv", name = "c", descriptor = "I")
	private static int anInt10391;

	@OriginalMember(owner = "loader!kv", name = "e", descriptor = "Z")
	private static boolean aBoolean752 = false;

	@OriginalMember(owner = "loader!kv", name = "a", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!kv", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method8666(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		anInt10391 = arg1;
		aString124 = arg0;
		try {
			aString125 = System.getProperty("user.home");
			if (aString125 != null) {
				aString125 = aString125 + "/";
			}
		} catch (@Pc(23) Exception local23) {
		}
		if (aString125 == null) {
			aString125 = "~/";
		}
		aBoolean752 = true;
	}

	@OriginalMember(owner = "loader!kv", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;")
	public static File method8667(@OriginalArg(0) String arg0) {
		return method8668(aString124, anInt10391, arg0);
	}

	@OriginalMember(owner = "loader!kv", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Ljava/io/File;")
	private static File method8668(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean752) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable9.get(arg2);
		if (local12 != null) {
			return local12;
		}
		@Pc(52) String[] local52 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString125, "/tmp/", "" };
		@Pc(77) String[] local77 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(85) int local85 = 0; local85 < 2; local85++) {
			for (@Pc(92) int local92 = 0; local92 < local77.length; local92++) {
				for (@Pc(102) int local102 = 0; local102 < local52.length; local102++) {
					@Pc(137) String local137 = local52[local102] + local77[local92] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					@Pc(139) RandomAccessFile local139 = null;
					try {
						@Pc(144) File local144 = new File(local137);
						if (local85 != 0 || local144.exists()) {
							@Pc(158) String local158 = local52[local102];
							if (local85 != 1 || local158.length() <= 0 || (new File(local158)).exists()) {
								(new File(local52[local102] + local77[local92])).mkdir();
								if (arg0 != null) {
									(new File(local52[local102] + local77[local92] + "/" + arg0)).mkdir();
								}
								local139 = new RandomAccessFile(local144, "rw");
								@Pc(223) int local223 = local139.read();
								local139.seek(0L);
								local139.write(local223);
								local139.seek(0L);
								local139.close();
								aHashtable9.put(arg2, local144);
								return local144;
							}
						}
					} catch (@Pc(242) Exception local242) {
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
}
