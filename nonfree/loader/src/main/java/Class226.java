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

@OriginalClass("loader!lh")
public final class Class226 implements Runnable {

	@OriginalMember(owner = "loader!lh", name = "l", descriptor = "Ljava/lang/String;")
	private static String aString265;

	@OriginalMember(owner = "loader!lh", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString266;

	@OriginalMember(owner = "loader!lh", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString268;

	@OriginalMember(owner = "loader!lh", name = "m", descriptor = "Ljava/lang/String;")
	private static String aString269;

	@OriginalMember(owner = "loader!lh", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString270;

	@OriginalMember(owner = "loader!lh", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString271;

	@OriginalMember(owner = "loader!lh", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString272;

	@OriginalMember(owner = "loader!lh", name = "u", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!lh", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!lh", name = "r", descriptor = "I")
	private static final int anInt6902 = 1;

	@OriginalMember(owner = "loader!lh", name = "w", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!lh", name = "s", descriptor = "J")
	private static volatile long aLong260 = 0L;

	@OriginalMember(owner = "loader!lh", name = "z", descriptor = "Lloader!pl;")
	private Interface11 anInterface11_1;

	@OriginalMember(owner = "loader!lh", name = "f", descriptor = "Lloader!vk;")
	private Class228 aClass228_1 = null;

	@OriginalMember(owner = "loader!lh", name = "a", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!lh", name = "b", descriptor = "Lloader!vk;")
	private Class228 aClass228_2 = null;

	@OriginalMember(owner = "loader!lh", name = "p", descriptor = "Z")
	private boolean aBoolean598 = false;

	@OriginalMember(owner = "loader!lh", name = "k", descriptor = "Lloader!dj;")
	private Class222 aClass222_2 = null;

	@OriginalMember(owner = "loader!lh", name = "n", descriptor = "Lloader!vk;")
	private Class228 aClass228_3 = null;

	@OriginalMember(owner = "loader!lh", name = "A", descriptor = "Lloader!dj;")
	private Class222 aClass222_3 = null;

	@OriginalMember(owner = "loader!lh", name = "c", descriptor = "I")
	private final int anInt6903;

	@OriginalMember(owner = "loader!lh", name = "e", descriptor = "Ljava/lang/String;")
	private String aString267;

	@OriginalMember(owner = "loader!lh", name = "v", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!lh", name = "g", descriptor = "[Lloader!vk;")
	private final Class228[] aClass228Array1;

	@OriginalMember(owner = "loader!lh", name = "q", descriptor = "Lloader!e;")
	private Class223 aClass223_1;

	@OriginalMember(owner = "loader!lh", name = "x", descriptor = "Lloader!h;")
	private Class225 aClass225_1;

	@OriginalMember(owner = "loader!lh", name = "y", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!lh", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
	private static File method5741(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg0);
		if (local4 != null) {
			return local4;
		}
		@Pc(53) String[] local53 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString269, "/tmp/", "" };
		@Pc(78) String[] local78 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(80) int local80 = 0; local80 < 2; local80++) {
			for (@Pc(85) int local85 = 0; local85 < local78.length; local85++) {
				for (@Pc(91) int local91 = 0; local91 < local53.length; local91++) {
					@Pc(126) String local126 = local53[local91] + local78[local85] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
					@Pc(128) RandomAccessFile local128 = null;
					try {
						@Pc(133) File local133 = new File(local126);
						if (local80 != 0 || local133.exists()) {
							@Pc(144) String local144 = local53[local91];
							if (local80 != 1 || local144.length() <= 0 || (new File(local144)).exists()) {
								(new File(local53[local91] + local78[local85])).mkdir();
								if (arg2 != null) {
									(new File(local53[local91] + local78[local85] + "/" + arg2)).mkdir();
								}
								local128 = new RandomAccessFile(local133, "rw");
								@Pc(208) int local208 = local128.read();
								local128.seek(0L);
								local128.write(local208);
								local128.seek(0L);
								local128.close();
								aHashtable2.put(arg0, local133);
								return local133;
							}
						}
					} catch (@Pc(227) Exception local227) {
						try {
							if (local128 != null) {
								local128.close();
							}
						} catch (@Pc(237) Exception local237) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!lh", name = "a", descriptor = "(ILjava/lang/String;I)Lloader!vk;")
	private static Class228 method5761(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(13) String local13;
		if (arg1 == 33) {
			local13 = "jagex_" + arg0 + "_preferences2_rc.dat";
		} else if (arg1 == 34) {
			local13 = "jagex_" + arg0 + "_preferences2_wip.dat";
		} else {
			local13 = "jagex_" + arg0 + "_preferences2.dat";
		}
		@Pc(77) String[] local77 = new String[] { "c:/rscache/", "/rscache/", aString269, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
			@Pc(102) String local102 = local77[local79];
			if (local102.length() <= 0 || (new File(local102)).exists()) {
				try {
					return new Class228(new File(local102, local13), "rw", 10000L);
				} catch (@Pc(126) Exception local126) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!lh", name = "a", descriptor = "(ILjava/lang/String;Z)Lloader!vk;")
	private static Class228 method5766(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(26) String local26;
		if (arg0 == 33) {
			local26 = "jagex_" + arg1 + "_preferences_rc.dat";
		} else if (arg0 == 34) {
			local26 = "jagex_" + arg1 + "_preferences_wip.dat";
		} else {
			local26 = "jagex_" + arg1 + "_preferences.dat";
		}
		@Pc(88) String[] local88 = new String[] { "c:/rscache/", "/rscache/", aString269, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(90) int local90 = 0; local90 < local88.length; local90++) {
			@Pc(98) String local98 = local88[local90];
			if (local98.length() <= 0 || (new File(local98)).exists()) {
				try {
					return new Class228(new File(local98, local26), "rw", 10000L);
				} catch (@Pc(124) Exception local124) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!lh", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class226(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString272 = "1.1";
		aString268 = "Unknown";
		this.anInt6903 = arg1;
		this.aString267 = arg2;
		this.anApplet2 = arg0;
		try {
			aString268 = System.getProperty("java.vendor");
			aString272 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString265 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString265 = "Unknown";
		}
		aString266 = aString265.toLowerCase();
		try {
			aString271 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString271 = "";
		}
		try {
			aString270 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString270 = "";
		}
		try {
			aString269 = System.getProperty("user.home");
			if (aString269 != null) {
				aString269 = aString269 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (aString269 == null) {
			aString269 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(150) Exception local150) {
		}
		this.aClass228_3 = new Class228(method5741("random.dat", this.anInt6903, null), "rw", 25L);
		this.aClass228_2 = new Class228(this.method5751("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass228_1 = new Class228(this.method5751("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass228Array1 = new Class228[arg3];
		for (@Pc(191) int local191 = 0; local191 < arg3; local191++) {
			this.aClass228Array1[local191] = new Class228(this.method5751("main_file_cache.idx" + local191), "rw", 1048576L);
		}
		try {
			this.aClass223_1 = new Class223();
		} catch (@Pc(227) Throwable local227) {
		}
		try {
			this.aClass225_1 = new Class225();
		} catch (@Pc(234) Throwable local234) {
		}
		@Pc(237) ThreadGroup local237 = Thread.currentThread().getThreadGroup();
		for (@Pc(240) ThreadGroup local240 = local237.getParent(); local240 != null; local240 = local240.getParent()) {
			local237 = local240;
		}
		@Pc(252) Thread[] local252 = new Thread[1000];
		local237.enumerate(local252);
		for (@Pc(258) int local258 = 0; local258 < local252.length; local258++) {
			if (local252[local258] != null && local252[local258].getName().startsWith("AWT")) {
				local252[local258].setPriority(1);
			}
		}
		this.aBoolean598 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!lh", name = "a", descriptor = "(IIILjava/lang/Object;I)Lloader!dj;")
	private Class222 method5738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4) {
		@Pc(11) Class222 local11 = new Class222();
		local11.anInt6897 = arg1;
		local11.anInt6896 = arg4;
		local11.anInt6899 = arg2;
		local11.anObject10 = arg3;
		synchronized (this) {
			if (this.aClass222_3 == null) {
				this.aClass222_3 = this.aClass222_2 = local11;
			} else {
				this.aClass222_3.aClass222_1 = local11;
				this.aClass222_3 = local11;
			}
			this.notify();
			return local11;
		}
	}

	@OriginalMember(owner = "loader!lh", name = "a", descriptor = "(ZILjava/awt/Component;)Lloader!dj;")
	private Class222 method5739(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1) {
		return this.method5738(102, 15, 0, arg1, arg0 ? 1 : 0);
	}

	@OriginalMember(owner = "loader!lh", name = "a", descriptor = "(ILjava/lang/Class;)Lloader!dj;")
	private Class222 method5740(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) {
		if (arg0 <= 117) {
			aString265 = null;
		}
		return this.method5738(-120, 10, 0, arg1, 0);
	}

	@OriginalMember(owner = "loader!lh", name = "d", descriptor = "(I)Lloader!dj;")
	private Class222 method5742(@OriginalArg(0) int arg0) {
		if (arg0 >= -84) {
			this.method5764(null, null, 121);
		}
		return this.method5738(-128, 12, 0, null, 0);
	}

	@OriginalMember(owner = "loader!lh", name = "c", descriptor = "(I)Lloader!pl;")
	private Interface11 method5743(@OriginalArg(0) int arg0) {
		if (arg0 != 19) {
			aHashtable2 = null;
		}
		return this.anInterface11_1;
	}

	@OriginalMember(owner = "loader!lh", name = "a", descriptor = "(IIIII)Lloader!dj;")
	private Class222 method5744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != 1414295824) {
			this.aClass225_1 = null;
		}
		return this.method5738(83, 6, (arg3 << 16) + arg1, null, arg4 + (arg2 << 16));
	}

	@OriginalMember(owner = "loader!lh", name = "b", descriptor = "(BLjava/lang/String;)[B")
	private byte[] method5745(@OriginalArg(1) String arg0) {
		@Pc(15) Class222 local15 = this.method5757(arg0, 21, 0, 0, (byte) -124);
		return (byte[]) local15.anObject9;
	}

	@OriginalMember(owner = "loader!lh", name = "b", descriptor = "(ILjava/lang/Class;)Lloader!dj;")
	private Class222 method5746(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) {
		if (arg0 != 200) {
			this.method5764(null, null, 99);
		}
		return this.method5738(-128, 11, 0, arg1, 0);
	}

	@OriginalMember(owner = "loader!lh", name = "a", descriptor = "(IIILjava/awt/Component;)Lloader!dj;")
	private Class222 method5747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		@Pc(2) Point local2 = arg3.getLocationOnScreen();
		if (arg0 != 14736) {
			this.method5752(-104, -76);
		}
		return this.method5738(14, 14, local2.y + arg2, null, local2.x + arg1);
	}

	@OriginalMember(owner = "loader!lh", name = "a", descriptor = "(Ljava/net/URL;I)Lloader!dj;")
	private Class222 method5748(@OriginalArg(0) URL arg0, @OriginalArg(1) int arg1) {
		return arg1 == 26648 ? this.method5738(45, 4, 0, arg0, 0) : (Class222) null;
	}

	@OriginalMember(owner = "loader!lh", name = "a", descriptor = "(BLjava/awt/Frame;)Lloader!dj;")
	private Class222 method5749(@OriginalArg(1) Frame arg0) {
		return this.method5738(-124, 7, 0, arg0, 0);
	}

	@OriginalMember(owner = "loader!lh", name = "a", descriptor = "(Z)V")
	private void method5750(@OriginalArg(0) boolean arg0) {
		aLong260 = Class227.method5782() + 5000L;
		if (arg0) {
			aString268 = null;
		}
	}

	@OriginalMember(owner = "loader!lh", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/io/File;")
	public File method5751(@OriginalArg(0) String arg0) {
		return method5741(arg0, this.anInt6903, this.aString267);
	}

	@OriginalMember(owner = "loader!lh", name = "a", descriptor = "(II)Lloader!dj;")
	private Class222 method5752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != -34) {
			this.aClass228_3 = null;
		}
		return this.method5738(-101, 3, 0, null, arg0);
	}

	@OriginalMember(owner = "loader!lh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class222 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean598) {
						return;
					}
					if (this.aClass222_2 != null) {
						local16 = this.aClass222_2;
						this.aClass222_2 = this.aClass222_2.aClass222_1;
						if (this.aClass222_2 == null) {
							this.aClass222_3 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(34) InterruptedException local34) {
					}
				}
			}
			try {
				@Pc(46) int local46 = local16.anInt6897;
				if (local46 == 1) {
					if (aLong260 > Class227.method5782()) {
						throw new IOException();
					}
					local16.anObject9 = new Socket(InetAddress.getByName((String) local16.anObject10), local16.anInt6896);
				} else if (local46 == 2) {
					@Pc(82) Thread local82 = new Thread((Runnable) local16.anObject10);
					local82.setDaemon(true);
					local82.start();
					local82.setPriority(local16.anInt6896);
					local16.anObject9 = local82;
				} else if (local46 == 4) {
					if (Class227.method5782() < aLong260) {
						throw new IOException();
					}
					local16.anObject9 = new DataInputStream(((URL) local16.anObject10).openStream());
				} else {
					@Pc(130) Object[] local130;
					if (local46 == 8) {
						local130 = (Object[]) local16.anObject10;
						if (((Class) local130[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject9 = ((Class) local130[0]).getDeclaredMethod((String) local130[1], (Class[]) local130[2]);
					} else if (local46 == 9) {
						local130 = (Object[]) local16.anObject10;
						if (((Class) local130[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject9 = ((Class) local130[0]).getDeclaredField((String) local130[1]);
					} else if (local46 == 18) {
						@Pc(857) Clipboard local857 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.anObject9 = local857.getContents(null);
					} else if (local46 == 19) {
						@Pc(846) Transferable local846 = (Transferable) local16.anObject10;
						@Pc(849) Clipboard local849 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local849.setContents(local846, null);
					} else {
						@Pc(404) String local404;
						if (local46 == 3) {
							if (Class227.method5782() < aLong260) {
								throw new IOException();
							}
							local404 = (local16.anInt6896 >> 24 & 0xFF) + "." + (local16.anInt6896 >> 16 & 0xFF) + "." + (local16.anInt6896 >> 8 & 0xFF) + "." + (local16.anInt6896 & 0xFF);
							local16.anObject9 = InetAddress.getByName(local404).getHostName();
						} else if (local46 == 21) {
							if (aLong260 > Class227.method5782()) {
								throw new IOException();
							}
							local16.anObject9 = InetAddress.getByName((String) local16.anObject10).getAddress();
						} else if (local46 == 5) {
							local16.anObject9 = this.aClass223_1.method5730();
						} else if (local46 == 6) {
							@Pc(758) Frame local758 = new Frame("Jagex Full Screen");
							local16.anObject9 = local758;
							local758.setResizable(false);
							this.aClass223_1.method5728(local16.anInt6899 >> 16, local16.anInt6899 & 0xFFFF, local758, local16.anInt6896 >>> 16, local16.anInt6896 & 0xFFFF);
						} else if (local46 == 7) {
							this.aClass223_1.method5729();
						} else {
							@Pc(328) Method local328;
							@Pc(320) Class[] local320;
							@Pc(322) Runtime local322;
							if (local46 == 10) {
								local320 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local322 = Runtime.getRuntime();
								if (!aString266.startsWith("mac")) {
									local328 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local320);
									local328.setAccessible(true);
									local328.invoke(local322, local16.anObject10, "jawt");
									local328.setAccessible(false);
								}
								local328 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local320);
								local328.setAccessible(true);
								if (aString266.startsWith("linux") || aString266.startsWith("sunos")) {
									local328.invoke(local322, local16.anObject10, this.method5751("libjaggl_dri.so").toString());
									@Pc(705) Class local705 = ((Class) local16.anObject10).getClassLoader().loadClass("jaggl.X11.dri");
									local705.getMethod("bind").invoke(null);
									local328.invoke(local322, local16.anObject10, this.method5751("libjaggl.so").toString());
									local705.getMethod("close").invoke(null);
								} else if (aString266.startsWith("mac")) {
									local328.invoke(local322, local16.anObject10, this.method5751("libjaggl.jnilib").toString());
								} else if (aString266.startsWith("win")) {
									local328.invoke(local322, local16.anObject10, this.method5751("jaggl.dll").toString());
								} else {
									throw new Exception();
								}
								local328.setAccessible(false);
							} else {
								@Pc(420) int local420;
								if (local46 == 11) {
									@Pc(500) Field local500 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local500.setAccessible(true);
									@Pc(511) Vector local511 = (Vector) local500.get(((Class) local16.anObject10).getClassLoader());
									for (local420 = 0; local420 < local511.size(); local420++) {
										@Pc(521) Object local521 = local511.elementAt(local420);
										@Pc(528) Method local528 = local521.getClass().getDeclaredMethod("finalize");
										local528.setAccessible(true);
										local528.invoke(local521);
										local528.setAccessible(false);
										@Pc(545) Field local545 = local521.getClass().getDeclaredField("handle");
										local545.setAccessible(true);
										local545.set(local521, Integer.valueOf(0));
										local545.setAccessible(false);
									}
									local500.setAccessible(false);
								} else {
									@Pc(232) Class228 local232;
									if (local46 == 12) {
										local232 = method5766(this.anInt6903, this.aString267);
										local16.anObject9 = local232;
									} else if (local46 == 13) {
										local232 = method5761(this.aString267, this.anInt6903);
										local16.anObject9 = local232;
									} else if (local46 == 14) {
										@Pc(247) int local247 = local16.anInt6896;
										@Pc(250) int local250 = local16.anInt6899;
										this.aClass225_1.method5737(local250, local247);
									} else if (local46 == 15) {
										@Pc(473) boolean local473 = local16.anInt6896 != 0;
										@Pc(477) Component local477 = (Component) local16.anObject10;
										this.aClass225_1.method5735(local473, local477);
									} else if (local46 == 17) {
										local130 = (Object[]) local16.anObject10;
										this.aClass225_1.method5736((Point) local130[2], local16.anInt6896, (int[]) local130[1], (Component) local130[0], local16.anInt6899);
									} else if (local46 == 16) {
										try {
											if (!aString266.startsWith("win")) {
												throw new Exception();
											}
											local404 = (String) local16.anObject10;
											if (!local404.startsWith("http://") && !local404.startsWith("https://")) {
												throw new Exception();
											}
											@Pc(418) String local418 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
											for (local420 = 0; local404.length() > local420; local420++) {
												if (local418.indexOf(local404.charAt(local420)) == -1) {
													throw new Exception();
												}
											}
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local404 + "\"");
											local16.anObject9 = null;
										} catch (@Pc(461) Exception local461) {
											local16.anObject9 = local461;
										}
									} else if (local46 == 20) {
										try {
											local320 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
											local322 = Runtime.getRuntime();
											local328 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local320);
											local328.setAccessible(true);
											if (aString266.startsWith("win")) {
												if (aString271.startsWith("amd64") || aString271.startsWith("x86_64")) {
													local328.invoke(local322, local16.anObject10, this.method5751("jagmisc64.dll").toString());
												} else {
													local328.invoke(local322, local16.anObject10, this.method5751("jagmisc.dll").toString());
												}
											}
											local328.setAccessible(false);
										} catch (@Pc(388) Throwable local388) {
											local16.anObject9 = local388;
										}
									} else {
										throw new Exception("");
									}
								}
							}
						}
					}
				}
				local16.anInt6898 = 1;
			} catch (@Pc(895) ThreadDeath local895) {
				throw local895;
			} catch (@Pc(898) Throwable local898) {
				local16.anInt6898 = 2;
			}
			synchronized (local16) {
				local16.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!lh", name = "a", descriptor = "(IILjava/lang/String;)Lloader!dj;")
	private Class222 method5753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 != 0) {
			this.method5739(false, null);
		}
		return this.method5738(74, 1, 0, arg2, arg0);
	}

	@OriginalMember(owner = "loader!lh", name = "a", descriptor = "(B)V")
	private void method5754(@OriginalArg(0) byte arg0) {
		synchronized (this) {
			this.aBoolean598 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
			if (arg0 != 108) {
				this.aString267 = null;
			}
		} catch (@Pc(28) InterruptedException local28) {
		}
		if (this.aClass228_2 != null) {
			try {
				this.aClass228_2.method5786();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass228_1 != null) {
			try {
				this.aClass228_1.method5786();
			} catch (@Pc(48) IOException local48) {
			}
		}
		if (this.aClass228Array1 != null) {
			for (@Pc(54) int local54 = 0; local54 < this.aClass228Array1.length; local54++) {
				if (this.aClass228Array1[local54] != null) {
					try {
						this.aClass228Array1[local54].method5786();
					} catch (@Pc(77) IOException local77) {
					}
				}
			}
		}
		if (this.aClass228_3 != null) {
			try {
				this.aClass228_3.method5786();
			} catch (@Pc(90) IOException local90) {
			}
		}
	}

	@OriginalMember(owner = "loader!lh", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lloader!dj;")
	private Class222 method5755(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method5738(51, 2, 0, arg0, arg1);
	}

	@OriginalMember(owner = "loader!lh", name = "a", descriptor = "(Ljava/lang/Class;I)Lloader!dj;")
	private Class222 method5756(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 21) {
			this.anApplet2 = null;
		}
		return this.method5738(92, 20, 0, arg0, 0);
	}

	@OriginalMember(owner = "loader!lh", name = "a", descriptor = "(Ljava/lang/Object;IIIB)Lloader!dj;")
	private Class222 method5757(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		@Pc(3) Class222 local3 = new Class222();
		synchronized (local3) {
			local3.anInt6897 = arg1;
			local3.anInt6899 = arg2;
			if (arg4 >= -120) {
				return (Class222) null;
			}
			local3.anObject10 = arg0;
			local3.anInt6896 = arg3;
			synchronized (this) {
				if (this.aClass222_3 == null) {
					this.aClass222_3 = this.aClass222_2 = local3;
				} else {
					this.aClass222_3.aClass222_1 = local3;
					this.aClass222_3 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(62) InterruptedException local62) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!lh", name = "a", descriptor = "(BLjava/lang/String;)Lloader!dj;")
	private Class222 method5758(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		if (arg0 != -36) {
			aHashtable2 = null;
		}
		return this.method5738(-127, 16, 0, arg1, 0);
	}

	@OriginalMember(owner = "loader!lh", name = "a", descriptor = "(I)Lloader!dj;")
	private Class222 method5759(@OriginalArg(0) int arg0) {
		return arg0 == 12178 ? this.method5738(120, 13, 0, null, 0) : (Class222) null;
	}

	@OriginalMember(owner = "loader!lh", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lloader!dj;")
	private Class222 method5760(@OriginalArg(0) Transferable arg0, @OriginalArg(1) int arg1) {
		return arg1 > -112 ? (Class222) null : this.method5738(71, 19, 0, arg0, 0);
	}

	@OriginalMember(owner = "loader!lh", name = "a", descriptor = "(II[IILjava/awt/Component;Ljava/awt/Point;)Lloader!dj;")
	private Class222 method5762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Component arg4, @OriginalArg(5) Point arg5) {
		if (arg1 > -112) {
			this.method5746(-34, null);
		}
		return this.method5738(114, 17, arg0, new Object[] { arg4, arg2, arg5 }, arg3);
	}

	@OriginalMember(owner = "loader!lh", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;I)Lloader!dj;")
	private Class222 method5763(@OriginalArg(0) String arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) Class arg2, @OriginalArg(3) int arg3) {
		if (arg3 != 0) {
			this.method5743(-10);
		}
		return this.method5738(22, 8, 0, new Object[] { arg2, arg0, arg1 }, 0);
	}

	@OriginalMember(owner = "loader!lh", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lloader!dj;")
	private Class222 method5764(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg2 != -19372) {
			this.method5742(-7);
		}
		return this.method5738(-117, 9, 0, new Object[] { arg0, arg1 }, 0);
	}

	@OriginalMember(owner = "loader!lh", name = "a", descriptor = "(ZLjava/lang/String;)Lloader!dj;")
	private Class222 method5765(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (arg0) {
			this.aClass228_3 = null;
		}
		return this.method5738(51, 21, 0, arg1, 0);
	}

	@OriginalMember(owner = "loader!lh", name = "b", descriptor = "(Z)Z")
	private boolean method5767(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return true;
		} else {
			return this.aClass223_1 != null;
		}
	}

	@OriginalMember(owner = "loader!lh", name = "b", descriptor = "(I)Lloader!dj;")
	private Class222 method5768(@OriginalArg(0) int arg0) {
		return arg0 == 5 ? this.method5738(arg0 - 127, 5, 0, null, 0) : (Class222) null;
	}

	@OriginalMember(owner = "loader!lh", name = "b", descriptor = "(B)Lloader!dj;")
	private Class222 method5769() {
		return this.method5738(-127, 18, 0, null, 0);
	}
}
