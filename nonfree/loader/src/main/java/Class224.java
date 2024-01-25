import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!de")
public final class Class224 implements Runnable {

	@OriginalMember(owner = "loader!de", name = "p", descriptor = "Ljava/lang/String;")
	private static String aString263;

	@OriginalMember(owner = "loader!de", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString264;

	@OriginalMember(owner = "loader!de", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString265;

	@OriginalMember(owner = "loader!de", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString266;

	@OriginalMember(owner = "loader!de", name = "l", descriptor = "Ljava/lang/String;")
	private static String aString267;

	@OriginalMember(owner = "loader!de", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString268;

	@OriginalMember(owner = "loader!de", name = "z", descriptor = "Ljava/lang/String;")
	private static String aString270;

	@OriginalMember(owner = "loader!de", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!de", name = "s", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!de", name = "o", descriptor = "I")
	private static final int anInt6871 = 1;

	@OriginalMember(owner = "loader!de", name = "A", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable1 = new Hashtable(16);

	@OriginalMember(owner = "loader!de", name = "t", descriptor = "J")
	private static volatile long aLong216 = 0L;

	@OriginalMember(owner = "loader!de", name = "y", descriptor = "Lloader!la;")
	private Interface11 anInterface11_1;

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "Z")
	private boolean aBoolean455 = false;

	@OriginalMember(owner = "loader!de", name = "b", descriptor = "Lloader!cs;")
	private Class223 aClass223_2 = null;

	@OriginalMember(owner = "loader!de", name = "m", descriptor = "Lloader!vc;")
	private Class228 aClass228_2 = null;

	@OriginalMember(owner = "loader!de", name = "q", descriptor = "Lloader!cs;")
	private Class223 aClass223_1 = null;

	@OriginalMember(owner = "loader!de", name = "h", descriptor = "Lloader!cs;")
	private Class223 aClass223_3 = null;

	@OriginalMember(owner = "loader!de", name = "c", descriptor = "Lloader!vc;")
	private Class228 aClass228_1 = null;

	@OriginalMember(owner = "loader!de", name = "i", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!de", name = "w", descriptor = "I")
	private final int anInt6872;

	@OriginalMember(owner = "loader!de", name = "u", descriptor = "Ljava/lang/String;")
	private final String aString269;

	@OriginalMember(owner = "loader!de", name = "r", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!de", name = "j", descriptor = "[Lloader!cs;")
	private final Class223[] aClass223Array1;

	@OriginalMember(owner = "loader!de", name = "k", descriptor = "Lloader!h;")
	private Class227 aClass227_1;

	@OriginalMember(owner = "loader!de", name = "x", descriptor = "Lloader!e;")
	private Class225 aClass225_1;

	@OriginalMember(owner = "loader!de", name = "e", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(Ljava/lang/String;II)Lloader!cs;")
	private static Class223 method5764(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(15) String local15;
		if (arg1 == 33) {
			local15 = "jagex_" + arg0 + "_preferences_rc.dat";
		} else if (arg1 == 34) {
			local15 = "jagex_" + arg0 + "_preferences_wip.dat";
		} else {
			local15 = "jagex_" + arg0 + "_preferences.dat";
		}
		@Pc(77) String[] local77 = new String[] { "c:/rscache/", "/rscache/", aString270, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(84) int local84 = 0; local84 < local77.length; local84++) {
			@Pc(96) String local96 = local77[local84];
			if (local96.length() <= 0 || (new File(local96)).exists()) {
				try {
					return new Class223(new File(local96, local15), "rw", 10000L);
				} catch (@Pc(122) Exception local122) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(ILjava/lang/String;I)Lloader!cs;")
	private static Class223 method5775(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(24) String local24;
		if (arg1 == 33) {
			local24 = "jagex_" + arg0 + "_preferences2_rc.dat";
		} else if (arg1 == 34) {
			local24 = "jagex_" + arg0 + "_preferences2_wip.dat";
		} else {
			local24 = "jagex_" + arg0 + "_preferences2.dat";
		}
		@Pc(88) String[] local88 = new String[] { "c:/rscache/", "/rscache/", aString270, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(90) int local90 = 0; local90 < local88.length; local90++) {
			@Pc(98) String local98 = local88[local90];
			if (local98.length() <= 0 || (new File(local98)).exists()) {
				try {
					return new Class223(new File(local98, local24), "rw", 10000L);
				} catch (@Pc(122) Exception local122) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
	private static File method5790(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(4) File local4 = (File) aHashtable1.get(arg1);
		if (local4 != null) {
			return local4;
		}
		@Pc(45) String[] local45 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString270, "/tmp/", "" };
		@Pc(70) String[] local70 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(72) int local72 = 0; local72 < 2; local72++) {
			for (@Pc(77) int local77 = 0; local77 < local70.length; local77++) {
				for (@Pc(87) int local87 = 0; local87 < local45.length; local87++) {
					@Pc(121) String local121 = local45[local87] + local70[local77] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(123) RandomAccessFile local123 = null;
					try {
						@Pc(128) File local128 = new File(local121);
						if (local72 != 0 || local128.exists()) {
							@Pc(138) String local138 = local45[local87];
							if (local72 != 1 || local138.length() <= 0 || (new File(local138)).exists()) {
								(new File(local45[local87] + local70[local77])).mkdir();
								if (arg0 != null) {
									(new File(local45[local87] + local70[local77] + "/" + arg0)).mkdir();
								}
								local123 = new RandomAccessFile(local128, "rw");
								@Pc(205) int local205 = local123.read();
								local123.seek(0L);
								local123.write(local205);
								local123.seek(0L);
								local123.close();
								aHashtable1.put(arg1, local128);
								return local128;
							}
						}
					} catch (@Pc(224) Exception local224) {
						try {
							if (local123 != null) {
								local123.close();
							}
						} catch (@Pc(233) Exception local233) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!de", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class224(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anInt6872 = arg1;
		aString266 = "Unknown";
		this.aString269 = arg2;
		this.anApplet2 = arg0;
		aString265 = "1.1";
		try {
			aString266 = System.getProperty("java.vendor");
			aString265 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString263 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString263 = "Unknown";
		}
		aString268 = aString263.toLowerCase();
		try {
			aString267 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString267 = "";
		}
		try {
			aString264 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString264 = "";
		}
		try {
			aString270 = System.getProperty("user.home");
			if (aString270 != null) {
				aString270 = aString270 + "/";
			}
		} catch (@Pc(87) Exception local87) {
		}
		if (aString270 == null) {
			aString270 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(98) Throwable local98) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(125) Exception local125) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(152) Exception local152) {
		}
		this.aClass223_1 = new Class223(method5790(null, "random.dat", this.anInt6872), "rw", 25L);
		this.aClass223_2 = new Class223(this.method5786("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass223_3 = new Class223(this.method5786("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass223Array1 = new Class223[arg3];
		for (@Pc(193) int local193 = 0; local193 < arg3; local193++) {
			this.aClass223Array1[local193] = new Class223(this.method5786("main_file_cache.idx" + local193), "rw", 1048576L);
		}
		try {
			this.aClass227_1 = new Class227();
		} catch (@Pc(225) Throwable local225) {
		}
		try {
			this.aClass225_1 = new Class225();
		} catch (@Pc(232) Throwable local232) {
		}
		@Pc(235) ThreadGroup local235 = Thread.currentThread().getThreadGroup();
		for (@Pc(238) ThreadGroup local238 = local235.getParent(); local238 != null; local238 = local238.getParent()) {
			local235 = local238;
		}
		@Pc(249) Thread[] local249 = new Thread[1000];
		local235.enumerate(local249);
		for (@Pc(255) int local255 = 0; local255 < local249.length; local255++) {
			if (local249[local255] != null && local249[local255].getName().startsWith("AWT")) {
				local249[local255].setPriority(1);
			}
		}
		this.aBoolean455 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(ILjava/awt/Component;II)Lloader!vc;")
	private Class228 method5761(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Point local2 = arg1.getLocationOnScreen();
		if (arg0 != 4949) {
			this.aClass228_2 = null;
		}
		return this.method5766(local2.y + arg3, 14, null, 0, local2.x + arg2);
	}

	@OriginalMember(owner = "loader!de", name = "e", descriptor = "(I)Lloader!vc;")
	private Class228 method5762(@OriginalArg(0) int arg0) {
		return arg0 == 7782 ? this.method5766(0, 18, null, arg0 - 7782, 0) : (Class228) null;
	}

	@OriginalMember(owner = "loader!de", name = "b", descriptor = "(Z)Lloader!la;")
	private Interface11 method5763(@OriginalArg(0) boolean arg0) {
		return arg0 ? (Interface11) null : this.anInterface11_1;
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(Ljava/awt/Frame;I)Lloader!vc;")
	private Class228 method5765(@OriginalArg(0) Frame arg0) {
		return this.method5766(0, 7, arg0, 0, 0);
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(IILjava/lang/Object;II)Lloader!vc;")
	private Class228 method5766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class228 local3 = new Class228();
		local3.anInt6880 = arg1;
		local3.anInt6879 = arg4;
		if (arg3 != 0) {
			aString265 = null;
		}
		local3.anInt6881 = arg0;
		local3.anObject9 = arg2;
		synchronized (this) {
			if (this.aClass228_1 == null) {
				this.aClass228_1 = this.aClass228_2 = local3;
			} else {
				this.aClass228_1.aClass228_3 = local3;
				this.aClass228_1 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(IIIIB)Lloader!vc;")
	private Class228 method5767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.method5766(arg0 + (arg1 << 16), 6, null, 0, (arg3 << 16) + arg2);
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(ZI)Lloader!vc;")
	private Class228 method5768(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (!arg0) {
			this.method5779();
		}
		return this.method5766(0, 3, null, 0, arg1);
	}

	@OriginalMember(owner = "loader!de", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class228 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean455) {
						return;
					}
					if (this.aClass228_2 != null) {
						local15 = this.aClass228_2;
						this.aClass228_2 = this.aClass228_2.aClass228_3;
						if (this.aClass228_2 == null) {
							this.aClass228_1 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(32) InterruptedException local32) {
					}
				}
			}
			try {
				@Pc(44) int local44 = local15.anInt6880;
				if (local44 == 1) {
					if (aLong216 > Class222.method5753()) {
						throw new IOException();
					}
					local15.anObject10 = new Socket(InetAddress.getByName((String) local15.anObject9), local15.anInt6879);
				} else if (local44 == 2) {
					@Pc(59) Thread local59 = new Thread((Runnable) local15.anObject9);
					local59.setDaemon(true);
					local59.start();
					local59.setPriority(local15.anInt6879);
					local15.anObject10 = local59;
				} else if (local44 == 4) {
					if (aLong216 > Class222.method5753()) {
						throw new IOException();
					}
					local15.anObject10 = new DataInputStream(((URL) local15.anObject9).openStream());
				} else {
					@Pc(115) Object[] local115;
					if (local44 == 8) {
						local115 = (Object[]) local15.anObject9;
						if (((Class) local115[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject10 = ((Class) local115[0]).getDeclaredMethod((String) local115[1], (Class[]) local115[2]);
					} else if (local44 == 9) {
						local115 = (Object[]) local15.anObject9;
						if (((Class) local115[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject10 = ((Class) local115[0]).getDeclaredField((String) local115[1]);
					} else if (local44 == 18) {
						@Pc(146) Clipboard local146 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject10 = local146.getContents(null);
					} else if (local44 == 19) {
						@Pc(159) Transferable local159 = (Transferable) local15.anObject9;
						@Pc(162) Clipboard local162 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local162.setContents(local159, null);
					} else {
						@Pc(219) String local219;
						if (local44 == 3) {
							if (aLong216 > Class222.method5753()) {
								throw new IOException();
							}
							local219 = (local15.anInt6879 >> 24 & 0xFF) + "." + (local15.anInt6879 >> 16 & 0xFF) + "." + (local15.anInt6879 >> 8 & 0xFF) + "." + (local15.anInt6879 & 0xFF);
							local15.anObject10 = InetAddress.getByName(local219).getHostName();
						} else if (local44 == 21) {
							if (Class222.method5753() < aLong216) {
								throw new IOException();
							}
							local15.anObject10 = InetAddress.getByName((String) local15.anObject9).getAddress();
						} else if (local44 == 5) {
							local15.anObject10 = this.aClass227_1.method5798();
						} else if (local44 == 6) {
							@Pc(812) Frame local812 = new Frame("Jagex Full Screen");
							local15.anObject10 = local812;
							local812.setResizable(false);
							this.aClass227_1.method5797(local15.anInt6881 >> 16, local812, local15.anInt6881 & 0xFFFF, local15.anInt6879 >>> 16, local15.anInt6879 & 0xFFFF);
						} else if (local44 == 7) {
							this.aClass227_1.method5800();
						} else {
							@Pc(295) Runtime local295;
							@Pc(306) Method local306;
							@Pc(293) Class[] local293;
							if (local44 == 10) {
								local293 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local295 = Runtime.getRuntime();
								if (!aString268.startsWith("mac")) {
									local306 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local293);
									local306.setAccessible(true);
									local306.invoke(local295, local15.anObject9, "jawt");
									local306.setAccessible(false);
								}
								local306 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local293);
								local306.setAccessible(true);
								if (aString268.startsWith("linux") || aString268.startsWith("sunos")) {
									local306.invoke(local295, local15.anObject9, this.method5786("libjaggl_dri.so").toString());
									@Pc(370) Class local370 = ((Class) local15.anObject9).getClassLoader().loadClass("jaggl.X11.dri");
									local370.getMethod("bind").invoke(null);
									local306.invoke(local295, local15.anObject9, this.method5786("libjaggl.so").toString());
									local370.getMethod("close").invoke(null);
								} else if (aString268.startsWith("mac")) {
									local306.invoke(local295, local15.anObject9, this.method5786("libjaggl.jnilib").toString());
								} else if (aString268.startsWith("win")) {
									local306.invoke(local295, local15.anObject9, this.method5786("jaggl.dll").toString());
								} else {
									throw new Exception();
								}
								local306.setAccessible(false);
							} else {
								@Pc(488) int local488;
								if (local44 == 11) {
									@Pc(475) Field local475 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local475.setAccessible(true);
									@Pc(486) Vector local486 = (Vector) local475.get(((Class) local15.anObject9).getClassLoader());
									for (local488 = 0; local488 < local486.size(); local488++) {
										@Pc(496) Object local496 = local486.elementAt(local488);
										@Pc(503) Method local503 = local496.getClass().getDeclaredMethod("finalize");
										local503.setAccessible(true);
										local503.invoke(local496);
										local503.setAccessible(false);
										@Pc(520) Field local520 = local496.getClass().getDeclaredField("handle");
										local520.setAccessible(true);
										local520.set(local496, Integer.valueOf(0));
										local520.setAccessible(false);
									}
									local475.setAccessible(false);
								} else {
									@Pc(549) Class223 local549;
									if (local44 == 12) {
										local549 = method5764(this.aString269, this.anInt6872);
										local15.anObject10 = local549;
									} else if (local44 == 13) {
										local549 = method5775(this.aString269, this.anInt6872);
										local15.anObject10 = local549;
									} else if (local44 == 14) {
										@Pc(575) int local575 = local15.anInt6879;
										@Pc(578) int local578 = local15.anInt6881;
										this.aClass225_1.method5794(local578, local575);
									} else if (local44 == 15) {
										@Pc(598) boolean local598 = local15.anInt6879 != 0;
										@Pc(602) Component local602 = (Component) local15.anObject9;
										this.aClass225_1.method5793(local602, local598);
									} else if (local44 == 17) {
										local115 = (Object[]) local15.anObject9;
										this.aClass225_1.method5795((int[]) local115[1], (Component) local115[0], local15.anInt6879, (Point) local115[2], local15.anInt6881);
									} else if (local44 == 16) {
										try {
											if (!aString268.startsWith("win")) {
												throw new Exception();
											}
											local219 = (String) local15.anObject9;
											if (!local219.startsWith("http://") && !local219.startsWith("https://")) {
												throw new Exception();
											}
											@Pc(643) String local643 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
											for (local488 = 0; local488 < local219.length(); local488++) {
												if (local643.indexOf(local219.charAt(local488)) == -1) {
													throw new Exception();
												}
											}
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local219 + "\"");
											local15.anObject10 = null;
										} catch (@Pc(684) Exception local684) {
											local15.anObject10 = local684;
										}
									} else if (local44 == 20) {
										try {
											local293 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
											local295 = Runtime.getRuntime();
											local306 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local293);
											local306.setAccessible(true);
											if (aString268.startsWith("win")) {
												if (aString267.startsWith("amd64") || aString267.startsWith("x86_64")) {
													local306.invoke(local295, local15.anObject9, this.method5786("jagmisc64.dll").toString());
												} else {
													local306.invoke(local295, local15.anObject9, this.method5786("jagmisc.dll").toString());
												}
											}
											local306.setAccessible(false);
										} catch (@Pc(776) Throwable local776) {
											local15.anObject10 = local776;
										}
									} else {
										throw new Exception("");
									}
								}
							}
						}
					}
				}
				local15.anInt6882 = 1;
			} catch (@Pc(899) ThreadDeath local899) {
				throw local899;
			} catch (@Pc(902) Throwable local902) {
				local15.anInt6882 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(ILjava/lang/Object;III)Lloader!vc;")
	private Class228 method5769(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class228 local3 = new Class228();
		synchronized (local3) {
			local3.anInt6879 = arg0;
			local3.anInt6880 = arg4;
			local3.anObject9 = arg1;
			local3.anInt6881 = arg3;
			if (arg2 != 11) {
				return (Class228) null;
			}
			synchronized (this) {
				if (this.aClass228_1 == null) {
					this.aClass228_1 = this.aClass228_2 = local3;
				} else {
					this.aClass228_1.aClass228_3 = local3;
					this.aClass228_1 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(63) InterruptedException local63) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(Z)Lloader!vc;")
	private Class228 method5770(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.aClass223_2 = null;
		}
		return this.method5766(0, 13, null, 0, 0);
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(Ljava/lang/String;I)Lloader!vc;")
	private Class228 method5771(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= -47) {
			this.method5763(true);
		}
		return this.method5766(0, 21, arg0, 0, 0);
	}

	@OriginalMember(owner = "loader!de", name = "b", descriptor = "(I)Lloader!vc;")
	private Class228 method5772(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method5778((byte) 9, null);
		}
		return this.method5766(0, 12, null, 0, 0);
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(ZLjava/lang/Class;)Lloader!vc;")
	private Class228 method5773(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class arg1) {
		if (!arg0) {
			this.method5762(-27);
		}
		return this.method5766(0, 11, arg1, 0, 0);
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(Ljava/lang/Class;I)Lloader!vc;")
	private Class228 method5774(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method5772(-53);
		}
		return this.method5766(0, 10, arg0, 0, 0);
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(ILjava/awt/Component;ILjava/awt/Point;I[I)Lloader!vc;")
	private Class228 method5776(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Point arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		if (arg2 <= 88) {
			this.run();
		}
		return this.method5766(arg4, 17, new Object[] { arg1, arg5, arg3 }, 0, arg0);
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(BZLjava/awt/Component;)Lloader!vc;")
	private Class228 method5777(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1) {
		return this.method5766(0, 15, arg1, 0, arg0 ? 1 : 0);
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(BLjava/awt/datatransfer/Transferable;)Lloader!vc;")
	private Class228 method5778(@OriginalArg(0) byte arg0, @OriginalArg(1) Transferable arg1) {
		if (arg0 > -94) {
			this.method5792(-54, -106, null);
		}
		return this.method5766(0, 19, arg1, 0, 0);
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(B)Lloader!vc;")
	private Class228 method5779() {
		return this.method5766(0, 5, null, 0, 0);
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(Ljava/net/URL;I)Lloader!vc;")
	private Class228 method5780(@OriginalArg(0) URL arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 10000) {
			this.method5783(null, false, -118);
		}
		return this.method5766(0, 4, arg0, 0, 0);
	}

	@OriginalMember(owner = "loader!de", name = "c", descriptor = "(I)Z")
	private boolean method5781(@OriginalArg(0) int arg0) {
		if (arg0 > -43) {
			this.method5763(false);
		}
		return this.aClass227_1 != null;
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;Z)Lloader!vc;")
	private Class228 method5782(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) Class[] arg2, @OriginalArg(3) boolean arg3) {
		if (arg3) {
			aString268 = null;
		}
		return this.method5766(0, 8, new Object[] { arg1, arg0, arg2 }, 0, 0);
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(Ljava/lang/Runnable;ZI)Lloader!vc;")
	private Class228 method5783(@OriginalArg(0) Runnable arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg1) {
			aMethod3 = null;
		}
		return this.method5766(0, 2, arg0, 0, arg2);
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(I)V")
	private void method5784(@OriginalArg(0) int arg0) {
		synchronized (this) {
			this.aBoolean455 = true;
			this.notifyAll();
			if (arg0 != 0) {
				this.aClass223_1 = null;
			}
		}
		try {
			this.aThread4.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		if (this.aClass223_2 != null) {
			try {
				this.aClass223_2.method5758();
			} catch (@Pc(37) IOException local37) {
			}
		}
		if (this.aClass223_3 != null) {
			try {
				this.aClass223_3.method5758();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass223Array1 != null) {
			for (@Pc(53) int local53 = 0; local53 < this.aClass223Array1.length; local53++) {
				if (this.aClass223Array1[local53] != null) {
					try {
						this.aClass223Array1[local53].method5758();
					} catch (@Pc(76) IOException local76) {
					}
				}
			}
		}
		if (this.aClass223_1 != null) {
			try {
				this.aClass223_1.method5758();
			} catch (@Pc(89) IOException local89) {
			}
		}
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(ILjava/lang/String;)Lloader!vc;")
	private Class228 method5785(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 <= 73) {
			this.method5777(false, null);
		}
		return this.method5766(0, 16, arg1, 0, 0);
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(BLjava/lang/String;)Ljava/io/File;")
	public File method5786(@OriginalArg(1) String arg0) {
		return method5790(this.aString269, arg0, this.anInt6872);
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
	private byte[] method5787(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			aString266 = null;
		}
		@Pc(13) Class228 local13 = this.method5769(0, arg0, 11, 0, 21);
		return (byte[]) local13.anObject10;
	}

	@OriginalMember(owner = "loader!de", name = "b", descriptor = "(Ljava/lang/Class;I)Lloader!vc;")
	private Class228 method5788(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		return arg1 == 13 ? this.method5766(0, 20, arg0, arg1 - 13, 0) : (Class228) null;
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lloader!vc;")
	private Class228 method5789(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2) {
		return arg0 == 9236 ? this.method5766(0, 9, new Object[] { arg2, arg1 }, arg0 ^ 0x2414, 0) : (Class228) null;
	}

	@OriginalMember(owner = "loader!de", name = "d", descriptor = "(I)V")
	private void method5791(@OriginalArg(0) int arg0) {
		if (arg0 >= -70) {
			this.aClass223_3 = null;
		}
		aLong216 = Class222.method5753() + 5000L;
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(IILjava/lang/String;)Lloader!vc;")
	private Class228 method5792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		return arg0 == 0 ? this.method5766(0, 1, arg2, 0, arg1) : (Class228) null;
	}
}
