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

@OriginalClass("loader!kq")
public final class Class226 implements Runnable {

	@OriginalMember(owner = "loader!kq", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString263;

	@OriginalMember(owner = "loader!kq", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString264;

	@OriginalMember(owner = "loader!kq", name = "m", descriptor = "Ljava/lang/String;")
	private static String aString265;

	@OriginalMember(owner = "loader!kq", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString266;

	@OriginalMember(owner = "loader!kq", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString267;

	@OriginalMember(owner = "loader!kq", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString269;

	@OriginalMember(owner = "loader!kq", name = "l", descriptor = "Ljava/lang/String;")
	private static String aString270;

	@OriginalMember(owner = "loader!kq", name = "q", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!kq", name = "r", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!kq", name = "b", descriptor = "I")
	private static final int anInt6562 = 1;

	@OriginalMember(owner = "loader!kq", name = "x", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!kq", name = "s", descriptor = "J")
	private static volatile long aLong219 = 0L;

	@OriginalMember(owner = "loader!kq", name = "A", descriptor = "Lloader!uh;")
	private Interface11 anInterface11_1;

	@OriginalMember(owner = "loader!kq", name = "a", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!kq", name = "v", descriptor = "Lloader!mq;")
	private Class227 aClass227_1 = null;

	@OriginalMember(owner = "loader!kq", name = "d", descriptor = "Lloader!jc;")
	private Class225 aClass225_2 = null;

	@OriginalMember(owner = "loader!kq", name = "e", descriptor = "Z")
	private boolean aBoolean592 = false;

	@OriginalMember(owner = "loader!kq", name = "z", descriptor = "Lloader!mq;")
	private Class227 aClass227_2 = null;

	@OriginalMember(owner = "loader!kq", name = "u", descriptor = "Lloader!jc;")
	private Class225 aClass225_1 = null;

	@OriginalMember(owner = "loader!kq", name = "c", descriptor = "Lloader!jc;")
	private Class225 aClass225_3 = null;

	@OriginalMember(owner = "loader!kq", name = "f", descriptor = "I")
	private final int anInt6563;

	@OriginalMember(owner = "loader!kq", name = "w", descriptor = "Ljava/lang/String;")
	private String aString268;

	@OriginalMember(owner = "loader!kq", name = "n", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!kq", name = "o", descriptor = "[Lloader!jc;")
	private Class225[] aClass225Array1;

	@OriginalMember(owner = "loader!kq", name = "y", descriptor = "Lloader!b;")
	private Class222 aClass222_1;

	@OriginalMember(owner = "loader!kq", name = "k", descriptor = "Lloader!f;")
	private Class223 aClass223_1;

	@OriginalMember(owner = "loader!kq", name = "t", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "loader!kq", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;)Ljava/io/File;")
	private static File method5768(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(13) File local13 = (File) aHashtable2.get(arg0);
		if (local13 != null) {
			return local13;
		}
		@Pc(53) String[] local53 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString266, "/tmp/", "" };
		@Pc(78) String[] local78 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(80) int local80 = 0; local80 < 2; local80++) {
			for (@Pc(87) int local87 = 0; local87 < local78.length; local87++) {
				for (@Pc(93) int local93 = 0; local93 < local53.length; local93++) {
					@Pc(127) String local127 = local53[local93] + local78[local87] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
					@Pc(129) RandomAccessFile local129 = null;
					try {
						@Pc(134) File local134 = new File(local127);
						if (local80 != 0 || local134.exists()) {
							@Pc(145) String local145 = local53[local93];
							if (local80 != 1 || local145.length() <= 0 || (new File(local145)).exists()) {
								(new File(local53[local93] + local78[local87])).mkdir();
								if (arg2 != null) {
									(new File(local53[local93] + local78[local87] + "/" + arg2)).mkdir();
								}
								local129 = new RandomAccessFile(local134, "rw");
								@Pc(214) int local214 = local129.read();
								local129.seek(0L);
								local129.write(local214);
								local129.seek(0L);
								local129.close();
								aHashtable2.put(arg0, local134);
								return local134;
							}
						}
					} catch (@Pc(233) Exception local233) {
						try {
							if (local129 != null) {
								local129.close();
							}
						} catch (@Pc(241) Exception local241) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!kq", name = "b", descriptor = "(Ljava/lang/String;II)Lloader!jc;")
	private static Class225 method5788(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(18) String local18;
		if (arg1 == 33) {
			local18 = "jagex_" + arg0 + "_preferences2_rc.dat";
		} else if (arg1 == 34) {
			local18 = "jagex_" + arg0 + "_preferences2_wip.dat";
		} else {
			local18 = "jagex_" + arg0 + "_preferences2.dat";
		}
		@Pc(77) String[] local77 = new String[] { "c:/rscache/", "/rscache/", aString266, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
			@Pc(91) String local91 = local77[local79];
			if (local91.length() <= 0 || (new File(local91)).exists()) {
				try {
					return new Class225(new File(local91, local18), "rw", 10000L);
				} catch (@Pc(118) Exception local118) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!kq", name = "a", descriptor = "(IBLjava/lang/String;)Lloader!jc;")
	private static Class225 method5792(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(23) String local23;
		if (arg0 == 33) {
			local23 = "jagex_" + arg1 + "_preferences_rc.dat";
		} else if (arg0 == 34) {
			local23 = "jagex_" + arg1 + "_preferences_wip.dat";
		} else {
			local23 = "jagex_" + arg1 + "_preferences.dat";
		}
		@Pc(87) String[] local87 = new String[] { "c:/rscache/", "/rscache/", aString266, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(89) int local89 = 0; local89 < local87.length; local89++) {
			@Pc(101) String local101 = local87[local89];
			if (local101.length() <= 0 || (new File(local101)).exists()) {
				try {
					return new Class225(new File(local101, local23), "rw", 10000L);
				} catch (@Pc(124) Exception local124) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!kq", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class226(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString264 = "Unknown";
		this.anApplet2 = arg0;
		this.anInt6563 = arg1;
		aString263 = "1.1";
		this.aString268 = arg2;
		try {
			aString264 = System.getProperty("java.vendor");
			aString263 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString270 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString270 = "Unknown";
		}
		aString269 = aString270.toLowerCase();
		try {
			aString265 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString265 = "";
		}
		try {
			aString267 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString267 = "";
		}
		try {
			aString266 = System.getProperty("user.home");
			if (aString266 != null) {
				aString266 = aString266 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (aString266 == null) {
			aString266 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(151) Exception local151) {
		}
		this.aClass225_1 = new Class225(method5768("random.dat", this.anInt6563, null), "rw", 25L);
		this.aClass225_3 = new Class225(this.method5783("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass225_2 = new Class225(this.method5783("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass225Array1 = new Class225[arg3];
		for (@Pc(192) int local192 = 0; local192 < arg3; local192++) {
			this.aClass225Array1[local192] = new Class225(this.method5783("main_file_cache.idx" + local192), "rw", 1048576L);
		}
		try {
			this.aClass222_1 = new Class222();
		} catch (@Pc(224) Throwable local224) {
		}
		try {
			this.aClass223_1 = new Class223();
		} catch (@Pc(231) Throwable local231) {
		}
		@Pc(234) ThreadGroup local234 = Thread.currentThread().getThreadGroup();
		for (@Pc(237) ThreadGroup local237 = local234.getParent(); local237 != null; local237 = local237.getParent()) {
			local234 = local237;
		}
		@Pc(249) Thread[] local249 = new Thread[1000];
		local234.enumerate(local249);
		for (@Pc(255) int local255 = 0; local255 < local249.length; local255++) {
			if (local249[local255] != null && local249[local255].getName().startsWith("AWT")) {
				local249[local255].setPriority(1);
			}
		}
		this.aBoolean592 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!kq", name = "c", descriptor = "(I)Lloader!mq;")
	private Class227 method5764(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? this.method5778(0, null, (byte) -44, 0, 12) : (Class227) null;
	}

	@OriginalMember(owner = "loader!kq", name = "a", descriptor = "(Ljava/lang/String;I)Lloader!mq;")
	private Class227 method5765(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method5778(-7, null, (byte) -97, 10, -122);
		}
		return this.method5778(0, arg0, (byte) -44, 0, 16);
	}

	@OriginalMember(owner = "loader!kq", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;ILjava/lang/String;)Lloader!mq;")
	private Class227 method5766(@OriginalArg(0) Class arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		if (arg2 >= -77) {
			this.method5774((byte) 30, false, null);
		}
		return this.method5778(0, new Object[] { arg0, arg3, arg1 }, (byte) -44, 0, 8);
	}

	@OriginalMember(owner = "loader!kq", name = "a", descriptor = "(B)Z")
	private boolean method5767(@OriginalArg(0) byte arg0) {
		if (arg0 < 0) {
			return true;
		} else {
			return this.aClass222_1 != null;
		}
	}

	@OriginalMember(owner = "loader!kq", name = "a", descriptor = "(ZLjava/lang/Class;Ljava/lang/String;)Lloader!mq;")
	private Class227 method5769(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) String arg2) {
		return arg0 ? this.method5778(0, new Object[] { arg1, arg2 }, (byte) -44, 0, 9) : (Class227) null;
	}

	@OriginalMember(owner = "loader!kq", name = "a", descriptor = "(IBIII)Lloader!mq;")
	private Class227 method5770(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method5778(arg0 + (arg3 << 16), null, (byte) -44, (arg2 << 16) + arg1, 6);
	}

	@OriginalMember(owner = "loader!kq", name = "b", descriptor = "(I)Lloader!mq;")
	private Class227 method5771(@OriginalArg(0) int arg0) {
		if (arg0 < 91) {
			this.aClass225Array1 = null;
		}
		return this.method5778(0, null, (byte) -44, 0, 13);
	}

	@OriginalMember(owner = "loader!kq", name = "a", descriptor = "(IIBLjava/awt/Component;)Lloader!mq;")
	private Class227 method5772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) Component arg3) {
		if (arg2 < 7) {
			this.method5769(true, null, null);
		}
		@Pc(13) Point local13 = arg3.getLocationOnScreen();
		return this.method5778(arg0 + local13.y, null, (byte) -44, arg1 + local13.x, 14);
	}

	@OriginalMember(owner = "loader!kq", name = "a", descriptor = "(Ljava/net/URL;I)Lloader!mq;")
	private Class227 method5773(@OriginalArg(0) URL arg0, @OriginalArg(1) int arg1) {
		if (arg1 != -24458) {
			this.method5787(null, -50);
		}
		return this.method5778(0, arg0, (byte) -44, 0, 4);
	}

	@OriginalMember(owner = "loader!kq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class227 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean592) {
						return;
					}
					if (this.aClass227_2 != null) {
						local16 = this.aClass227_2;
						this.aClass227_2 = this.aClass227_2.aClass227_3;
						if (this.aClass227_2 == null) {
							this.aClass227_1 = null;
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
				@Pc(44) int local44 = local16.anInt6570;
				if (local44 == 1) {
					if (Class228.method5808() < aLong219) {
						throw new IOException();
					}
					local16.anObject9 = new Socket(InetAddress.getByName((String) local16.anObject10), local16.anInt6569);
				} else if (local44 == 2) {
					@Pc(878) Thread local878 = new Thread((Runnable) local16.anObject10);
					local878.setDaemon(true);
					local878.start();
					local878.setPriority(local16.anInt6569);
					local16.anObject9 = local878;
				} else if (local44 == 4) {
					if (Class228.method5808() < aLong219) {
						throw new IOException();
					}
					local16.anObject9 = new DataInputStream(((URL) local16.anObject10).openStream());
				} else {
					@Pc(111) Object[] local111;
					if (local44 == 8) {
						local111 = (Object[]) local16.anObject10;
						if (((Class) local111[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject9 = ((Class) local111[0]).getDeclaredMethod((String) local111[1], (Class[]) local111[2]);
					} else if (local44 == 9) {
						local111 = (Object[]) local16.anObject10;
						if (((Class) local111[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject9 = ((Class) local111[0]).getDeclaredField((String) local111[1]);
					} else if (local44 == 18) {
						@Pc(838) Clipboard local838 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.anObject9 = local838.getContents(null);
					} else if (local44 == 19) {
						@Pc(827) Transferable local827 = (Transferable) local16.anObject10;
						@Pc(830) Clipboard local830 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local830.setContents(local827, null);
					} else {
						@Pc(202) String local202;
						if (local44 == 3) {
							if (aLong219 > Class228.method5808()) {
								throw new IOException();
							}
							local202 = (local16.anInt6569 >> 24 & 0xFF) + "." + (local16.anInt6569 >> 16 & 0xFF) + "." + (local16.anInt6569 >> 8 & 0xFF) + "." + (local16.anInt6569 & 0xFF);
							local16.anObject9 = InetAddress.getByName(local202).getHostName();
						} else if (local44 == 21) {
							if (Class228.method5808() < aLong219) {
								throw new IOException();
							}
							local16.anObject9 = InetAddress.getByName((String) local16.anObject10).getAddress();
						} else if (local44 == 5) {
							local16.anObject9 = this.aClass222_1.method5742();
						} else if (local44 == 6) {
							@Pc(233) Frame local233 = new Frame("Jagex Full Screen");
							local16.anObject9 = local233;
							local233.setResizable(false);
							this.aClass222_1.method5743(local233, local16.anInt6571 & 0xFFFF, local16.anInt6569 >>> 16, local16.anInt6571 >> 16, local16.anInt6569 & 0xFFFF);
						} else if (local44 == 7) {
							this.aClass222_1.method5744();
						} else {
							@Pc(282) Class[] local282;
							@Pc(284) Runtime local284;
							@Pc(295) Method local295;
							if (local44 == 10) {
								local282 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local284 = Runtime.getRuntime();
								if (!aString269.startsWith("mac")) {
									local295 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local282);
									local295.setAccessible(true);
									local295.invoke(local284, local16.anObject10, "jawt");
									local295.setAccessible(false);
								}
								local295 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local282);
								local295.setAccessible(true);
								if (aString269.startsWith("linux") || aString269.startsWith("sunos")) {
									local295.invoke(local284, local16.anObject10, this.method5783("libjaggl_dri.so").toString());
									@Pc(359) Class local359 = ((Class) local16.anObject10).getClassLoader().loadClass("jaggl.X11.dri");
									local359.getMethod("bind").invoke(null);
									local295.invoke(local284, local16.anObject10, this.method5783("libjaggl.so").toString());
									local359.getMethod("close").invoke(null);
								} else if (aString269.startsWith("mac")) {
									local295.invoke(local284, local16.anObject10, this.method5783("libjaggl.jnilib").toString());
								} else if (aString269.startsWith("win")) {
									local295.invoke(local284, local16.anObject10, this.method5783("jaggl.dll").toString());
								} else {
									throw new Exception();
								}
								local295.setAccessible(false);
							} else {
								@Pc(620) int local620;
								if (local44 == 11) {
									@Pc(732) Field local732 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local732.setAccessible(true);
									@Pc(743) Vector local743 = (Vector) local732.get(((Class) local16.anObject10).getClassLoader());
									for (local620 = 0; local620 < local743.size(); local620++) {
										@Pc(753) Object local753 = local743.elementAt(local620);
										@Pc(760) Method local760 = local753.getClass().getDeclaredMethod("finalize");
										local760.setAccessible(true);
										local760.invoke(local753);
										local760.setAccessible(false);
										@Pc(777) Field local777 = local753.getClass().getDeclaredField("handle");
										local777.setAccessible(true);
										local777.set(local753, Integer.valueOf(0));
										local777.setAccessible(false);
									}
									local732.setAccessible(false);
								} else {
									@Pc(712) Class225 local712;
									if (local44 == 12) {
										local712 = method5792(this.anInt6563, this.aString268);
										local16.anObject9 = local712;
									} else if (local44 == 13) {
										local712 = method5788(this.aString268, this.anInt6563);
										local16.anObject9 = local712;
									} else if (local44 == 14) {
										@Pc(473) int local473 = local16.anInt6569;
										@Pc(476) int local476 = local16.anInt6571;
										this.aClass223_1.method5754(local476, local473);
									} else if (local44 == 15) {
										@Pc(694) boolean local694 = local16.anInt6569 != 0;
										@Pc(698) Component local698 = (Component) local16.anObject10;
										this.aClass223_1.method5755(local694, local698);
									} else if (local44 == 17) {
										local111 = (Object[]) local16.anObject10;
										this.aClass223_1.method5756((Point) local111[2], local16.anInt6571, (Component) local111[0], (int[]) local111[1], local16.anInt6569);
									} else if (local44 == 16) {
										try {
											if (!aString269.startsWith("win")) {
												throw new Exception();
											}
											local202 = (String) local16.anObject10;
											if (!local202.startsWith("http://") && !local202.startsWith("https://")) {
												throw new Exception();
											}
											@Pc(618) String local618 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
											for (local620 = 0; local620 < local202.length(); local620++) {
												if (local618.indexOf(local202.charAt(local620)) == -1) {
													throw new Exception();
												}
											}
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local202 + "\"");
											local16.anObject9 = null;
										} catch (@Pc(656) Exception local656) {
											local16.anObject9 = local656;
										}
									} else if (local44 == 20) {
										try {
											local282 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
											local284 = Runtime.getRuntime();
											local295 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local282);
											local295.setAccessible(true);
											if (aString269.startsWith("win")) {
												if (aString265.startsWith("amd64") || aString265.startsWith("x86_64")) {
													local295.invoke(local284, local16.anObject10, this.method5783("jagmisc64.dll").toString());
												} else {
													local295.invoke(local284, local16.anObject10, this.method5783("jagmisc.dll").toString());
												}
											}
											local295.setAccessible(false);
										} catch (@Pc(583) Throwable local583) {
											local16.anObject9 = local583;
										}
									} else {
										throw new Exception("");
									}
								}
							}
						}
					}
				}
				local16.anInt6568 = 1;
			} catch (@Pc(895) ThreadDeath local895) {
				throw local895;
			} catch (@Pc(898) Throwable local898) {
				local16.anInt6568 = 2;
			}
			synchronized (local16) {
				local16.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!kq", name = "a", descriptor = "(BZLjava/awt/Component;)Lloader!mq;")
	private Class227 method5774(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) {
		if (arg0 > -96) {
			this.aThread4 = null;
		}
		return this.method5778(0, arg2, (byte) -44, arg1 ? 1 : 0, 15);
	}

	@OriginalMember(owner = "loader!kq", name = "b", descriptor = "(Ljava/lang/String;I)Lloader!mq;")
	private Class227 method5775(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return arg1 < 120 ? (Class227) null : this.method5778(0, arg0, (byte) -44, 0, 21);
	}

	@OriginalMember(owner = "loader!kq", name = "d", descriptor = "(I)Lloader!mq;")
	private Class227 method5776(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.aClass227_1 = null;
		}
		return this.method5778(0, null, (byte) -44, 0, 18);
	}

	@OriginalMember(owner = "loader!kq", name = "a", descriptor = "(IBIILjava/lang/Object;)Lloader!mq;")
	private Class227 method5777(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(3) Class227 local3 = new Class227();
		synchronized (local3) {
			local3.anInt6569 = arg2;
			local3.anObject10 = arg3;
			local3.anInt6570 = arg1;
			local3.anInt6571 = arg0;
			synchronized (this) {
				if (this.aClass227_1 == null) {
					this.aClass227_1 = this.aClass227_2 = local3;
				} else {
					this.aClass227_1.aClass227_3 = local3;
					this.aClass227_1 = local3;
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

	@OriginalMember(owner = "loader!kq", name = "a", descriptor = "(ILjava/lang/Object;BII)Lloader!mq;")
	private Class227 method5778(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class227 local3 = new Class227();
		local3.anObject10 = arg1;
		local3.anInt6570 = arg4;
		local3.anInt6569 = arg3;
		local3.anInt6571 = arg0;
		synchronized (this) {
			if (this.aClass227_1 == null) {
				this.aClass227_1 = this.aClass227_2 = local3;
			} else {
				this.aClass227_1.aClass227_3 = local3;
				this.aClass227_1 = local3;
			}
			this.notify();
			if (arg2 != -44) {
				aLong219 = 73L;
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!kq", name = "a", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method5779(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(7) Class227 local7 = this.method5777(0, 21, 0, arg1);
		if (arg0 != -6552) {
			aString270 = null;
		}
		return (byte[]) local7.anObject9;
	}

	@OriginalMember(owner = "loader!kq", name = "b", descriptor = "(ILjava/lang/Class;)Lloader!mq;")
	private Class227 method5780(@OriginalArg(1) Class arg0) {
		return this.method5778(0, arg0, (byte) -44, 0, 20);
	}

	@OriginalMember(owner = "loader!kq", name = "b", descriptor = "(B)V")
	private void method5781(@OriginalArg(0) byte arg0) {
		synchronized (this) {
			this.aBoolean592 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass225_3 != null) {
			try {
				this.aClass225_3.method5762(arg0 ^ 0xFFFFE0DE);
			} catch (@Pc(33) IOException local33) {
			}
		}
		if (this.aClass225_2 != null) {
			try {
				this.aClass225_2.method5762(-8060);
			} catch (@Pc(43) IOException local43) {
			}
		}
		if (this.aClass225Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass225Array1.length; local50++) {
				if (this.aClass225Array1[local50] != null) {
					try {
						this.aClass225Array1[local50].method5762(-8060);
					} catch (@Pc(73) IOException local73) {
					}
				}
			}
		}
		if (arg0 == 90 && this.aClass225_1 != null) {
			try {
				this.aClass225_1.method5762(arg0 - 8150);
			} catch (@Pc(91) IOException local91) {
			}
		}
	}

	@OriginalMember(owner = "loader!kq", name = "a", descriptor = "(ZI)Lloader!mq;")
	private Class227 method5782(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg0) {
			method5792(-121, null);
		}
		return this.method5778(0, null, (byte) -44, arg1, 3);
	}

	@OriginalMember(owner = "loader!kq", name = "b", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public File method5783(@OriginalArg(1) String arg0) {
		return method5768(arg0, this.anInt6563, this.aString268);
	}

	@OriginalMember(owner = "loader!kq", name = "e", descriptor = "(I)Lloader!mq;")
	private Class227 method5784(@OriginalArg(0) int arg0) {
		if (arg0 > -9) {
			this.aString268 = null;
		}
		return this.method5778(0, null, (byte) -44, 0, 5);
	}

	@OriginalMember(owner = "loader!kq", name = "a", descriptor = "(IILjava/awt/Point;Ljava/awt/Component;I[I)Lloader!mq;")
	private Class227 method5785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Point arg2, @OriginalArg(3) Component arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		return arg4 == 17 ? this.method5778(arg1, new Object[] { arg3, arg5, arg2 }, (byte) -44, arg0, 17) : (Class227) null;
	}

	@OriginalMember(owner = "loader!kq", name = "a", descriptor = "(IILjava/lang/Runnable;)Lloader!mq;")
	private Class227 method5786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Runnable arg2) {
		if (arg1 != 29171) {
			this.aClass227_2 = null;
		}
		return this.method5778(0, arg2, (byte) -44, arg0, 2);
	}

	@OriginalMember(owner = "loader!kq", name = "a", descriptor = "(Ljava/lang/Class;I)Lloader!mq;")
	private Class227 method5787(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		return arg1 == -2 ? this.method5778(0, arg0, (byte) -44, 0, 11) : (Class227) null;
	}

	@OriginalMember(owner = "loader!kq", name = "a", descriptor = "(ILjava/lang/Class;)Lloader!mq;")
	private Class227 method5789(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) {
		if (arg0 != 0) {
			this.aString268 = null;
		}
		return this.method5778(0, arg1, (byte) -44, 0, 10);
	}

	@OriginalMember(owner = "loader!kq", name = "a", descriptor = "(ZLjava/awt/Frame;)Lloader!mq;")
	private Class227 method5790(@OriginalArg(0) boolean arg0, @OriginalArg(1) Frame arg1) {
		return arg0 ? this.method5778(0, arg1, (byte) -44, 0, 7) : (Class227) null;
	}

	@OriginalMember(owner = "loader!kq", name = "a", descriptor = "(Ljava/lang/String;II)Lloader!mq;")
	private Class227 method5791(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg2 == 0 ? this.method5778(0, arg0, (byte) -44, arg1, 1) : (Class227) null;
	}

	@OriginalMember(owner = "loader!kq", name = "a", descriptor = "(I)Lloader!uh;")
	private Interface11 method5793() {
		return this.anInterface11_1;
	}

	@OriginalMember(owner = "loader!kq", name = "f", descriptor = "(I)V")
	private void method5794() {
		aLong219 = Class228.method5808() + 5000L;
	}

	@OriginalMember(owner = "loader!kq", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lloader!mq;")
	private Class227 method5795(@OriginalArg(0) int arg0, @OriginalArg(1) Transferable arg1) {
		if (arg0 >= -100) {
			this.method5783(null);
		}
		return this.method5778(0, arg1, (byte) -44, 0, 19);
	}
}
