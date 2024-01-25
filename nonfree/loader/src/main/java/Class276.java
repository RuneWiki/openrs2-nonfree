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

@OriginalClass("loader!fq")
public final class Class276 implements Runnable {

	@OriginalMember(owner = "loader!fq", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString83;

	@OriginalMember(owner = "loader!fq", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString84;

	@OriginalMember(owner = "loader!fq", name = "s", descriptor = "Ljava/lang/String;")
	private static String aString85;

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString86;

	@OriginalMember(owner = "loader!fq", name = "n", descriptor = "Ljava/lang/String;")
	private static String aString88;

	@OriginalMember(owner = "loader!fq", name = "p", descriptor = "Ljava/lang/String;")
	private static String aString89;

	@OriginalMember(owner = "loader!fq", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString90;

	@OriginalMember(owner = "loader!fq", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!fq", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!fq", name = "t", descriptor = "I")
	private static final int anInt7554 = 1;

	@OriginalMember(owner = "loader!fq", name = "v", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable4 = new Hashtable(16);

	@OriginalMember(owner = "loader!fq", name = "x", descriptor = "J")
	private static volatile long aLong233 = 0L;

	@OriginalMember(owner = "loader!fq", name = "k", descriptor = "Lloader!ee;")
	private Interface14 anInterface14_1;

	@OriginalMember(owner = "loader!fq", name = "f", descriptor = "Lloader!hh;")
	private Class279 aClass279_2 = null;

	@OriginalMember(owner = "loader!fq", name = "e", descriptor = "Lloader!hh;")
	private Class279 aClass279_3 = null;

	@OriginalMember(owner = "loader!fq", name = "b", descriptor = "Lloader!hh;")
	private Class279 aClass279_1 = null;

	@OriginalMember(owner = "loader!fq", name = "c", descriptor = "Lloader!tc;")
	private Class280 aClass280_1 = null;

	@OriginalMember(owner = "loader!fq", name = "l", descriptor = "Z")
	private boolean aBoolean822 = false;

	@OriginalMember(owner = "loader!fq", name = "i", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!fq", name = "z", descriptor = "Lloader!tc;")
	private Class280 aClass280_2 = null;

	@OriginalMember(owner = "loader!fq", name = "h", descriptor = "I")
	private final int anInt7555;

	@OriginalMember(owner = "loader!fq", name = "o", descriptor = "Ljava/lang/String;")
	private String aString87;

	@OriginalMember(owner = "loader!fq", name = "g", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!fq", name = "d", descriptor = "[Lloader!hh;")
	private final Class279[] aClass279Array1;

	@OriginalMember(owner = "loader!fq", name = "u", descriptor = "Lloader!g;")
	private Class277 aClass277_1;

	@OriginalMember(owner = "loader!fq", name = "A", descriptor = "Lloader!a;")
	private Class273 aClass273_1;

	@OriginalMember(owner = "loader!fq", name = "m", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;I)Ljava/io/File;")
	private static File method5997(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(4) File local4 = (File) aHashtable4.get(arg1);
		if (local4 != null) {
			return local4;
		}
		@Pc(56) String[] local56 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString86, "/tmp/", "" };
		@Pc(81) String[] local81 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(83) int local83 = 0; local83 < 2; local83++) {
			for (@Pc(88) int local88 = 0; local88 < local81.length; local88++) {
				for (@Pc(94) int local94 = 0; local94 < local56.length; local94++) {
					@Pc(128) String local128 = local56[local94] + local81[local88] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(130) RandomAccessFile local130 = null;
					try {
						@Pc(135) File local135 = new File(local128);
						if (local83 != 0 || local135.exists()) {
							@Pc(149) String local149 = local56[local94];
							if (local83 != 1 || local149.length() <= 0 || (new File(local149)).exists()) {
								(new File(local56[local94] + local81[local88])).mkdir();
								if (arg0 != null) {
									(new File(local56[local94] + local81[local88] + "/" + arg0)).mkdir();
								}
								local130 = new RandomAccessFile(local135, "rw");
								@Pc(214) int local214 = local130.read();
								local130.seek(0L);
								local130.write(local214);
								local130.seek(0L);
								local130.close();
								aHashtable4.put(arg1, local135);
								return local135;
							}
						}
					} catch (@Pc(233) Exception local233) {
						try {
							if (local130 != null) {
								local130.close();
							}
						} catch (@Pc(242) Exception local242) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Lloader!hh;")
	private static Class279 method6004(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(17) String local17;
		if (arg1 == 33) {
			local17 = "jagex_" + arg2 + "_preferences" + arg0 + "_rc.dat";
		} else if (arg1 == 34) {
			local17 = "jagex_" + arg2 + "_preferences" + arg0 + "_wip.dat";
		} else {
			local17 = "jagex_" + arg2 + "_preferences" + arg0 + ".dat";
		}
		@Pc(97) String[] local97 = new String[] { "c:/rscache/", "/rscache/", aString86, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(99) int local99 = 0; local99 < local97.length; local99++) {
			@Pc(111) String local111 = local97[local99];
			if (local111.length() <= 0 || (new File(local111)).exists()) {
				try {
					return new Class279(new File(local111, local17), "rw", 10000L);
				} catch (@Pc(137) Exception local137) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!fq", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class276(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString84 = "Unknown";
		aString83 = "1.1";
		this.anInt7555 = arg1;
		this.aString87 = arg2;
		this.anApplet2 = arg0;
		try {
			aString84 = System.getProperty("java.vendor");
			aString83 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString90 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString90 = "Unknown";
		}
		aString88 = aString90.toLowerCase();
		try {
			aString85 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString85 = "";
		}
		try {
			aString89 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString89 = "";
		}
		try {
			aString86 = System.getProperty("user.home");
			if (aString86 != null) {
				aString86 = aString86 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (aString86 == null) {
			aString86 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(96) Throwable local96) {
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
		} catch (@Pc(151) Exception local151) {
		}
		this.aClass279_1 = new Class279(method5997(null, "random.dat", this.anInt7555), "rw", 25L);
		this.aClass279_2 = new Class279(this.method5994("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass279_3 = new Class279(this.method5994("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass279Array1 = new Class279[arg3];
		for (@Pc(192) int local192 = 0; local192 < arg3; local192++) {
			this.aClass279Array1[local192] = new Class279(this.method5994("main_file_cache.idx" + local192), "rw", 1048576L);
		}
		try {
			this.aClass277_1 = new Class277();
		} catch (@Pc(228) Throwable local228) {
		}
		try {
			this.aClass273_1 = new Class273();
		} catch (@Pc(235) Throwable local235) {
		}
		@Pc(238) ThreadGroup local238 = Thread.currentThread().getThreadGroup();
		for (@Pc(241) ThreadGroup local241 = local238.getParent(); local241 != null; local241 = local241.getParent()) {
			local238 = local241;
		}
		@Pc(253) Thread[] local253 = new Thread[1000];
		local238.enumerate(local253);
		for (@Pc(259) int local259 = 0; local259 < local253.length; local259++) {
			if (local253[local259] != null && local253[local259].getName().startsWith("AWT")) {
				local253[local259].setPriority(1);
			}
		}
		this.aBoolean822 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(Ljava/lang/String;B)Lloader!tc;")
	private Class280 method5989(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != 58) {
			this.method5991(false, -50);
		}
		return this.method6016(0, 21, -120, 0, arg0);
	}

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(ILjava/lang/String;I)Lloader!tc;")
	private Class280 method5990(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		return arg2 == -12048 ? this.method6016(0, 1, arg2 ^ 0x2F7F, arg0, arg1) : (Class280) null;
	}

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(ZI)Lloader!tc;")
	private Class280 method5991(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		return arg0 ? this.method6016(0, 3, -128, arg1, null) : (Class280) null;
	}

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(IIIII)Lloader!tc;")
	private Class280 method5992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method6016((arg0 << 16) + arg3, 6, 114, (arg2 << 16) + arg1, null);
	}

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(IIILjava/awt/Component;)Lloader!tc;")
	private Class280 method5993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		if (arg0 != 1339) {
			this.aClass277_1 = null;
		}
		@Pc(9) Point local9 = arg3.getLocationOnScreen();
		return this.method6016(local9.y + arg1, 14, -45, local9.x + arg2, null);
	}

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public File method5994(@OriginalArg(1) String arg0) {
		return method5997(this.aString87, arg0, this.anInt7555);
	}

	@OriginalMember(owner = "loader!fq", name = "b", descriptor = "(Ljava/lang/Class;I)V")
	private void method5995(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		if (arg1 != -5) {
			return;
		}
		@Pc(18) Runtime local18 = Runtime.getRuntime();
		@Pc(29) Method local29 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(40) Method local40;
		if (!aString88.startsWith("mac")) {
			local40 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local29.invoke(local40, Boolean.TRUE);
			local40.invoke(local18, arg0, "jawt");
			local29.invoke(local40, Boolean.FALSE);
		}
		local40 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local29.invoke(local40, Boolean.TRUE);
		if (!aString88.startsWith("win")) {
			throw new Exception();
		}
		local40.invoke(local18, arg0, this.method5994("sw3d.dll").toString());
		local29.invoke(local40, Boolean.FALSE);
	}

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(Ljava/lang/Class;I)Lloader!tc;")
	private Class280 method5996(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		return arg1 == 17761 ? this.method6016(0, 20, arg1 - 17833, 0, arg0) : (Class280) null;
	}

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lloader!tc;")
	private Class280 method5998(@OriginalArg(0) Transferable arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 19) {
			aString85 = null;
		}
		return this.method6016(0, 19, 94, 0, arg0);
	}

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(B)Lloader!tc;")
	private Class280 method5999(@OriginalArg(0) byte arg0) {
		if (arg0 < 2) {
			this.method6002((byte) 32);
		}
		return this.method6016(0, 18, 125, 0, null);
	}

	@OriginalMember(owner = "loader!fq", name = "b", descriptor = "(Ljava/lang/String;B)[B")
	private byte[] method6000(@OriginalArg(0) String arg0) {
		@Pc(15) Class280 local15 = this.method6017(0, 21, -31017, 0, arg0);
		return (byte[]) local15.anObject11;
	}

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(BLjava/lang/String;)Lloader!tc;")
	private Class280 method6001(@OriginalArg(1) String arg0) {
		return this.method6016(0, 16, 108, 0, arg0);
	}

	@OriginalMember(owner = "loader!fq", name = "b", descriptor = "(B)V")
	private void method6002(@OriginalArg(0) byte arg0) {
		if (arg0 != -27) {
			this.method6000(null);
		}
		aLong233 = Class274.method5973() + 5000L;
	}

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(BLjava/lang/Class;)Lloader!tc;")
	private Class280 method6003(@OriginalArg(0) byte arg0, @OriginalArg(1) Class arg1) {
		return arg0 == -109 ? this.method6016(0, 11, 101, 0, arg1) : (Class280) null;
	}

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(Z)Z")
	private boolean method6005(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method6014(-43);
		}
		return this.aClass277_1 != null;
	}

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lloader!tc;")
	private Class280 method6006(@OriginalArg(0) Class arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) String arg2) {
		if (arg1 != -126) {
			method6004(null, -104, null);
		}
		return this.method6016(0, 9, -117, 0, new Object[] { arg0, arg2 });
	}

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(ZLjava/awt/Component;Z)Lloader!tc;")
	private Class280 method6007(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) {
		return arg0 ? this.method6016(0, 15, -98, arg2 ? 1 : 0, arg1) : (Class280) null;
	}

	@OriginalMember(owner = "loader!fq", name = "b", descriptor = "(I)Lloader!tc;")
	private Class280 method6008(@OriginalArg(0) int arg0) {
		return arg0 >= -87 ? (Class280) null : this.method6016(0, 5, -78, 0, null);
	}

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(Ljava/lang/String;ZZ)Lloader!tc;")
	private Class280 method6009(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg2) {
			return arg1 ? this.method6016(0, 12, -56, 0, arg0) : this.method6016(0, 13, -95, 0, arg0);
		} else {
			return (Class280) null;
		}
	}

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(Ljava/awt/Point;[IILjava/awt/Component;II)Lloader!tc;")
	private Class280 method6010(@OriginalArg(0) Point arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg5 != -3790) {
			aString90 = null;
		}
		return this.method6016(arg2, 17, arg5 ^ 0xEB6, arg4, new Object[] { arg3, arg1, arg0 });
	}

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(Ljava/awt/Frame;I)Lloader!tc;")
	private Class280 method6011(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 7) {
			this.anApplet2 = null;
		}
		return this.method6016(0, 7, arg1 ^ 0x4D, 0, arg0);
	}

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(ILjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lloader!tc;")
	private Class280 method6012(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class[] arg2, @OriginalArg(3) Class arg3) {
		if (arg0 != 21) {
			this.aString87 = null;
		}
		return this.method6016(0, 8, -104, 0, new Object[] { arg3, arg1, arg2 });
	}

	@OriginalMember(owner = "loader!fq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class280 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean822) {
						return;
					}
					if (this.aClass280_2 != null) {
						local16 = this.aClass280_2;
						this.aClass280_2 = this.aClass280_2.aClass280_3;
						if (this.aClass280_2 == null) {
							this.aClass280_1 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
				}
			}
			try {
				@Pc(45) int local45 = local16.anInt7562;
				if (local45 == 1) {
					if (Class274.method5973() < aLong233) {
						throw new IOException();
					}
					local16.anObject11 = new Socket(InetAddress.getByName((String) local16.anObject12), local16.anInt7560);
				} else if (local45 == 2) {
					@Pc(58) Thread local58 = new Thread((Runnable) local16.anObject12);
					local58.setDaemon(true);
					local58.start();
					local58.setPriority(local16.anInt7560);
					local16.anObject11 = local58;
				} else if (local45 == 4) {
					if (aLong233 > Class274.method5973()) {
						throw new IOException();
					}
					local16.anObject11 = new DataInputStream(((URL) local16.anObject12).openStream());
				} else {
					@Pc(87) Object[] local87;
					if (local45 == 8) {
						local87 = (Object[]) local16.anObject12;
						if (((Class) local87[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject11 = ((Class) local87[0]).getDeclaredMethod((String) local87[1], (Class[]) local87[2]);
					} else if (local45 == 9) {
						local87 = (Object[]) local16.anObject12;
						if (((Class) local87[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject11 = ((Class) local87[0]).getDeclaredField((String) local87[1]);
					} else if (local45 == 18) {
						@Pc(617) Clipboard local617 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.anObject11 = local617.getContents(null);
					} else if (local45 == 19) {
						@Pc(606) Transferable local606 = (Transferable) local16.anObject12;
						@Pc(609) Clipboard local609 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local609.setContents(local606, null);
					} else {
						@Pc(249) String local249;
						if (local45 == 3) {
							if (Class274.method5973() < aLong233) {
								throw new IOException();
							}
							local249 = (local16.anInt7560 >> 24 & 0xFF) + "." + (local16.anInt7560 >> 16 & 0xFF) + "." + (local16.anInt7560 >> 8 & 0xFF) + "." + (local16.anInt7560 & 0xFF);
							local16.anObject11 = InetAddress.getByName(local249).getHostName();
						} else if (local45 == 21) {
							if (Class274.method5973() < aLong233) {
								throw new IOException();
							}
							local16.anObject11 = InetAddress.getByName((String) local16.anObject12).getAddress();
						} else if (local45 == 5) {
							local16.anObject11 = this.aClass277_1.method6019();
						} else if (local45 == 6) {
							@Pc(145) Frame local145 = new Frame("Jagex Full Screen");
							local16.anObject11 = local145;
							local145.setResizable(false);
							this.aClass277_1.method6021(local145, local16.anInt7560 >>> 16, local16.anInt7560 & 0xFFFF, local16.anInt7563 >> 16, local16.anInt7563 & 0xFFFF);
						} else if (local45 == 7) {
							this.aClass277_1.method6020();
						} else {
							@Pc(266) int local266;
							if (local45 == 11) {
								@Pc(467) Field local467 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local467.setAccessible(true);
								@Pc(478) Vector local478 = (Vector) local467.get(((Class) local16.anObject12).getClassLoader());
								for (local266 = 0; local478.size() > local266; local266++) {
									@Pc(488) Object local488 = local478.elementAt(local266);
									@Pc(495) Method local495 = local488.getClass().getDeclaredMethod("finalize");
									local495.setAccessible(true);
									local495.invoke(local488);
									local495.setAccessible(false);
									@Pc(512) Field local512 = local488.getClass().getDeclaredField("handle");
									local512.setAccessible(true);
									local512.set(local488, Integer.valueOf(0));
									local512.setAccessible(false);
								}
								local467.setAccessible(false);
							} else {
								@Pc(201) Class279 local201;
								if (local45 == 12) {
									local201 = method6004((String) local16.anObject12, this.anInt7555, this.aString87);
									local16.anObject11 = local201;
								} else if (local45 == 13) {
									local201 = method6004((String) local16.anObject12, this.anInt7555, "");
									local16.anObject11 = local201;
								} else if (local45 == 14) {
									@Pc(452) int local452 = local16.anInt7560;
									@Pc(455) int local455 = local16.anInt7563;
									this.aClass273_1.method5970(local455, local452);
								} else if (local45 == 15) {
									@Pc(438) boolean local438 = local16.anInt7560 != 0;
									@Pc(442) Component local442 = (Component) local16.anObject12;
									this.aClass273_1.method5969(local438, local442);
								} else if (local45 == 17) {
									local87 = (Object[]) local16.anObject12;
									this.aClass273_1.method5971(local16.anInt7560, (Component) local87[0], (Point) local87[2], (int[]) local87[1], local16.anInt7563);
								} else if (local45 == 16) {
									try {
										if (!aString88.startsWith("win")) {
											throw new Exception();
										}
										local249 = (String) local16.anObject12;
										if (!local249.startsWith("http://") && !local249.startsWith("https://")) {
											throw new Exception();
										}
										@Pc(264) String local264 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
										for (local266 = 0; local266 < local249.length(); local266++) {
											if (local264.indexOf(local249.charAt(local266)) == -1) {
												throw new Exception();
											}
										}
										Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local249 + "\"");
										local16.anObject11 = null;
									} catch (@Pc(301) Exception local301) {
										local16.anObject11 = local301;
										throw local301;
									}
								} else if (local45 == 20) {
									try {
										@Pc(329) Class[] local329 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
										@Pc(331) Runtime local331 = Runtime.getRuntime();
										@Pc(337) Method local337 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local329);
										local337.setAccessible(true);
										if (aString88.startsWith("win")) {
											if (aString85.startsWith("amd64") || aString85.startsWith("x86_64")) {
												local337.invoke(local331, local16.anObject12, this.method5994("jagmisc64.dll").toString());
											} else {
												local337.invoke(local331, local16.anObject12, this.method5994("jagmisc.dll").toString());
											}
										}
										local337.setAccessible(false);
									} catch (@Pc(397) Throwable local397) {
										local16.anObject11 = local397;
									}
								} else {
									throw new Exception("");
								}
							}
						}
					}
				}
				local16.anInt7561 = 1;
			} catch (@Pc(700) ThreadDeath local700) {
				throw local700;
			} catch (@Pc(703) Throwable local703) {
				local16.anInt7561 = 2;
			}
			synchronized (local16) {
				local16.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(ILjava/net/URL;)Lloader!tc;")
	private Class280 method6013(@OriginalArg(0) int arg0, @OriginalArg(1) URL arg1) {
		if (arg0 >= -127) {
			this.method6016(7, 6, 103, 38, null);
		}
		return this.method6016(0, 4, -57, 0, arg1);
	}

	@OriginalMember(owner = "loader!fq", name = "c", descriptor = "(I)Lloader!ee;")
	private Interface14 method6014(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? this.anInterface14_1 : (Interface14) null;
	}

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(I)V")
	private void method6015(@OriginalArg(0) int arg0) {
		synchronized (this) {
			this.aBoolean822 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
			if (arg0 != 0) {
				aString88 = null;
			}
		} catch (@Pc(26) InterruptedException local26) {
		}
		if (this.aClass279_2 != null) {
			try {
				this.aClass279_2.method6025(-29827);
			} catch (@Pc(36) IOException local36) {
			}
		}
		if (this.aClass279_3 != null) {
			try {
				this.aClass279_3.method6025(arg0 ^ 0xFFFF8B7D);
			} catch (@Pc(47) IOException local47) {
			}
		}
		if (this.aClass279Array1 != null) {
			for (@Pc(54) int local54 = 0; local54 < this.aClass279Array1.length; local54++) {
				if (this.aClass279Array1[local54] != null) {
					try {
						this.aClass279Array1[local54].method6025(-29827);
					} catch (@Pc(73) IOException local73) {
					}
				}
			}
		}
		if (this.aClass279_1 != null) {
			try {
				this.aClass279_1.method6025(-29827);
			} catch (@Pc(84) IOException local84) {
			}
		}
	}

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(IIIILjava/lang/Object;)Lloader!tc;")
	private Class280 method6016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4) {
		@Pc(3) Class280 local3 = new Class280();
		local3.anInt7563 = arg0;
		local3.anInt7562 = arg1;
		local3.anObject12 = arg4;
		local3.anInt7560 = arg3;
		synchronized (this) {
			if (this.aClass280_1 == null) {
				this.aClass280_1 = this.aClass280_2 = local3;
			} else {
				this.aClass280_1.aClass280_3 = local3;
				this.aClass280_1 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!fq", name = "b", descriptor = "(IIIILjava/lang/Object;)Lloader!tc;")
	private Class280 method6017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4) {
		@Pc(3) Class280 local3 = new Class280();
		synchronized (local3) {
			local3.anInt7563 = arg0;
			local3.anInt7562 = arg1;
			local3.anInt7560 = arg3;
			local3.anObject12 = arg4;
			if (arg2 != -31017) {
				return (Class280) null;
			}
			synchronized (this) {
				if (this.aClass280_1 == null) {
					this.aClass280_1 = this.aClass280_2 = local3;
				} else {
					this.aClass280_1.aClass280_3 = local3;
					this.aClass280_1 = local3;
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

	@OriginalMember(owner = "loader!fq", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Lloader!tc;")
	private Class280 method6018(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (arg2 > -105) {
			aString83 = null;
		}
		return this.method6016(0, 2, 127, arg1, arg0);
	}
}
