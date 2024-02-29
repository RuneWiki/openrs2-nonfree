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
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.jar.JarOutputStream;
import java.util.jar.Pack200;
import java.util.jar.Pack200.Unpacker;
import java.util.zip.GZIPInputStream;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!Rs2Applet")
public final class Rs2Applet extends Applet {

	@OriginalMember(owner = "loader!Rs2Applet", name = "k", descriptor = "I")
	static int anInt5891;

	@OriginalMember(owner = "loader!Rs2Applet", name = "m", descriptor = "I")
	static int anInt5892;

	@OriginalMember(owner = "loader!Rs2Applet", name = "n", descriptor = "I")
	static int anInt5893;

	@OriginalMember(owner = "loader!Rs2Applet", name = "l", descriptor = "Ljava/lang/String;")
	static String aString249;

	@OriginalMember(owner = "loader!Rs2Applet", name = "i", descriptor = "I")
	static int anInt5894;

	@OriginalMember(owner = "loader!Rs2Applet", name = "c", descriptor = "I")
	static int anInt5895;

	@OriginalMember(owner = "loader!Rs2Applet", name = "j", descriptor = "I")
	static int anInt5896;

	@OriginalMember(owner = "loader!Rs2Applet", name = "e", descriptor = "I")
	static int anInt5897;

	@OriginalMember(owner = "loader!Rs2Applet", name = "f", descriptor = "I")
	static int anInt5898;

	@OriginalMember(owner = "loader!Rs2Applet", name = "r", descriptor = "I")
	static int anInt5899;

	@OriginalMember(owner = "loader!Rs2Applet", name = "h", descriptor = "I")
	static int anInt5900;

	@OriginalMember(owner = "loader!Rs2Applet", name = "a", descriptor = "I")
	static int anInt5901;

	@OriginalMember(owner = "loader!Rs2Applet", name = "q", descriptor = "Z")
	public static boolean aBoolean870;

	@OriginalMember(owner = "loader!Rs2Applet", name = "b", descriptor = "Lloader!d;")
	private Class707 aClass707_1;

	@OriginalMember(owner = "loader!Rs2Applet", name = "g", descriptor = "Lloader!d;")
	private Class707 aClass707_2;

	@OriginalMember(owner = "loader!Rs2Applet", name = "o", descriptor = "Ljava/lang/Class;")
	private Class aClass3 = null;

	@OriginalMember(owner = "loader!Rs2Applet", name = "p", descriptor = "Z")
	private boolean aBoolean869 = false;

	@OriginalMember(owner = "loader!Rs2Applet", name = "d", descriptor = "Ljava/lang/Object;")
	private Object anObject28 = null;

