import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!de", name = "d", descriptor = "I")
	public static int anInt2159 = -1;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)I")
	public static int method1944(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public static void method1945() {
		Static239.anInt4498 = 0;
		@Pc(12) int local12 = (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8975 >> 9) + Static529.anInt8344;
		@Pc(19) int local19 = Static463.anInt7588 + (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8980 >> 9);
		if (local12 >= 3053 && local12 <= 3156 && local19 >= 3056 && local19 <= 3136) {
			Static239.anInt4498 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local19 >= 9492 && local19 <= 9535) {
			Static239.anInt4498 = 1;
		}
		if (Static239.anInt4498 == 1 && local12 >= 3139 && local12 <= 3199 && local19 >= 3008 && local19 <= 3062) {
			Static239.anInt4498 = 0;
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)Z")
	public static boolean method1946() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(16) Enumeration local16 = Static420.aHashtable6.keys();
		while (local16.hasMoreElements()) {
			@Pc(21) Object local21 = local16.nextElement();
			local9.put(local21, Static420.aHashtable6.get(local21));
		}
		try {
			@Pc(34) Class local34 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(37) Class local37 = Class.forName("java.lang.ClassLoader");
			@Pc(41) Field local41 = local37.getDeclaredField("nativeLibraries");
			@Pc(51) Method local51 = local34.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local51.invoke(local41, Boolean.TRUE);
			try {
				local16 = Static420.aHashtable6.keys();
				while (local16.hasMoreElements()) {
					@Pc(70) String local70 = (String) local16.nextElement();
					try {
						@Pc(75) File local75 = (File) Static155.aHashtable2.get(local70);
						@Pc(80) Class local80 = (Class) Static420.aHashtable6.get(local70);
						@Pc(86) Vector local86 = (Vector) local41.get(local80.getClassLoader());
						for (@Pc(88) int local88 = 0; local88 < local86.size(); local88++) {
							try {
								@Pc(94) Object local94 = local86.elementAt(local88);
								@Pc(99) Field local99 = local94.getClass().getDeclaredField("name");
								local51.invoke(local99, Boolean.TRUE);
								try {
									@Pc(114) String local114 = (String) local99.get(local94);
									if (local114 != null && local114.equalsIgnoreCase(local75.getCanonicalPath())) {
										@Pc(126) Field local126 = local94.getClass().getDeclaredField("handle");
										@Pc(133) Method local133 = local94.getClass().getDeclaredMethod("finalize");
										local51.invoke(local126, Boolean.TRUE);
										local51.invoke(local133, Boolean.TRUE);
										try {
											local133.invoke(local94);
											local126.set(local94, Integer.valueOf(0));
											local9.remove(local70);
										} catch (@Pc(172) Throwable local172) {
										}
										local51.invoke(local133, Boolean.FALSE);
										local51.invoke(local126, Boolean.FALSE);
									}
								} catch (@Pc(194) Throwable local194) {
								}
								local51.invoke(local99, Boolean.FALSE);
							} catch (@Pc(206) Throwable local206) {
							}
						}
					} catch (@Pc(218) Throwable local218) {
					}
				}
			} catch (@Pc(224) Throwable local224) {
			}
			local51.invoke(local41, Boolean.FALSE);
		} catch (@Pc(236) Throwable local236) {
		}
		Static420.aHashtable6 = local9;
		return Static420.aHashtable6.isEmpty();
	}
}
