package com.jagex;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public class Class541 implements Interface59 {

	@OriginalMember(owner = "client!sr", name = "v", descriptor = "Ljava/util/Hashtable;")
	Hashtable aHashtable10 = new Hashtable();

	@OriginalMember(owner = "client!sr", name = "l", descriptor = "Ljava/util/Hashtable;")
	Hashtable aHashtable11 = new Hashtable();

	@OriginalMember(owner = "client!sr", name = "p", descriptor = "Lclient!pw;")
	final Class478 aClass478_129;

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "Ljava/lang/String;")
	final String aString229;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lclient!pw;)V", line = 17)
	public Class541(@OriginalArg(0) Class478 arg0) {
		this.aClass478_129 = arg0;
		@Pc(16) String local16 = "";
		if (Class508.aString221.startsWith("win") || Class508.aString221.startsWith("windows 7")) {
			local16 = local16 + "windows/";
		} else if (Class508.aString221.startsWith("linux")) {
			local16 = local16 + "linux/";
		} else if (Class508.aString221.startsWith("mac")) {
			local16 = local16 + "macos/";
		}
		if (Class508.aString222.startsWith("amd64") || Class508.aString222.startsWith("x86_64")) {
			local16 = local16 + "x86_64/";
		} else if (Class508.aString222.startsWith("i386") || Class508.aString222.startsWith("i486") || Class508.aString222.startsWith("i586") || Class508.aString222.startsWith("x86")) {
			local16 = local16 + "x86/";
		} else if (Class508.aString222.startsWith("ppc")) {
			local16 = local16 + "ppc/";
		} else {
			local16 = local16 + "universal/";
		}
		this.aString229 = local16;
	}

	@OriginalMember(owner = "client!sr", name = "z", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 33)
	static String method30927(@OriginalArg(0) String arg0) {
		if (Class508.aString221.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class508.aString221.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class508.aString221.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sr", name = "s", descriptor = "(Ljava/lang/String;ZI)I", line = 40)
	public int method30928(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub1 {
		if (this.aHashtable10.containsKey(arg0)) {
			return 100;
		}
		@Pc(8) String local8 = null;
		@Pc(10) String local10 = null;
		if (arg1) {
			local8 = arg0;
			local10 = arg0;
		} else {
			local10 = Class487.method29985(arg0);
			if (local10 == null) {
				throw new Exception_Sub1(1, arg0);
			}
			if (local8 == null) {
				local8 = this.aString229 + local10;
				if (this.aClass478_129 == null || !this.aClass478_129.method29776(local8, "")) {
					throw new Exception_Sub1(2, arg0);
				}
			}
		}
		if (!this.aClass478_129.method29787(local8)) {
			return this.aClass478_129.method29789(local8);
		}
		@Pc(77) byte[] local77 = this.aClass478_129.method29778(local8, "");
		if (local77 == null) {
			throw new Exception_Sub1(3, arg0);
		}
		@Pc(88) File local88 = null;
		try {
			local88 = Class313.method27312(local10);
		} catch (@Pc(94) RuntimeException local94) {
			throw new Exception_Sub1(4, arg0, local94);
		}
		if (local88 == null) {
			throw new Exception_Sub1(5, arg0);
		}
		@Pc(112) boolean local112 = true;
		@Pc(116) byte[] local116 = Class143_Sub24.method15786(local88);
		if (local116 != null && local77.length == local116.length) {
			for (@Pc(126) int local126 = 0; local126 < local116.length; local126++) {
				if (local77[local126] != local116[local126]) {
					local112 = false;
					break;
				}
			}
		} else {
			local112 = false;
		}
		if (!local112) {
			try {
				@Pc(152) FileOutputStream local152 = new FileOutputStream(local88);
				local152.write(local77, 0, local77.length);
				local152.close();
			} catch (@Pc(162) Throwable local162) {
				throw new Exception_Sub1(6, arg0, local162);
			}
		}
		this.method30931(arg0, local88);
		return 100;
	}

	@OriginalMember(owner = "client!sr", name = "j", descriptor = "(Ljava/lang/String;Z)I", line = 40)
	public int method30929(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub1 {
		if (this.aHashtable10.containsKey(arg0)) {
			return 100;
		}
		@Pc(8) String local8 = null;
		@Pc(10) String local10 = null;
		if (arg1) {
			local8 = arg0;
			local10 = arg0;
		} else {
			local10 = Class487.method29985(arg0);
			if (local10 == null) {
				throw new Exception_Sub1(1, arg0);
			}
			if (local8 == null) {
				local8 = this.aString229 + local10;
				if (this.aClass478_129 == null || !this.aClass478_129.method29776(local8, "")) {
					throw new Exception_Sub1(2, arg0);
				}
			}
		}
		if (!this.aClass478_129.method29787(local8)) {
			return this.aClass478_129.method29789(local8);
		}
		@Pc(77) byte[] local77 = this.aClass478_129.method29778(local8, "");
		if (local77 == null) {
			throw new Exception_Sub1(3, arg0);
		}
		@Pc(88) File local88 = null;
		try {
			local88 = Class313.method27312(local10);
		} catch (@Pc(94) RuntimeException local94) {
			throw new Exception_Sub1(4, arg0, local94);
		}
		if (local88 == null) {
			throw new Exception_Sub1(5, arg0);
		}
		@Pc(112) boolean local112 = true;
		@Pc(116) byte[] local116 = Class143_Sub24.method15786(local88);
		if (local116 != null && local77.length == local116.length) {
			for (@Pc(126) int local126 = 0; local126 < local116.length; local126++) {
				if (local77[local126] != local116[local126]) {
					local112 = false;
					break;
				}
			}
		} else {
			local112 = false;
		}
		if (!local112) {
			try {
				@Pc(152) FileOutputStream local152 = new FileOutputStream(local88);
				local152.write(local77, 0, local77.length);
				local152.close();
			} catch (@Pc(162) Throwable local162) {
				throw new Exception_Sub1(6, arg0, local162);
			}
		}
		this.method30931(arg0, local88);
		return 100;
	}

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "(Ljava/lang/String;Ljava/io/File;)V", line = 100)
	void method30930(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1) {
		this.aHashtable10.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!sr", name = "r", descriptor = "(Ljava/lang/String;Ljava/io/File;B)V", line = 100)
	void method30931(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1) {
		this.aHashtable10.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!sr", name = "u", descriptor = "(Ljava/lang/String;Ljava/io/File;)V", line = 100)
	void method30932(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1) {
		this.aHashtable10.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!sr", name = "k", descriptor = "(Ljava/lang/String;Ljava/io/File;)V", line = 100)
	void method30933(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1) {
		this.aHashtable10.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(Ljava/lang/String;I)Z", line = 104)
	@Override
	public boolean method30918(@OriginalArg(0) String arg0) {
		return this.aHashtable10.containsKey(arg0);
	}

	@OriginalMember(owner = "client!sr", name = "x", descriptor = "(Ljava/lang/String;)Z", line = 104)
	@Override
	public boolean method30926(@OriginalArg(0) String arg0) {
		return this.aHashtable10.containsKey(arg0);
	}

	@OriginalMember(owner = "client!sr", name = "q", descriptor = "(Ljava/lang/String;)Z", line = 104)
	@Override
	public boolean method30922(@OriginalArg(0) String arg0) {
		return this.aHashtable10.containsKey(arg0);
	}

	@OriginalMember(owner = "client!sr", name = "l", descriptor = "(Ljava/lang/String;)V", line = 108)
	@Override
	public void method30920(@OriginalArg(0) String arg0) throws Exception_Sub4 {
		this.method30934(arg0, Class547.class);
	}

	@OriginalMember(owner = "client!sr", name = "p", descriptor = "(Ljava/lang/String;I)V", line = 108)
	@Override
	public void method30921(@OriginalArg(0) String arg0) throws Exception_Sub4 {
		this.method30934(arg0, Class547.class);
	}

	@OriginalMember(owner = "client!sr", name = "y", descriptor = "(Ljava/lang/String;)V", line = 108)
	@Override
	public void method30919(@OriginalArg(0) String arg0) throws Exception_Sub4 {
		this.method30934(arg0, Class547.class);
	}

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "(Ljava/lang/String;Ljava/lang/Class;S)V", line = 112)
	void method30934(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) throws Exception_Sub4 {
		@Pc(5) Class local5 = (Class) this.aHashtable11.get(arg0);
		if (local5 != null && local5.getClassLoader() != arg1.getClassLoader()) {
			throw new Exception_Sub4(1, arg0);
		}
		@Pc(21) File local21 = null;
		if (local21 == null) {
			local21 = (File) this.aHashtable10.get(arg0);
		}
		if (local21 == null) {
			throw new Exception_Sub4(4, arg0);
		}
		try {
			local21 = new File(local21.getCanonicalPath());
			@Pc(42) Class local42 = Class.forName("java.lang.Runtime");
			@Pc(45) Class local45 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(55) Method local55 = local45.getDeclaredMethod("setAccessible", Boolean.TYPE);
			@Pc(71) Method local71 = local42.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
			local55.invoke(local71, Boolean.TRUE);
			local71.invoke(Runtime.getRuntime(), arg1, local21.getPath());
			local55.invoke(local71, Boolean.FALSE);
			this.aHashtable11.put(arg0, arg1);
		} catch (@Pc(114) NoSuchMethodException local114) {
			System.load(local21.getPath());
			this.aHashtable11.put(arg0, Class547.class);
		} catch (@Pc(125) Throwable local125) {
			throw new Exception_Sub4(3, arg0, local125);
		}
	}

	@OriginalMember(owner = "client!sr", name = "q", descriptor = "(I)V", line = 136)
	static void method30935() {
		Class248.aClass94_7 = null;
		Class128_Sub1.aClass94_5 = null;
		Class260.aClass94_8 = null;
		Class515.aClass83Array8 = null;
		Class536.aClass83Array9 = null;
		Class22.aClass83Array1 = null;
		Class58.aClass83Array2 = null;
		Class611.aClass83Array10 = null;
		Class148.aClass83Array6 = null;
		Class134_Sub1.aClass83_15 = null;
		Class653.aClass83_39 = null;
		Class336.aClass83Array7 = null;
	}

	@OriginalMember(owner = "client!sr", name = "v", descriptor = "(S)Z", line = 148)
	@Override
	public boolean method30925() {
		@Pc(3) Hashtable local3 = new Hashtable();
		@Pc(7) Enumeration local7 = this.aHashtable11.keys();
		while (local7.hasMoreElements()) {
			@Pc(14) String local14 = (String) local7.nextElement();
			local3.put(local14, this.aHashtable11.get(local14));
		}
		try {
			@Pc(26) Class local26 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(29) Class local29 = Class.forName("java.lang.ClassLoader");
			@Pc(33) Field local33 = local29.getDeclaredField("nativeLibraries");
			@Pc(43) Method local43 = local26.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local43.invoke(local33, Boolean.TRUE);
			try {
				local7 = this.aHashtable11.keys();
				while (local7.hasMoreElements()) {
					@Pc(64) String local64 = (String) local7.nextElement();
					try {
						@Pc(70) File local70 = (File) this.aHashtable10.get(local64);
						@Pc(76) Class local76 = (Class) this.aHashtable11.get(local64);
						@Pc(82) Vector local82 = (Vector) local33.get(local76.getClassLoader());
						for (@Pc(84) int local84 = 0; local84 < local82.size(); local84++) {
							try {
								@Pc(92) Object local92 = local82.elementAt(local84);
								@Pc(97) Field local97 = local92.getClass().getDeclaredField("name");
								local43.invoke(local97, Boolean.TRUE);
								try {
									@Pc(112) String local112 = (String) local97.get(local92);
									if (local112 != null && local112.equalsIgnoreCase(local70.getCanonicalPath())) {
										@Pc(125) Field local125 = local92.getClass().getDeclaredField("handle");
										@Pc(132) Method local132 = local92.getClass().getDeclaredMethod("finalize");
										local43.invoke(local125, Boolean.TRUE);
										local43.invoke(local132, Boolean.TRUE);
										try {
											local132.invoke(local92);
											local125.set(local92, Integer.valueOf(0));
											local3.remove(local64);
										} catch (@Pc(171) Throwable local171) {
										}
										local43.invoke(local132, Boolean.FALSE);
										local43.invoke(local125, Boolean.FALSE);
									}
								} catch (@Pc(193) Throwable local193) {
								}
								local43.invoke(local97, Boolean.FALSE);
							} catch (@Pc(205) Throwable local205) {
							}
						}
					} catch (@Pc(209) Throwable local209) {
					}
				}
			} catch (@Pc(212) Throwable local212) {
			}
			local43.invoke(local33, Boolean.FALSE);
		} catch (@Pc(224) Throwable local224) {
		}
		this.aHashtable11 = local3;
		return this.aHashtable11.isEmpty();
	}

	@OriginalMember(owner = "client!sr", name = "w", descriptor = "()Z", line = 148)
	@Override
	public boolean method30923() {
		@Pc(3) Hashtable local3 = new Hashtable();
		@Pc(7) Enumeration local7 = this.aHashtable11.keys();
		while (local7.hasMoreElements()) {
			@Pc(14) String local14 = (String) local7.nextElement();
			local3.put(local14, this.aHashtable11.get(local14));
		}
		try {
			@Pc(26) Class local26 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(29) Class local29 = Class.forName("java.lang.ClassLoader");
			@Pc(33) Field local33 = local29.getDeclaredField("nativeLibraries");
			@Pc(43) Method local43 = local26.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local43.invoke(local33, Boolean.TRUE);
			try {
				local7 = this.aHashtable11.keys();
				while (local7.hasMoreElements()) {
					@Pc(64) String local64 = (String) local7.nextElement();
					try {
						@Pc(70) File local70 = (File) this.aHashtable10.get(local64);
						@Pc(76) Class local76 = (Class) this.aHashtable11.get(local64);
						@Pc(82) Vector local82 = (Vector) local33.get(local76.getClassLoader());
						for (@Pc(84) int local84 = 0; local84 < local82.size(); local84++) {
							try {
								@Pc(92) Object local92 = local82.elementAt(local84);
								@Pc(97) Field local97 = local92.getClass().getDeclaredField("name");
								local43.invoke(local97, Boolean.TRUE);
								try {
									@Pc(112) String local112 = (String) local97.get(local92);
									if (local112 != null && local112.equalsIgnoreCase(local70.getCanonicalPath())) {
										@Pc(125) Field local125 = local92.getClass().getDeclaredField("handle");
										@Pc(132) Method local132 = local92.getClass().getDeclaredMethod("finalize");
										local43.invoke(local125, Boolean.TRUE);
										local43.invoke(local132, Boolean.TRUE);
										try {
											local132.invoke(local92);
											local125.set(local92, Integer.valueOf(0));
											local3.remove(local64);
										} catch (@Pc(171) Throwable local171) {
										}
										local43.invoke(local132, Boolean.FALSE);
										local43.invoke(local125, Boolean.FALSE);
									}
								} catch (@Pc(193) Throwable local193) {
								}
								local43.invoke(local97, Boolean.FALSE);
							} catch (@Pc(205) Throwable local205) {
							}
						}
					} catch (@Pc(209) Throwable local209) {
					}
				}
			} catch (@Pc(212) Throwable local212) {
			}
			local43.invoke(local33, Boolean.FALSE);
		} catch (@Pc(224) Throwable local224) {
		}
		this.aHashtable11 = local3;
		return this.aHashtable11.isEmpty();
	}

	@OriginalMember(owner = "client!sr", name = "t", descriptor = "()Z", line = 148)
	@Override
	public boolean method30924() {
		@Pc(3) Hashtable local3 = new Hashtable();
		@Pc(7) Enumeration local7 = this.aHashtable11.keys();
		while (local7.hasMoreElements()) {
			@Pc(14) String local14 = (String) local7.nextElement();
			local3.put(local14, this.aHashtable11.get(local14));
		}
		try {
			@Pc(26) Class local26 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(29) Class local29 = Class.forName("java.lang.ClassLoader");
			@Pc(33) Field local33 = local29.getDeclaredField("nativeLibraries");
			@Pc(43) Method local43 = local26.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local43.invoke(local33, Boolean.TRUE);
			try {
				local7 = this.aHashtable11.keys();
				while (local7.hasMoreElements()) {
					@Pc(64) String local64 = (String) local7.nextElement();
					try {
						@Pc(70) File local70 = (File) this.aHashtable10.get(local64);
						@Pc(76) Class local76 = (Class) this.aHashtable11.get(local64);
						@Pc(82) Vector local82 = (Vector) local33.get(local76.getClassLoader());
						for (@Pc(84) int local84 = 0; local84 < local82.size(); local84++) {
							try {
								@Pc(92) Object local92 = local82.elementAt(local84);
								@Pc(97) Field local97 = local92.getClass().getDeclaredField("name");
								local43.invoke(local97, Boolean.TRUE);
								try {
									@Pc(112) String local112 = (String) local97.get(local92);
									if (local112 != null && local112.equalsIgnoreCase(local70.getCanonicalPath())) {
										@Pc(125) Field local125 = local92.getClass().getDeclaredField("handle");
										@Pc(132) Method local132 = local92.getClass().getDeclaredMethod("finalize");
										local43.invoke(local125, Boolean.TRUE);
										local43.invoke(local132, Boolean.TRUE);
										try {
											local132.invoke(local92);
											local125.set(local92, Integer.valueOf(0));
											local3.remove(local64);
										} catch (@Pc(171) Throwable local171) {
										}
										local43.invoke(local132, Boolean.FALSE);
										local43.invoke(local125, Boolean.FALSE);
									}
								} catch (@Pc(193) Throwable local193) {
								}
								local43.invoke(local97, Boolean.FALSE);
							} catch (@Pc(205) Throwable local205) {
							}
						}
					} catch (@Pc(209) Throwable local209) {
					}
				}
			} catch (@Pc(212) Throwable local212) {
			}
			local43.invoke(local33, Boolean.FALSE);
		} catch (@Pc(224) Throwable local224) {
		}
		this.aHashtable11 = local3;
		return this.aHashtable11.isEmpty();
	}

	@OriginalMember(owner = "client!sr", name = "yd", descriptor = "(Lclient!yf;B)V", line = 9019)
	static final void method30936(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (Class204.aClass50Array1 == null || local12 >= Class462.anInt4970 * -217094943 || !Class204.aClass50Array1[local12].aString9.equalsIgnoreCase(Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aString82)) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 1;
		}
	}

	@OriginalMember(owner = "client!sr", name = "me", descriptor = "(Ljava/lang/String;ZI)I", line = 12296)
	public static int method30937(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) String local2 = arg0.toLowerCase();
		Class239.anIntArray383 = null;
		Class368.anInt4556 = 0;
		@Pc(10) LinkedList local10 = new LinkedList();
		@Pc(14) LinkedList local14 = new LinkedList();
		@Pc(16) int local16;
		for (local16 = 0; local16 < Class537.aClass35_Sub7_1.anInt2544 * 888398261; local16++) {
			@Pc(28) Class18 local28 = (Class18) Class537.aClass35_Sub7_1.method18319(local16);
			if ((!arg1 || local28.aBoolean10) && local28.anInt89 * 368739509 == -1 && local28.anInt92 * -160842243 == -1 && local28.anInt105 * 25758581 == -1 && local28.anInt95 * -221335179 == 0 && local28.aString2.toLowerCase().indexOf(local2) != -1) {
				if (local10.size() >= 250) {
					return -1;
				}
				local10.add(local16);
				local14.add(local28.aString2);
			}
		}
		Class239.anIntArray383 = new int[local10.size()];
		local16 = 0;
		@Pc(94) Iterator local94 = local10.iterator();
		while (local94.hasNext()) {
			@Pc(101) Integer local101 = (Integer) local94.next();
			Class239.anIntArray383[local16++] = local101;
		}
		@Pc(116) String[] local116 = (String[]) local14.toArray(new String[Class239.anIntArray383.length]);
		Class585.method31727(local116, Class239.anIntArray383);
		return local10.size();
	}
}
