import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!da", name = "i", descriptor = "[Lclient!bda;")
	public static final Class33[] aClass33Array8 = new Class33[2048];

	@OriginalMember(owner = "client!da", name = "l", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_59 = new Class305(75, 3);

	@OriginalMember(owner = "client!da", name = "u", descriptor = "[Z")
	public static final boolean[] aBooleanArray30 = new boolean[5];

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)Z")
	public static boolean method5783() {
		@Pc(7) Hashtable local7 = new Hashtable();
		@Pc(10) Enumeration local10 = Static549.aHashtable7.keys();
		while (local10.hasMoreElements()) {
			@Pc(14) Object local14 = local10.nextElement();
			local7.put(local14, Static549.aHashtable7.get(local14));
		}
		try {
			@Pc(27) Class local27 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(30) Class local30 = Class.forName("java.lang.ClassLoader");
			@Pc(34) Field local34 = local30.getDeclaredField("nativeLibraries");
			@Pc(44) Method local44 = local27.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local44.invoke(local34, Boolean.TRUE);
			try {
				local10 = Static549.aHashtable7.keys();
				while (local10.hasMoreElements()) {
					@Pc(62) String local62 = (String) local10.nextElement();
					try {
						@Pc(67) File local67 = (File) Static207.aHashtable5.get(local62);
						@Pc(72) Class local72 = (Class) Static549.aHashtable7.get(local62);
						@Pc(78) Vector local78 = (Vector) local34.get(local72.getClassLoader());
						for (@Pc(80) int local80 = 0; local80 < local78.size(); local80++) {
							try {
								@Pc(85) Object local85 = local78.elementAt(local80);
								@Pc(90) Field local90 = local85.getClass().getDeclaredField("name");
								local44.invoke(local90, Boolean.TRUE);
								try {
									@Pc(105) String local105 = (String) local90.get(local85);
									if (local105 != null && local105.equalsIgnoreCase(local67.getCanonicalPath())) {
										@Pc(117) Field local117 = local85.getClass().getDeclaredField("handle");
										@Pc(124) Method local124 = local85.getClass().getDeclaredMethod("finalize");
										local44.invoke(local117, Boolean.TRUE);
										local44.invoke(local124, Boolean.TRUE);
										try {
											local124.invoke(local85);
											local117.set(local85, Integer.valueOf(0));
											local7.remove(local62);
										} catch (@Pc(163) Throwable local163) {
										}
										local44.invoke(local124, Boolean.FALSE);
										local44.invoke(local117, Boolean.FALSE);
									}
								} catch (@Pc(185) Throwable local185) {
								}
								local44.invoke(local90, Boolean.FALSE);
							} catch (@Pc(197) Throwable local197) {
							}
						}
					} catch (@Pc(209) Throwable local209) {
					}
				}
			} catch (@Pc(221) Throwable local221) {
			}
			local44.invoke(local34, Boolean.FALSE);
		} catch (@Pc(233) Throwable local233) {
		}
		Static549.aHashtable7 = local7;
		return Static549.aHashtable7.isEmpty();
	}
}