	@OriginalMember(owner = "loader!Rs2Applet", name = "start", descriptor = "()V", line = 4)
	@Override
	public final void start() {
		anInt5895++;
		if (this.anObject28 != null) {
			this.method36586(null, null, (byte) 118, "start");
		}
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 16)
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		anInt5900++;
		if (this.anObject28 != null) {
			this.method36586(new Class[] { Graphics.class }, new Object[] { arg0 }, (byte) 76, "paint");
		}
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "stop", descriptor = "()V", line = 28)
	@Override
	public final void stop() {
		if (this.anObject28 != null) {
			this.method36586(null, null, (byte) 71, "stop");
		}
		anInt5894++;
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "a", descriptor = "(Lloader!d;B)Lloader!j;", line = 41)
	static final ClassLoader_Sub1 method36582(@OriginalArg(0) Class707 arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) int local7 = -85 % ((arg1 - -51) / 43);
		anInt5891++;
		return new ClassLoader_Sub1(arg0);
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "a", descriptor = "(Lloader!d;Ljava/lang/Throwable;B)V", line = 65)
	private final void method36583(@OriginalArg(0) Class707 arg0, @OriginalArg(1) Throwable arg1, @OriginalArg(2) byte arg2) {
		anInt5897++;
		RuntimeException_Sub5.method36616(arg1, null, -64);
		if (arg2 <= 27) {
			return;
		}
		if (arg0 == Class709.aClass707_9 && arg1 instanceof AccessControlException) {
			arg0 = Class707_Sub1.aClass707_8;
		}
		this.method36584((String) ((Class707_Sub1) arg0).anObject39, 0);
		throw new RuntimeException(arg1);
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "destroy", descriptor = "()V", line = 86)
	@Override
	public final void destroy() {
		if (this.anObject28 != null) {
			this.method36586(null, null, (byte) 106, "destroy");
		}
		anInt5898++;
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 97)
	private final void method36584(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		anInt5892++;
		if (arg1 != 0) {
			this.paint(null);
		}
		if (this.aBoolean869) {
			return;
		}
		this.aBoolean869 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "a", descriptor = "(ILjava/lang/Throwable;)V", line = 119)
	private final void method36585(@OriginalArg(0) int arg0, @OriginalArg(1) Throwable arg1) {
		this.method36583(Class709.aClass707_9, arg1, (byte) 43);
		anInt5893++;
		if (arg0 < 65) {
			method36582(null, (byte) 20);
		}
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 130)
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		anInt5896++;
		if (this.anObject28 != null) {
			this.method36586(new Class[] { Graphics.class }, new Object[] { arg0 }, (byte) 79, "update");
		}
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "<init>", descriptor = "()V", line = 141)
	public Rs2Applet() {
		Class707_Sub1_Sub1_Sub1_Sub1_Sub1.anInt5917 = -132600573;
		Class707_Sub1_Sub1_Sub1_Sub1.anApplet5 = this;
		Class707_Sub1_Sub1_Sub1_Sub1_Sub1.anInt5916 = 1610406129;
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "init", descriptor = "()V", line = 152)
	@Override
	public final void init() {
		@Pc(1) boolean local1 = Class707.aBoolean876;
		anInt5899++;
		try {
			@Pc(11) byte[] local11 = Class707_Sub1_Sub1.method36609(this.getParameter("0"), -22792);
			@Pc(19) byte[] local19 = Class707_Sub1_Sub1.method36609(this.getParameter("-1"), -22792);
			try {
				@Pc(24) Class707_Sub1 local24 = new Class707_Sub1(100);
				@Pc(32) SecretKeySpec local32 = new SecretKeySpec(local11, "AES");
				((Class707_Sub1) local24).anObject39 = Cipher.getInstance("AES/CBC/PKCS5Padding");
				((Cipher) ((Class707_Sub1) local24).anObject39).init(2, local32, new IvParameterSpec(local19));
				this.aClass707_2 = local24;
			} catch (@Pc(57) NoSuchPaddingException local57) {
				this.method36583(RuntimeException_Sub5.aClass707_11, local57, (byte) 87);
			} catch (@Pc(64) NoSuchAlgorithmException local64) {
				this.method36583(RuntimeException_Sub5.aClass707_11, local64, (byte) 90);
			} catch (@Pc(71) ExceptionInInitializerError local71) {
				this.method36583(RuntimeException_Sub5.aClass707_11, local71, (byte) 81);
			} catch (@Pc(78) NoClassDefFoundError local78) {
				this.method36583(RuntimeException_Sub5.aClass707_11, local78, (byte) 42);
			} catch (@Pc(85) InvalidAlgorithmParameterException local85) {
				this.method36583(Class709.aClass707_9, local85, (byte) 89);
			} catch (@Pc(92) InvalidKeyException local92) {
				this.method36583(Class709.aClass707_9, local92, (byte) 38);
			}
			this.aClass707_1 = Class708.method36605(new Class707_Sub1_Sub1_Sub1_Sub1_Sub1(-114), this.aClass707_2, -21387);
			@Pc(115) InputStream local115 = this.getClass().getClassLoader().getResourceAsStream("inner.pack.gz");
			if (local115 == null) {
				this.method36585(75, new RuntimeException());
				System.exit(1);
			}
			@Pc(131) byte[] local131 = new byte[5242880];
			@Pc(133) int local133 = 0;
			try {
				@Pc(142) int local142 = local115.read(local131, local133, -local133 + 5242880);
				while (local142 != -1) {
					local133 += local142;
					local142 = local115.read(local131, local133, 5242880 - local133);
					if (local1 || local1) {
						break;
					}
				}
			} catch (@Pc(165) IOException local165) {
				this.method36585(118, local165);
			}
			@Pc(172) byte[] local172 = new byte[local133];
			System.arraycopy(local131, 0, local172, 0, local133);
			@Pc(181) Class707 local181 = this.aClass707_2;
			@Pc(188) byte[] local188 = ((Cipher) ((Class707_Sub1) local181).anObject39).doFinal(local172);
			@Pc(190) byte[] local190 = local188;
			@Pc(192) Unpacker local192 = Pack200.newUnpacker();
			@Pc(197) ByteArrayOutputStream local197 = new ByteArrayOutputStream(5242880);
			try {
				@Pc(202) JarOutputStream local202 = new JarOutputStream(local197);
				@Pc(210) GZIPInputStream local210 = new GZIPInputStream(new ByteArrayInputStream(local190));
				local192.unpack(local210, local202);
				local202.close();
			} catch (@Pc(218) IOException local218) {
				this.method36585(111, local218);
			}
			@Pc(224) JarInputStream local224 = null;
			boolean var37 = false;
			label292: {
				@Pc(252) int var10000;
				label315: {
					label290: {
						label289: {
							label288: {
								try {
									var37 = true;
									local224 = new JarInputStream(new ByteArrayInputStream(local197.toByteArray()));
									do {
										@Pc(238) JarEntry local238;
										if ((local238 = local224.getNextJarEntry()) == null) {
											var37 = false;
											break label289;
										}
										local133 = 0;
										@Pc(244) String local244 = local238.getName();
										var10000 = local224.read(local131, local133, -local133 + 5242880);
										if (local1) {
											var37 = false;
											break label315;
										}
										@Pc(255) int local255 = var10000;
										while (true) {
											if (local255 != -1) {
												local133 += local255;
												local255 = local224.read(local131, local133, -local133 + 5242880);
												if (local1) {
													break;
												}
												if (!local1) {
													continue;
												}
											}
											if (local244.endsWith(".class")) {
												local244 = local244.replace('/', '.');
												@Pc(293) byte[] local293 = new byte[local133];
												System.arraycopy(local131, 0, local293, 0, local133);
												Class709.method36611(local244.substring(0, local244.length() + -6), 32, local293, this.aClass707_1);
											}
											break;
										}
									} while (!local1);
									var37 = false;
									break label289;
								} catch (@Pc(321) IOException local321) {
									this.method36585(88, local321);
									var37 = false;
								} catch (@Pc(332) Throwable local332) {
									this.method36585(72, local332);
									var37 = false;
									break label288;
								} finally {
									if (var37 && local224 != null) {
										local224.close();
									}
								}
								if (local224 != null) {
									local224.close();
								}
								break label290;
							}
							if (local224 != null) {
								local224.close();
							}
							break label290;
						}
						if (local224 != null) {
							local224.close();
						}
					}
					try {
						this.aClass3 = ((ClassLoader) (this.aClass707_1 == null ? null : ((Class707_Sub1_Sub1) this.aClass707_1).anObject40)).loadClass("client");
					} catch (@Pc(372) ClassNotFoundException local372) {
						this.method36585(94, local372);
					}
					if (this.aClass3 != null) {
						break label292;
					}
					this.method36585(96, new RuntimeException());
					var10000 = 1;
				}
				System.exit(var10000);
			}
			try {
				@Pc(396) Constructor local396 = this.aClass3.getConstructor(null);
				this.anObject28 = local396.newInstance((Object[]) null);
			} catch (@Pc(404) NoSuchMethodException local404) {
				this.method36585(96, local404);
			} catch (@Pc(410) InvocationTargetException local410) {
				this.method36585(100, local410);
			} catch (@Pc(416) IllegalAccessException local416) {
				this.method36585(77, local416);
			} catch (@Pc(422) InstantiationException local422) {
				this.method36585(123, local422);
			} catch (@Pc(428) Throwable local428) {
				this.method36585(93, local428);
			}
			if (this.anObject28 == null) {
				this.method36585(108, new RuntimeException());
				System.exit(1);
			}
			this.method36586(new Class[] { Applet.class }, new Object[] { this }, (byte) 127, "supplyApplet");
			this.method36586(null, null, (byte) 91, "init");
		} catch (@Pc(474) Throwable local474) {
			this.method36585(102, local474);
		}
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "a", descriptor = "([Ljava/lang/Class;[Ljava/lang/Object;BLjava/lang/String;)V", line = 321)
	private final void method36586(@OriginalArg(0) Class[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) String arg3) {
		try {
			@Pc(5) Method local5 = this.aClass3.getMethod(arg3, arg0);
			local5.invoke(this.anObject28, arg1);
			if (arg2 < 67) {
				this.method36585(115, (Throwable) arg1[17]);
			}
		} catch (@Pc(25) NoSuchMethodException local25) {
			this.method36585(86, local25);
		} catch (@Pc(31) IllegalAccessException local31) {
			this.method36585(123, local31);
		} catch (@Pc(37) InvocationTargetException local37) {
			this.method36585(123, local37);
		} catch (@Pc(43) Throwable local43) {
			this.method36585(108, local43);
		}
		anInt5901++;
	}
}
