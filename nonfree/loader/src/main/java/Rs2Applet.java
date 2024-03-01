import java.applet.Applet;
import java.awt.Graphics;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.AccessControlException;
import java.security.AllPermission;
import java.security.CodeSource;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Permissions;
import java.security.ProtectionDomain;
import java.security.cert.Certificate;
import java.util.Hashtable;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.jar.JarOutputStream;
import java.util.jar.Pack200;
import java.util.jar.Pack200.Unpacker;
import java.util.zip.GZIPInputStream;
import javax.crypto.NoSuchPaddingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!Rs2Applet")
public final class Rs2Applet extends Applet {

	@OriginalMember(owner = "loader!Rs2Applet", name = "i", descriptor = "I")
	static int anInt5594;

	@OriginalMember(owner = "loader!Rs2Applet", name = "k", descriptor = "I")
	static int anInt5595;

	@OriginalMember(owner = "loader!Rs2Applet", name = "b", descriptor = "I")
	static int anInt5596;

	@OriginalMember(owner = "loader!Rs2Applet", name = "q", descriptor = "I")
	static int anInt5597;

	@OriginalMember(owner = "loader!Rs2Applet", name = "p", descriptor = "I")
	static int anInt5598;

	@OriginalMember(owner = "loader!Rs2Applet", name = "g", descriptor = "I")
	static int anInt5599;

	@OriginalMember(owner = "loader!Rs2Applet", name = "j", descriptor = "I")
	static int anInt5600;

	@OriginalMember(owner = "loader!Rs2Applet", name = "o", descriptor = "I")
	static int anInt5601;

	@OriginalMember(owner = "loader!Rs2Applet", name = "f", descriptor = "I")
	static int anInt5602;

	@OriginalMember(owner = "loader!Rs2Applet", name = "m", descriptor = "I")
	static int anInt5603;

	@OriginalMember(owner = "loader!Rs2Applet", name = "c", descriptor = "I")
	static int anInt5604;

	@OriginalMember(owner = "loader!Rs2Applet", name = "l", descriptor = "Z")
	public static boolean aBoolean856;

	@OriginalMember(owner = "loader!Rs2Applet", name = "n", descriptor = "Lloader!j;")
	private Class636 aClass636_1;

	@OriginalMember(owner = "loader!Rs2Applet", name = "e", descriptor = "Lloader!j;")
	private Class636 aClass636_2;

	@OriginalMember(owner = "loader!Rs2Applet", name = "d", descriptor = "Ljava/lang/Object;")
	private Object anObject29 = null;

	@OriginalMember(owner = "loader!Rs2Applet", name = "a", descriptor = "Z")
	private boolean aBoolean855 = false;

	@OriginalMember(owner = "loader!Rs2Applet", name = "h", descriptor = "Ljava/lang/Class;")
	private Class aClass2 = null;

