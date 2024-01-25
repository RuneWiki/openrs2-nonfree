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

@OriginalClass("loader!dq")
public final class Class255 implements Runnable {

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString67;

	@OriginalMember(owner = "loader!dq", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString68;

	@OriginalMember(owner = "loader!dq", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString69;

	@OriginalMember(owner = "loader!dq", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString70;

	@OriginalMember(owner = "loader!dq", name = "m", descriptor = "Ljava/lang/String;")
	private static String aString71;

	@OriginalMember(owner = "loader!dq", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString73;

	@OriginalMember(owner = "loader!dq", name = "l", descriptor = "Ljava/lang/String;")
	private static String aString74;

	@OriginalMember(owner = "loader!dq", name = "s", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!dq", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!dq", name = "d", descriptor = "I")
	private static final int anInt6759 = 1;

	@OriginalMember(owner = "loader!dq", name = "h", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable1 = new Hashtable(16);

	@OriginalMember(owner = "loader!dq", name = "t", descriptor = "J")
	private static volatile long aLong212 = 0L;

	@OriginalMember(owner = "loader!dq", name = "k", descriptor = "Lloader!rj;")
	private Interface13 anInterface13_1;

	@OriginalMember(owner = "loader!dq", name = "p", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!dq", name = "w", descriptor = "Z")
	private boolean aBoolean498 = false;

	@OriginalMember(owner = "loader!dq", name = "r", descriptor = "Lloader!sb;")
	private Class259 aClass259_2 = null;

	@OriginalMember(owner = "loader!dq", name = "g", descriptor = "Lloader!sb;")
	private Class259 aClass259_1 = null;

	@OriginalMember(owner = "loader!dq", name = "e", descriptor = "Lloader!a;")
	private Class252 aClass252_2 = null;

	@OriginalMember(owner = "loader!dq", name = "x", descriptor = "Lloader!a;")
	private Class252 aClass252_3 = null;

	@OriginalMember(owner = "loader!dq", name = "i", descriptor = "Lloader!sb;")
	private Class259 aClass259_3 = null;

	@OriginalMember(owner = "loader!dq", name = "z", descriptor = "Ljava/lang/String;")
	private final String aString72;

	@OriginalMember(owner = "loader!dq", name = "f", descriptor = "I")
	private int anInt6758;

	@OriginalMember(owner = "loader!dq", name = "u", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!dq", name = "n", descriptor = "[Lloader!sb;")
	private Class259[] aClass259Array1;

	@OriginalMember(owner = "loader!dq", name = "y", descriptor = "Lloader!i;")
	private Class258 aClass258_1;

	@OriginalMember(owner = "loader!dq", name = "A", descriptor = "Lloader!e;")
	private Class256 aClass256_1;

	@OriginalMember(owner = "loader!dq", name = "q", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(ILjava/lang/String;Z)Lloader!sb;")
	private static Class259 method5776(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(18) String local18;
		if (arg0 == 33) {
			local18 = "jagex_" + arg1 + "_preferences_rc.dat";
		} else if (arg0 == 34) {
			local18 = "jagex_" + arg1 + "_preferences_wip.dat";
		} else {
			local18 = "jagex_" + arg1 + "_preferences.dat";
		}
		@Pc(77) String[] local77 = new String[] { "c:/rscache/", "/rscache/", aString67, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(85) int local85 = 0; local85 < local77.length; local85++) {
			@Pc(97) String local97 = local77[local85];
			if (local97.length() <= 0 || (new File(local97)).exists()) {
				try {
					return new Class259(new File(local97, local18), "rw", 10000L);
				} catch (@Pc(120) Exception local120) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(ILjava/lang/String;I)Lloader!sb;")
	private static Class259 method5777(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(19) String local19;
		if (arg0 == 33) {
			local19 = "jagex_" + arg1 + "_preferences2_rc.dat";
		} else if (arg0 == 34) {
			local19 = "jagex_" + arg1 + "_preferences2_wip.dat";
		} else {
			local19 = "jagex_" + arg1 + "_preferences2.dat";
		}
		@Pc(83) String[] local83 = new String[] { "c:/rscache/", "/rscache/", aString67, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(85) int local85 = 0; local85 < local83.length; local85++) {
			@Pc(97) String local97 = local83[local85];
			if (local97.length() <= 0 || (new File(local97)).exists()) {
				try {
					return new Class259(new File(local97, local19), "rw", 10000L);
				} catch (@Pc(123) Exception local123) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	private static File method5786(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable1.get(arg2);
		if (local4 != null) {
			return local4;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString67, "/tmp/", "" };
		@Pc(68) String[] local68 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(76) int local76 = 0; local76 < 2; local76++) {
			for (@Pc(81) int local81 = 0; local81 < local68.length; local81++) {
				for (@Pc(87) int local87 = 0; local87 < local43.length; local87++) {
					@Pc(125) String local125 = local43[local87] + local68[local81] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(127) RandomAccessFile local127 = null;
					try {
						@Pc(132) File local132 = new File(local125);
						if (local76 != 0 || local132.exists()) {
							@Pc(145) String local145 = local43[local87];
							if (local76 != 1 || local145.length() <= 0 || (new File(local145)).exists()) {
								(new File(local43[local87] + local68[local81])).mkdir();
								if (arg1 != null) {
									(new File(local43[local87] + local68[local81] + "/" + arg1)).mkdir();
								}
								local127 = new RandomAccessFile(local132, "rw");
								@Pc(210) int local210 = local127.read();
								local127.seek(0L);
								local127.write(local210);
								local127.seek(0L);
								local127.close();
								aHashtable1.put(arg2, local132);
								return local132;
							}
						}
					} catch (@Pc(229) Exception local229) {
						try {
							if (local127 != null) {
								local127.close();
							}
						} catch (@Pc(239) Exception local239) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!dq", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class255(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString73 = "Unknown";
		this.aString72 = arg2;
		aString70 = "1.1";
		this.anInt6758 = arg1;
		this.anApplet2 = arg0;
		try {
			aString73 = System.getProperty("java.vendor");
			aString70 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString68 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString68 = "Unknown";
		}
		aString71 = aString68.toLowerCase();
		try {
			aString74 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString74 = "";
		}
		try {
			aString69 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString69 = "";
		}
		try {
			aString67 = System.getProperty("user.home");
			if (aString67 != null) {
				aString67 = aString67 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString67 == null) {
			aString67 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(97) Throwable local97) {
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
		this.aClass259_3 = new Class259(method5786(this.anInt6758, null, "random.dat"), "rw", 25L);
		this.aClass259_1 = new Class259(this.method5791("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass259_2 = new Class259(this.method5791("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass259Array1 = new Class259[arg3];
		for (@Pc(193) int local193 = 0; local193 < arg3; local193++) {
			this.aClass259Array1[local193] = new Class259(this.method5791("main_file_cache.idx" + local193), "rw", 1048576L);
		}
		try {
			this.aClass258_1 = new Class258();
		} catch (@Pc(229) Throwable local229) {
		}
		try {
			this.aClass256_1 = new Class256();
		} catch (@Pc(236) Throwable local236) {
		}
		@Pc(239) ThreadGroup local239 = Thread.currentThread().getThreadGroup();
		for (@Pc(242) ThreadGroup local242 = local239.getParent(); local242 != null; local242 = local242.getParent()) {
			local239 = local242;
		}
		@Pc(253) Thread[] local253 = new Thread[1000];
		local239.enumerate(local253);
		for (@Pc(259) int local259 = 0; local259 < local253.length; local259++) {
			if (local253[local259] != null && local253[local259].getName().startsWith("AWT")) {
				local253[local259].setPriority(1);
			}
		}
		this.aBoolean498 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lloader!a;")
	private Class252 method5766(@OriginalArg(0) Runnable arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		return arg1 == 76 ? this.method5780(0, arg0, arg1 ^ 0x42, arg2, 2) : (Class252) null;
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(BLjava/lang/String;I)Lloader!a;")
	private Class252 method5767(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg0 < 6) {
			this.method5795(null, -2);
		}
		return this.method5780(0, arg1, 14, arg2, 1);
	}

	@OriginalMember(owner = "loader!dq", name = "b", descriptor = "(I)V")
	private void method5768(@OriginalArg(0) int arg0) {
		if (arg0 == -26348) {
			aLong212 = Class254.method5765() + 5000L;
		}
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(II)Lloader!a;")
	private Class252 method5769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != 9434) {
			this.method5766(null, (byte) 88, -111);
		}
		return this.method5780(0, null, 14, arg1, 3);
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(Ljava/awt/Component;BII)Lloader!a;")
	private Class252 method5770(@OriginalArg(0) Component arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Point local2 = arg0.getLocationOnScreen();
		if (arg1 != -21) {
			this.run();
		}
		return this.method5780(arg2 + local2.y, null, 14, arg3 + local2.x, 14);
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(Z)Z")
	private boolean method5771(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method5784(null, -97);
		}
		return this.aClass258_1 != null;
	}

	@OriginalMember(owner = "loader!dq", name = "b", descriptor = "(B)Lloader!rj;")
	private Interface13 method5772(@OriginalArg(0) byte arg0) {
		if (arg0 != 27) {
			this.anInt6758 = 18;
		}
		return this.anInterface13_1;
	}

	@OriginalMember(owner = "loader!dq", name = "b", descriptor = "(Z)Lloader!a;")
	private Class252 method5773(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method5797(-105, true, -44, -35, -66);
		}
		return this.method5780(0, null, 14, 0, 13);
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;Z)Lloader!a;")
	private Class252 method5774(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) boolean arg2) {
		if (arg2) {
			this.anInterface13_1 = null;
		}
		return this.method5780(0, new Object[] { arg1, arg0 }, 14, 0, 9);
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(B)V")
	private void method5775(@OriginalArg(0) byte arg0) {
		synchronized (this) {
			this.aBoolean498 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass259_1 != null) {
			try {
				this.aClass259_1.method5828();
			} catch (@Pc(32) IOException local32) {
			}
		}
		if (this.aClass259_2 != null) {
			try {
				this.aClass259_2.method5828();
			} catch (@Pc(43) IOException local43) {
			}
		}
		if (arg0 != -107) {
			return;
		}
		if (this.aClass259Array1 != null) {
			for (@Pc(54) int local54 = 0; local54 < this.aClass259Array1.length; local54++) {
				if (this.aClass259Array1[local54] != null) {
					try {
						this.aClass259Array1[local54].method5828();
					} catch (@Pc(77) IOException local77) {
					}
				}
			}
		}
		if (this.aClass259_3 != null) {
			try {
				this.aClass259_3.method5828();
			} catch (@Pc(89) IOException local89) {
			}
		}
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(IILjava/awt/Component;I[ILjava/awt/Point;)Lloader!a;")
	private Class252 method5778(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Point arg4) {
		return this.method5780(arg0, new Object[] { arg1, arg3, arg4 }, 14, arg2, 17);
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(Ljava/awt/Frame;I)Lloader!a;")
	private Class252 method5779(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1) {
		if (arg1 != -1614) {
			this.anEventQueue2 = null;
		}
		return this.method5780(0, arg0, 14, 0, 7);
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(ILjava/lang/Object;III)Lloader!a;")
	private Class252 method5780(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 != 14) {
			this.method5788(null, -97);
		}
		@Pc(12) Class252 local12 = new Class252();
		local12.anInt6757 = arg3;
		local12.anObject9 = arg1;
		local12.anInt6754 = arg4;
		local12.anInt6756 = arg0;
		synchronized (this) {
			if (this.aClass252_2 == null) {
				this.aClass252_2 = this.aClass252_3 = local12;
			} else {
				this.aClass252_2.aClass252_1 = local12;
				this.aClass252_2 = local12;
			}
			this.notify();
			return local12;
		}
	}

	@OriginalMember(owner = "loader!dq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class252 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean498) {
						return;
					}
					if (this.aClass252_3 != null) {
						local15 = this.aClass252_3;
						this.aClass252_3 = this.aClass252_3.aClass252_1;
						if (this.aClass252_3 == null) {
							this.aClass252_2 = null;
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
				@Pc(45) int local45 = local15.anInt6754;
				if (local45 == 1) {
					if (aLong212 > Class254.method5765()) {
						throw new IOException();
					}
					local15.anObject8 = new Socket(InetAddress.getByName((String) local15.anObject9), local15.anInt6757);
				} else if (local45 == 2) {
					@Pc(893) Thread local893 = new Thread((Runnable) local15.anObject9);
					local893.setDaemon(true);
					local893.start();
					local893.setPriority(local15.anInt6757);
					local15.anObject8 = local893;
				} else if (local45 == 4) {
					if (Class254.method5765() < aLong212) {
						throw new IOException();
					}
					local15.anObject8 = new DataInputStream(((URL) local15.anObject9).openStream());
				} else {
					@Pc(115) Object[] local115;
					if (local45 == 8) {
						local115 = (Object[]) local15.anObject9;
						if (((Class) local115[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject8 = ((Class) local115[0]).getDeclaredMethod((String) local115[1], (Class[]) local115[2]);
					} else if (local45 == 9) {
						local115 = (Object[]) local15.anObject9;
						if (((Class) local115[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject8 = ((Class) local115[0]).getDeclaredField((String) local115[1]);
					} else if (local45 == 18) {
						@Pc(852) Clipboard local852 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject8 = local852.getContents(null);
					} else if (local45 == 19) {
						@Pc(841) Transferable local841 = (Transferable) local15.anObject9;
						@Pc(844) Clipboard local844 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local844.setContents(local841, null);
					} else {
						@Pc(212) String local212;
						if (local45 == 3) {
							if (Class254.method5765() < aLong212) {
								throw new IOException();
							}
							local212 = (local15.anInt6757 >> 24 & 0xFF) + "." + (local15.anInt6757 >> 16 & 0xFF) + "." + (local15.anInt6757 >> 8 & 0xFF) + "." + (local15.anInt6757 & 0xFF);
							local15.anObject8 = InetAddress.getByName(local212).getHostName();
						} else if (local45 == 21) {
							if (aLong212 > Class254.method5765()) {
								throw new IOException();
							}
							local15.anObject8 = InetAddress.getByName((String) local15.anObject9).getAddress();
						} else if (local45 == 5) {
							local15.anObject8 = this.aClass258_1.method5809();
						} else if (local45 == 6) {
							@Pc(261) Frame local261 = new Frame("Jagex Full Screen");
							local15.anObject8 = local261;
							local261.setResizable(false);
							this.aClass258_1.method5808(local15.anInt6757 >>> 16, local15.anInt6757 & 0xFFFF, local261, local15.anInt6756 >> 16, local15.anInt6756 & 0xFFFF);
						} else if (local45 == 7) {
							this.aClass258_1.method5810();
						} else {
							@Pc(470) Method local470;
							@Pc(462) Class[] local462;
							@Pc(464) Runtime local464;
							if (local45 == 10) {
								local462 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local464 = Runtime.getRuntime();
								if (!aString71.startsWith("mac")) {
									local470 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local462);
									local470.setAccessible(true);
									local470.invoke(local464, local15.anObject9, "jawt");
									local470.setAccessible(false);
								}
								local470 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local462);
								local470.setAccessible(true);
								if (aString71.startsWith("linux") || aString71.startsWith("sunos")) {
									local470.invoke(local464, local15.anObject9, this.method5791("libjaggl_dri.so").toString());
									@Pc(742) Class local742 = ((Class) local15.anObject9).getClassLoader().loadClass("jaggl.X11.dri");
									local742.getMethod("bind").invoke(null);
									local470.invoke(local464, local15.anObject9, this.method5791("libjaggl.so").toString());
									local742.getMethod("close").invoke(null);
								} else if (aString71.startsWith("mac")) {
									local470.invoke(local464, local15.anObject9, this.method5791("libjaggl.jnilib").toString());
								} else if (aString71.startsWith("win")) {
									local470.invoke(local464, local15.anObject9, this.method5791("jaggl.dll").toString());
								} else {
									throw new Exception();
								}
								local470.setAccessible(false);
							} else {
								@Pc(323) int local323;
								if (local45 == 11) {
									@Pc(310) Field local310 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local310.setAccessible(true);
									@Pc(321) Vector local321 = (Vector) local310.get(((Class) local15.anObject9).getClassLoader());
									for (local323 = 0; local321.size() > local323; local323++) {
										@Pc(335) Object local335 = local321.elementAt(local323);
										@Pc(342) Method local342 = local335.getClass().getDeclaredMethod("finalize");
										local342.setAccessible(true);
										local342.invoke(local335);
										local342.setAccessible(false);
										@Pc(359) Field local359 = local335.getClass().getDeclaredField("handle");
										local359.setAccessible(true);
										local359.set(local335, Integer.valueOf(0));
										local359.setAccessible(false);
									}
									local310.setAccessible(false);
								} else {
									@Pc(390) Class259 local390;
									if (local45 == 12) {
										local390 = method5776(this.anInt6758, this.aString72);
										local15.anObject8 = local390;
									} else if (local45 == 13) {
										local390 = method5777(this.anInt6758, this.aString72);
										local15.anObject8 = local390;
									} else if (local45 == 14) {
										@Pc(418) int local418 = local15.anInt6757;
										@Pc(421) int local421 = local15.anInt6756;
										this.aClass256_1.method5798(local421, local418);
									} else if (local45 == 15) {
										@Pc(642) boolean local642 = local15.anInt6757 != 0;
										@Pc(646) Component local646 = (Component) local15.anObject9;
										this.aClass256_1.method5799(local642, local646);
									} else if (local45 == 17) {
										local115 = (Object[]) local15.anObject9;
										this.aClass256_1.method5800((Point) local115[2], (int[]) local115[1], local15.anInt6757, (Component) local115[0], local15.anInt6756);
									} else if (local45 == 16) {
										try {
											if (!aString71.startsWith("win")) {
												throw new Exception();
											}
											local212 = (String) local15.anObject9;
											if (!local212.startsWith("http://") && !local212.startsWith("https://")) {
												throw new Exception();
											}
											@Pc(561) String local561 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
											for (local323 = 0; local212.length() > local323; local323++) {
												if (local561.indexOf(local212.charAt(local323)) == -1) {
													throw new Exception();
												}
											}
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local212 + "\"");
											local15.anObject8 = null;
										} catch (@Pc(603) Exception local603) {
											local15.anObject8 = local603;
											throw local603;
										}
									} else if (local45 == 20) {
										try {
											local462 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
											local464 = Runtime.getRuntime();
											local470 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local462);
											local470.setAccessible(true);
											if (aString71.startsWith("win")) {
												if (aString74.startsWith("amd64") || aString74.startsWith("x86_64")) {
													local470.invoke(local464, local15.anObject9, this.method5791("jagmisc64.dll").toString());
												} else {
													local470.invoke(local464, local15.anObject9, this.method5791("jagmisc.dll").toString());
												}
											}
											local470.setAccessible(false);
										} catch (@Pc(530) Throwable local530) {
											local15.anObject8 = local530;
										}
									} else {
										throw new Exception("");
									}
								}
							}
						}
					}
				}
				local15.anInt6755 = 1;
			} catch (@Pc(910) ThreadDeath local910) {
				throw local910;
			} catch (@Pc(913) Throwable local913) {
				local15.anInt6755 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(I)Lloader!a;")
	private Class252 method5781() {
		return this.method5780(0, null, 14, 0, 12);
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(Ljava/lang/Class;Z)Lloader!a;")
	private Class252 method5782(@OriginalArg(0) Class arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			this.aThread4 = null;
		}
		return this.method5780(0, arg0, 14, 0, 11);
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(IIIILjava/lang/Object;)Lloader!a;")
	private Class252 method5783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4) {
		@Pc(3) Class252 local3 = new Class252();
		synchronized (local3) {
			if (arg0 != 5000) {
				this.aClass259Array1 = null;
			}
			local3.anInt6756 = arg2;
			local3.anObject9 = arg4;
			local3.anInt6754 = arg3;
			local3.anInt6757 = arg1;
			synchronized (this) {
				if (this.aClass252_2 == null) {
					this.aClass252_2 = this.aClass252_3 = local3;
				} else {
					this.aClass252_2.aClass252_1 = local3;
					this.aClass252_2 = local3;
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

	@OriginalMember(owner = "loader!dq", name = "b", descriptor = "(Ljava/lang/Class;I)Lloader!a;")
	private Class252 method5784(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		return arg1 == 28191 ? this.method5780(0, arg0, 14, 0, 20) : (Class252) null;
	}

	@OriginalMember(owner = "loader!dq", name = "c", descriptor = "(I)Lloader!a;")
	private Class252 method5785(@OriginalArg(0) int arg0) {
		if (arg0 != 12) {
			aString69 = null;
		}
		return this.method5780(0, null, arg0 ^ 0x2, 0, 5);
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(Ljava/awt/Component;BZ)Lloader!a;")
	private Class252 method5787(@OriginalArg(0) Component arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) boolean arg2) {
		return arg1 == -4 ? this.method5780(0, arg0, arg1 + 18, arg2 ? 1 : 0, 15) : (Class252) null;
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	private byte[] method5788(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class252 local9 = this.method5783(arg1 + 4979, 0, 0, arg1, arg0);
		return (byte[]) local9.anObject8;
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lloader!a;")
	private Class252 method5789(@OriginalArg(0) int arg0, @OriginalArg(1) Transferable arg1) {
		if (arg0 != 0) {
			this.method5775((byte) 60);
		}
		return this.method5780(0, arg1, 14, 0, 19);
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(Ljava/net/URL;B)Lloader!a;")
	private Class252 method5790(@OriginalArg(0) URL arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != 105) {
			this.anEventQueue2 = null;
		}
		return this.method5780(0, arg0, 14, 0, 4);
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public File method5791(@OriginalArg(1) String arg0) {
		return method5786(this.anInt6758, this.aString72, arg0);
	}

	@OriginalMember(owner = "loader!dq", name = "c", descriptor = "(Z)Lloader!a;")
	private Class252 method5792(@OriginalArg(0) boolean arg0) {
		return arg0 ? this.method5780(0, null, 14, 0, 18) : (Class252) null;
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(BLjava/lang/String;)Lloader!a;")
	private Class252 method5793(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		if (arg0 != -108) {
			this.method5766(null, (byte) -102, 68);
		}
		return this.method5780(0, arg1, 14, 0, 21);
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(Ljava/lang/Class;I)Lloader!a;")
	private Class252 method5794(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method5768(63);
		}
		return this.method5780(0, arg0, 14, 0, 10);
	}

	@OriginalMember(owner = "loader!dq", name = "b", descriptor = "(Ljava/lang/String;I)Lloader!a;")
	private Class252 method5795(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return arg1 == 0 ? this.method5780(0, arg0, 14, 0, 16) : (Class252) null;
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(BLjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lloader!a;")
	private Class252 method5796(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class[] arg2, @OriginalArg(3) Class arg3) {
		return arg0 >= -81 ? (Class252) null : this.method5780(0, new Object[] { arg3, arg1, arg2 }, 14, 0, 8);
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(IZIII)Lloader!a;")
	private Class252 method5797(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!arg1) {
			this.anEventQueue2 = null;
		}
		return this.method5780(arg3 + (arg0 << 16), null, 14, (arg2 << 16) + arg4, 6);
	}
}