	@OriginalMember(owner = "loader!Rs2Applet", name = "a", descriptor = "(Ljava/lang/String;B[Ljava/lang/Object;[Ljava/lang/Class;)V", line = 6)
	private final void method33902(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(3) Class[] arg3) {
		anInt5603++;
		try {
			@Pc(9) Method local9 = this.aClass2.getMethod(arg0, arg3);
			if (arg1 <= 16) {
				this.method33904(null, ((byte[]) arg2[2])[6]);
			}
			local9.invoke(this.anObject29, arg2);
		} catch (@Pc(33) NoSuchMethodException local33) {
			this.method33904(local33, (byte) -61);
		} catch (@Pc(39) IllegalAccessException local39) {
			this.method33904(local39, (byte) -61);
		} catch (@Pc(45) InvocationTargetException local45) {
			this.method33904(local45, (byte) -61);
		} catch (@Pc(51) Throwable local51) {
			this.method33904(local51, (byte) -61);
		}
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 32)
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		anInt5601++;
		if (this.anObject29 != null) {
			this.method33902("update", (byte) 55, new Object[] { arg0 }, new Class[] { Graphics.class });
		}
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "a", descriptor = "(BLjava/lang/Throwable;Lloader!j;)V", line = 44)
	private final void method33903(@OriginalArg(1) Throwable arg0, @OriginalArg(2) Class636 arg1) {
		Class637.method33922(null, arg0);
		anInt5595++;
		if (arg1 == Class639.aClass636_6 && arg0 instanceof AccessControlException) {
			arg1 = Class637.aClass636_5;
		}
		this.method33906((String) ((Class636_Sub1) arg1).anObject40, false);
		throw new RuntimeException(arg0);
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "a", descriptor = "(Ljava/lang/Throwable;B)V", line = 64)
	private final void method33904(@OriginalArg(0) Throwable arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != -61) {
			this.aClass636_2 = null;
		}
		anInt5598++;
		this.method33903(arg0, Class639.aClass636_6);
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "destroy", descriptor = "()V", line = 75)
	@Override
	public final void destroy() {
		anInt5594++;
		if (this.anObject29 != null) {
			this.method33902("destroy", (byte) 126, null, null);
		}
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "start", descriptor = "()V", line = 85)
	@Override
	public final void start() {
		if (this.anObject29 != null) {
			this.method33902("start", (byte) 124, null, null);
		}
		anInt5600++;
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 97)
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		anInt5596++;
		if (this.anObject29 != null) {
			this.method33902("paint", (byte) 95, new Object[] { arg0 }, new Class[] { Graphics.class });
		}
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "a", descriptor = "(BLjava/lang/String;)[B", line = 110)
	private static final byte[] method33905(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		anInt5602++;
		@Pc(8) int local8 = arg1.length();
		if (local8 == 0) {
			return new byte[0];
		} else if (arg0 == 40) {
			@Pc(34) int var4;
			@Pc(107) int var7;
			label115: {
				@Pc(28) int local28 = local8 + 3 & 0xFFFFFFFC;
				var4 = local28 / 4 * 3;
				if (local28 - 2 < local8) {
					@Pc(49) char local49 = arg1.charAt(local28 + -2);
					@Pc(66) int local66;
					if (local49 >= 0 && local49 < Class636_Sub1_Sub1.anIntArray532.length) {
						local66 = Class636_Sub1_Sub1.anIntArray532[local49];
					} else {
						local66 = -1;
					}
					if (local66 != -1) {
						if (local8 > local28 + -1) {
							@Pc(92) char local92 = arg1.charAt(local28 + -1);
							if (local92 >= 0 && Class636_Sub1_Sub1.anIntArray532.length > local92) {
								var7 = Class636_Sub1_Sub1.anIntArray532[local92];
							} else {
								var7 = -1;
							}
							if (var7 != -1) {
								break label115;
							}
						}
						var4--;
						break label115;
					}
				}
				var4 -= 2;
			}
			@Pc(129) byte[] local129 = new byte[var4];
			@Pc(131) int local131 = 0;
			var7 = arg1.length();
			for (@Pc(136) int local136 = 0; local136 < var7; local136 += 4) {
				@Pc(143) char local143 = arg1.charAt(local136);
				@Pc(155) int local155;
				if (local143 >= 0 && Class636_Sub1_Sub1.anIntArray532.length > local143) {
					local155 = Class636_Sub1_Sub1.anIntArray532[local143];
				} else {
					local155 = -1;
				}
				@Pc(168) int local168;
				if (local136 - -1 >= var7) {
					local168 = -1;
				} else {
					@Pc(177) char local177 = arg1.charAt(1 - -local136);
					@Pc(191) int local191;
					if (local177 >= 0 && local177 < Class636_Sub1_Sub1.anIntArray532.length) {
						local191 = Class636_Sub1_Sub1.anIntArray532[local177];
					} else {
						local191 = -1;
					}
					local168 = local191;
				}
				@Pc(206) int local206;
				if (var7 <= local136 + 2) {
					local206 = -1;
				} else {
					@Pc(215) char local215 = arg1.charAt(2 - -local136);
					@Pc(230) int local230;
					if (local215 >= 0 && local215 < Class636_Sub1_Sub1.anIntArray532.length) {
						local230 = Class636_Sub1_Sub1.anIntArray532[local215];
					} else {
						local230 = -1;
					}
					local206 = local230;
				}
				@Pc(249) int local249;
				if (local136 + 3 >= var7) {
					local249 = -1;
				} else {
					@Pc(257) char local257 = arg1.charAt(local136 + 3);
					@Pc(276) int local276;
					if (local257 >= 0 && Class636_Sub1_Sub1.anIntArray532.length > local257) {
						local276 = Class636_Sub1_Sub1.anIntArray532[local257];
					} else {
						local276 = -1;
					}
					local249 = local276;
				}
				local129[local131++] = (byte) (local168 >>> 4 | local155 << 2);
				if (local206 == -1) {
					break;
				}
				local129[local131++] = (byte) ((local168 & 0xF) << 4 | local206 >>> 2);
				if (local249 == -1) {
					break;
				}
				local129[local131++] = (byte) ((local206 & 0x3) << 6 | local249);
			}
			return local129;
		} else {
			return (byte[]) null;
		}
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 305)
	private final void method33906(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		anInt5599++;
		if (this.aBoolean855) {
			return;
		}
		if (arg1) {
			this.method33903(null, null);
		}
		this.aBoolean855 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(60) Exception local60) {
		}
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "stop", descriptor = "()V", line = 328)
	@Override
	public final void stop() {
		if (this.anObject29 != null) {
			this.method33902("stop", (byte) 107, null, null);
		}
		anInt5604++;
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "<init>", descriptor = "()V", line = 340)
	public Rs2Applet() {
		Class637.anInt5629 = 307012649;
		Class636_Sub1_Sub1_Sub1_Sub1.anApplet5 = this;
		Class635.anInt5605 = 606493655;
		if (aBoolean856) {
		}
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "init", descriptor = "()V", line = 351)
	@Override
	public final void init() {
		anInt5597++;
		try {
			@Pc(11) byte[] local11 = method33905((byte) 40, this.getParameter("0"));
			@Pc(19) byte[] local19 = method33905((byte) 40, this.getParameter("-1"));
			try {
				this.aClass636_1 = Class636.method33919((byte) 31, local11, local19, new Class636_Sub1(15));
			} catch (@Pc(31) NoSuchPaddingException local31) {
				this.method33903(local31, ClassLoader_Sub1.aClass636_4);
			} catch (@Pc(38) NoSuchAlgorithmException local38) {
				this.method33903(local38, ClassLoader_Sub1.aClass636_4);
			} catch (@Pc(45) ExceptionInInitializerError local45) {
				this.method33903(local45, ClassLoader_Sub1.aClass636_4);
			} catch (@Pc(52) NoClassDefFoundError local52) {
				this.method33903(local52, ClassLoader_Sub1.aClass636_4);
			} catch (@Pc(59) InvalidAlgorithmParameterException local59) {
				this.method33903(local59, Class639.aClass636_6);
			} catch (@Pc(66) InvalidKeyException local66) {
				this.method33903(local66, Class639.aClass636_6);
			}
			@Pc(76) Class636_Sub1_Sub1_Sub1_Sub1_Sub1 local76 = new Class636_Sub1_Sub1_Sub1_Sub1_Sub1(25);
			@Pc(79) Class636 local79 = this.aClass636_1;
			((Class636_Sub1) local76).anObject40 = Class638.method33924(local76, (byte) 73);
			((Class636_Sub1_Sub1) local76).anObject41 = local79;
			((Class636_Sub1_Sub1_Sub1_Sub1_Sub1) local76).anObject44 = new Hashtable();
			((Class636_Sub1_Sub1_Sub1) local76).anObject42 = new Hashtable();
			@Pc(105) Permissions local105 = new Permissions();
			local105.add(new AllPermission());
			((Class636_Sub1_Sub1_Sub1_Sub1) local76).anObject43 = new ProtectionDomain(new CodeSource(null, (Certificate[]) null), local105);
			this.aClass636_2 = local76;
			@Pc(136) InputStream local136 = this.getClass().getClassLoader().getResourceAsStream("inner.pack.gz");
			if (local136 == null) {
				this.method33904(new RuntimeException(), (byte) -61);
				System.exit(1);
			}
			@Pc(152) byte[] local152 = new byte[5242880];
			@Pc(154) int local154 = 0;
			try {
				for (@Pc(163) int local163 = local136.read(local152, local154, -local154 + 5242880); local163 != -1; local163 = local136.read(local152, local154, -local154 + 5242880)) {
					local154 += local163;
				}
			} catch (@Pc(187) IOException local187) {
				this.method33904(local187, (byte) -61);
			}
			@Pc(194) byte[] local194 = new byte[local154];
			System.arraycopy(local152, 0, local194, 0, local154);
			@Pc(206) byte[] local206 = Class636.method33920(this.aClass636_1, -1453, local194);
			@Pc(208) Unpacker local208 = Pack200.newUnpacker();
			@Pc(213) ByteArrayOutputStream local213 = new ByteArrayOutputStream(5242880);
			try {
				@Pc(218) JarOutputStream local218 = new JarOutputStream(local213);
				@Pc(226) GZIPInputStream local226 = new GZIPInputStream(new ByteArrayInputStream(local206));
				local208.unpack(local226, local218);
				local218.close();
			} catch (@Pc(234) IOException local234) {
				this.method33904(local234, (byte) -61);
			}
			try {
				@Pc(247) JarInputStream local247 = new JarInputStream(new ByteArrayInputStream(local213.toByteArray()));
				@Pc(252) JarEntry local252;
				while ((local252 = local247.getNextJarEntry()) != null) {
					@Pc(256) String local256 = local252.getName();
					local154 = 0;
					for (@Pc(268) int local268 = local247.read(local152, local154, 5242880 - local154); local268 != -1; local268 = local247.read(local152, local154, -local154 + 5242880)) {
						local154 += local268;
					}
					if (local256.endsWith(".class")) {
						local256 = local256.replace('/', '.');
						@Pc(305) byte[] local305 = new byte[local154];
						System.arraycopy(local152, 0, local305, 0, local154);
						@Pc(314) Class636 local314 = this.aClass636_2;
						@Pc(322) String local322 = local256.substring(0, local256.length() + -6);
						((Hashtable) ((Class636_Sub1_Sub1_Sub1) local314).anObject42).put(local322, local305);
					}
				}
			} catch (@Pc(334) IOException local334) {
				this.method33904(local334, (byte) -61);
			} catch (@Pc(340) Throwable local340) {
				this.method33904(local340, (byte) -61);
			}
			try {
				this.aClass2 = ((ClassLoader) (this.aClass636_2 == null ? null : ((Class636_Sub1) this.aClass636_2).anObject40)).loadClass("client");
			} catch (@Pc(363) ClassNotFoundException local363) {
				this.method33904(local363, (byte) -61);
			}
			if (this.aClass2 == null) {
				this.method33904(new RuntimeException(), (byte) -61);
				System.exit(1);
			}
			try {
				@Pc(387) Constructor local387 = this.aClass2.getConstructor(null);
				this.anObject29 = local387.newInstance((Object[]) null);
			} catch (@Pc(395) NoSuchMethodException local395) {
				this.method33904(local395, (byte) -61);
			} catch (@Pc(401) InvocationTargetException local401) {
				this.method33904(local401, (byte) -61);
			} catch (@Pc(407) IllegalAccessException local407) {
				this.method33904(local407, (byte) -61);
			} catch (@Pc(413) InstantiationException local413) {
				this.method33904(local413, (byte) -61);
			} catch (@Pc(419) Throwable local419) {
				this.method33904(local419, (byte) -61);
			}
			if (this.anObject29 == null) {
				this.method33904(new RuntimeException(), (byte) -61);
				System.exit(1);
			}
			this.method33902("supplyApplet", (byte) 77, new Object[] { this }, new Class[] { Applet.class });
			this.method33902("init", (byte) 87, null, null);
		} catch (@Pc(464) Throwable local464) {
			this.method33904(local464, (byte) -61);
		}
	}
}
