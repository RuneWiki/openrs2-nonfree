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
public final class Class276 implements Runnable {

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString71;

	@OriginalMember(owner = "loader!dq", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString73;

	@OriginalMember(owner = "loader!dq", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString74;

	@OriginalMember(owner = "loader!dq", name = "t", descriptor = "Ljava/lang/String;")
	private static String aString75;

	@OriginalMember(owner = "loader!dq", name = "r", descriptor = "Ljava/lang/String;")
	private static String aString76;

	@OriginalMember(owner = "loader!dq", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString77;

	@OriginalMember(owner = "loader!dq", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString78;

	@OriginalMember(owner = "loader!dq", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!dq", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!dq", name = "m", descriptor = "I")
	private static final int anInt7835 = 1;

	@OriginalMember(owner = "loader!dq", name = "A", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable4 = new Hashtable(16);

	@OriginalMember(owner = "loader!dq", name = "y", descriptor = "J")
	private static volatile long aLong251 = 0L;

	@OriginalMember(owner = "loader!dq", name = "l", descriptor = "Lloader!pv;")
	private Interface15 anInterface15_1;

	@OriginalMember(owner = "loader!dq", name = "k", descriptor = "Z")
	private boolean aBoolean523 = false;

	@OriginalMember(owner = "loader!dq", name = "e", descriptor = "Lloader!sf;")
	private Class281 aClass281_2 = null;

	@OriginalMember(owner = "loader!dq", name = "p", descriptor = "Lloader!sf;")
	private Class281 aClass281_1 = null;

	@OriginalMember(owner = "loader!dq", name = "f", descriptor = "Lloader!sf;")
	private Class281 aClass281_3 = null;

	@OriginalMember(owner = "loader!dq", name = "z", descriptor = "Lloader!ow;")
	private Class279 aClass279_2 = null;

	@OriginalMember(owner = "loader!dq", name = "b", descriptor = "Lloader!ow;")
	private Class279 aClass279_1 = null;

	@OriginalMember(owner = "loader!dq", name = "o", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!dq", name = "i", descriptor = "I")
	private final int anInt7836;

	@OriginalMember(owner = "loader!dq", name = "g", descriptor = "Ljava/lang/String;")
	private final String aString72;

	@OriginalMember(owner = "loader!dq", name = "q", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!dq", name = "u", descriptor = "[Lloader!sf;")
	private Class281[] aClass281Array1;

	@OriginalMember(owner = "loader!dq", name = "n", descriptor = "Lloader!d;")
	private Class275 aClass275_1;

	@OriginalMember(owner = "loader!dq", name = "v", descriptor = "Lloader!g;")
	private Class278 aClass278_1;

	@OriginalMember(owner = "loader!dq", name = "c", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;)Ljava/io/File;")
	private static File method6349(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		@Pc(10) File local10 = (File) aHashtable4.get(arg2);
		if (local10 != null) {
			return local10;
		}
		@Pc(49) String[] local49 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString74, "/tmp/", "" };
		@Pc(74) String[] local74 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(76) int local76 = 0; local76 < 2; local76++) {
			for (@Pc(81) int local81 = 0; local81 < local74.length; local81++) {
				for (@Pc(91) int local91 = 0; local91 < local49.length; local91++) {
					@Pc(125) String local125 = local49[local91] + local74[local81] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(127) RandomAccessFile local127 = null;
					try {
						@Pc(132) File local132 = new File(local125);
						if (local76 != 0 || local132.exists()) {
							@Pc(142) String local142 = local49[local91];
							if (local76 != 1 || local142.length() <= 0 || (new File(local142)).exists()) {
								(new File(local49[local91] + local74[local81])).mkdir();
								if (arg1 != null) {
									(new File(local49[local91] + local74[local81] + "/" + arg1)).mkdir();
								}
								local127 = new RandomAccessFile(local132, "rw");
								@Pc(205) int local205 = local127.read();
								local127.seek(0L);
								local127.write(local205);
								local127.seek(0L);
								local127.close();
								aHashtable4.put(arg2, local132);
								return local132;
							}
						}
					} catch (@Pc(224) Exception local224) {
						try {
							if (local127 != null) {
								local127.close();
							}
						} catch (@Pc(233) Exception local233) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Lloader!sf;")
	private static Class281 method6361(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(28) String local28;
		if (arg1 == 33) {
			local28 = "jagex_" + arg2 + "_preferences" + arg0 + "_rc.dat";
		} else if (arg1 == 34) {
			local28 = "jagex_" + arg2 + "_preferences" + arg0 + "_wip.dat";
		} else {
			local28 = "jagex_" + arg2 + "_preferences" + arg0 + ".dat";
		}
		@Pc(100) String[] local100 = new String[] { "c:/rscache/", "/rscache/", aString74, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(102) int local102 = 0; local102 < local100.length; local102++) {
			@Pc(114) String local114 = local100[local102];
			if (local114.length() <= 0 || (new File(local114)).exists()) {
				try {
					return new Class281(new File(local114, local28), "rw", 10000L);
				} catch (@Pc(139) Exception local139) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!dq", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class276(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anInt7836 = arg1;
		aString71 = "1.1";
		this.aString72 = arg2;
		aString77 = "Unknown";
		this.anApplet2 = arg0;
		try {
			aString77 = System.getProperty("java.vendor");
			aString71 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString76 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString76 = "Unknown";
		}
		aString75 = aString76.toLowerCase();
		try {
			aString78 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString78 = "";
		}
		try {
			aString73 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString73 = "";
		}
		try {
			aString74 = System.getProperty("user.home");
			if (aString74 != null) {
				aString74 = aString74 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString74 == null) {
			aString74 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(97) Throwable local97) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(125) Exception local125) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(153) Exception local153) {
		}
		this.aClass281_1 = new Class281(method6349(this.anInt7836, null, "random.dat"), "rw", 25L);
		this.aClass281_3 = new Class281(this.method6347("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass281_2 = new Class281(this.method6347("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass281Array1 = new Class281[arg3];
		for (@Pc(194) int local194 = 0; local194 < arg3; local194++) {
			this.aClass281Array1[local194] = new Class281(this.method6347("main_file_cache.idx" + local194), "rw", 1048576L);
		}
		try {
			this.aClass275_1 = new Class275();
		} catch (@Pc(230) Throwable local230) {
		}
		try {
			this.aClass278_1 = new Class278();
		} catch (@Pc(237) Throwable local237) {
		}
		@Pc(240) ThreadGroup local240 = Thread.currentThread().getThreadGroup();
		for (@Pc(243) ThreadGroup local243 = local240.getParent(); local243 != null; local243 = local243.getParent()) {
			local240 = local243;
		}
		@Pc(254) Thread[] local254 = new Thread[1000];
		local240.enumerate(local254);
		for (@Pc(260) int local260 = 0; local260 < local254.length; local260++) {
			if (local254[local260] != null && local254[local260].getName().startsWith("AWT")) {
				local254[local260].setPriority(1);
			}
		}
		this.aBoolean523 = false;
		this.aThread6 = new Thread(this);
		this.aThread6.setPriority(10);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(ILjava/lang/Object;III)Lloader!ow;")
	private Class279 method6346(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class279 local3 = new Class279();
		local3.anInt7848 = arg3;
		local3.anObject12 = arg1;
		if (arg0 != -25318) {
			aString78 = null;
		}
		local3.anInt7847 = arg2;
		local3.anInt7846 = arg4;
		synchronized (this) {
			if (this.aClass279_1 == null) {
				this.aClass279_1 = this.aClass279_2 = local3;
			} else {
				this.aClass279_1.aClass279_3 = local3;
				this.aClass279_1 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/io/File;")
	public File method6347(@OriginalArg(1) String arg0) {
		return method6349(this.anInt7836, this.aString72, arg0);
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(BLjava/lang/Class;)V")
	private void method6348(@OriginalArg(0) byte arg0, @OriginalArg(1) Class arg1) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(35) Method local35;
		if (!aString75.startsWith("mac")) {
			local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local35, Boolean.TRUE);
			local35.invoke(local14, arg1, "jawt");
			local25.invoke(local35, Boolean.FALSE);
		}
		local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local25.invoke(local35, Boolean.TRUE);
		if (!aString75.startsWith("win")) {
			throw new Exception();
		}
		local35.invoke(local14, arg1, this.method6347("sw3d.dll").toString());
		if (arg0 >= -117) {
			this.aClass281_3 = null;
		}
		local25.invoke(local35, Boolean.FALSE);
	}

	@OriginalMember(owner = "loader!dq", name = "b", descriptor = "(I)V")
	private void method6350(@OriginalArg(0) int arg0) {
		if (arg0 == 30734) {
			aLong251 = Class280.method6396() + 5000L;
		}
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(IILjava/awt/Component;Ljava/awt/Point;I[I)Lloader!ow;")
	private Class279 method6351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) Point arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		return arg0 == 17 ? this.method6346(-25318, new Object[] { arg2, arg5, arg3 }, 17, arg1, arg4) : (Class279) null;
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lloader!ow;")
	private Class279 method6352(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 < 63) {
			return (Class279) null;
		}
		@Pc(9) Class279 local9 = new Class279();
		synchronized (local9) {
			local9.anInt7846 = arg4;
			local9.anObject12 = arg0;
			local9.anInt7848 = arg1;
			local9.anInt7847 = arg2;
			synchronized (this) {
				if (this.aClass279_1 == null) {
					this.aClass279_1 = this.aClass279_2 = local9;
				} else {
					this.aClass279_1.aClass279_3 = local9;
					this.aClass279_1 = local9;
				}
				this.notify();
			}
			try {
				local9.wait();
			} catch (@Pc(60) InterruptedException local60) {
			}
			return local9;
		}
	}

	@OriginalMember(owner = "loader!dq", name = "b", descriptor = "(Z)Lloader!ow;")
	private Class279 method6353(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aClass281Array1 = null;
		}
		return this.method6346(-25318, null, 5, 0, 0);
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;ZLjava/lang/Class;)Lloader!ow;")
	private Class279 method6354(@OriginalArg(0) Class[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class arg3) {
		if (!arg2) {
			this.aClass281_2 = null;
		}
		return this.method6346(-25318, new Object[] { arg3, arg1, arg0 }, 8, 0, 0);
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(ILjava/awt/Component;IZ)Lloader!ow;")
	private Class279 method6355(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(2) Point local2 = arg1.getLocationOnScreen();
		return arg3 ? this.method6346(-25318, null, 14, local2.x + arg2, local2.y + arg0) : (Class279) null;
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(ZILjava/lang/String;)Lloader!ow;")
	private Class279 method6356(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 == 8) {
			return arg0 ? this.method6346(-25318, arg2, 12, 0, 0) : this.method6346(-25318, arg2, 13, 0, 0);
		} else {
			return (Class279) null;
		}
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(BLjava/net/URL;)Lloader!ow;")
	private Class279 method6357(@OriginalArg(0) byte arg0, @OriginalArg(1) URL arg1) {
		return arg0 == -23 ? this.method6346(-25318, arg1, 4, 0, 0) : (Class279) null;
	}

	@OriginalMember(owner = "loader!dq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class279 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean523) {
						return;
					}
					if (this.aClass279_2 != null) {
						local17 = this.aClass279_2;
						this.aClass279_2 = this.aClass279_2.aClass279_3;
						if (this.aClass279_2 == null) {
							this.aClass279_1 = null;
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
				@Pc(46) int local46 = local17.anInt7847;
				if (local46 == 1) {
					if (aLong251 > Class280.method6396()) {
						throw new IOException();
					}
					local17.anObject13 = new Socket(InetAddress.getByName((String) local17.anObject12), local17.anInt7848);
				} else if (local46 == 2) {
					@Pc(84) Thread local84 = new Thread((Runnable) local17.anObject12);
					local84.setDaemon(true);
					local84.start();
					local84.setPriority(local17.anInt7848);
					local17.anObject13 = local84;
				} else if (local46 == 4) {
					if (aLong251 > Class280.method6396()) {
						throw new IOException();
					}
					local17.anObject13 = new DataInputStream(((URL) local17.anObject12).openStream());
				} else {
					@Pc(276) Object[] local276;
					if (local46 == 8) {
						local276 = (Object[]) local17.anObject12;
						if (((Class) local276[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject13 = ((Class) local276[0]).getDeclaredMethod((String) local276[1], (Class[]) local276[2]);
					} else if (local46 == 9) {
						local276 = (Object[]) local17.anObject12;
						if (((Class) local276[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject13 = ((Class) local276[0]).getDeclaredField((String) local276[1]);
					} else if (local46 == 18) {
						@Pc(634) Clipboard local634 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local17.anObject13 = local634.getContents(null);
					} else if (local46 == 19) {
						@Pc(623) Transferable local623 = (Transferable) local17.anObject12;
						@Pc(626) Clipboard local626 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local626.setContents(local623, null);
					} else {
						@Pc(406) String local406;
						if (local46 == 3) {
							if (Class280.method6396() < aLong251) {
								throw new IOException();
							}
							local406 = (local17.anInt7848 >> 24 & 0xFF) + "." + (local17.anInt7848 >> 16 & 0xFF) + "." + (local17.anInt7848 >> 8 & 0xFF) + "." + (local17.anInt7848 & 0xFF);
							local17.anObject13 = InetAddress.getByName(local406).getHostName();
						} else if (local46 == 21) {
							if (Class280.method6396() < aLong251) {
								throw new IOException();
							}
							local17.anObject13 = InetAddress.getByName((String) local17.anObject12).getAddress();
						} else if (local46 == 5) {
							local17.anObject13 = this.aClass275_1.method6345();
						} else if (local46 == 6) {
							@Pc(182) Frame local182 = new Frame("Jagex Full Screen");
							local17.anObject13 = local182;
							local182.setResizable(false);
							this.aClass275_1.method6342(local17.anInt7848 & 0xFFFF, local17.anInt7848 >>> 16, local182, local17.anInt7846 >> 16, local17.anInt7846 & 0xFFFF);
						} else if (local46 == 7) {
							this.aClass275_1.method6343();
						} else {
							@Pc(422) int local422;
							if (local46 == 11) {
								@Pc(499) Field local499 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local499.setAccessible(true);
								@Pc(510) Vector local510 = (Vector) local499.get(((Class) local17.anObject12).getClassLoader());
								for (local422 = 0; local510.size() > local422; local422++) {
									@Pc(520) Object local520 = local510.elementAt(local422);
									@Pc(527) Method local527 = local520.getClass().getDeclaredMethod("finalize");
									local527.setAccessible(true);
									local527.invoke(local520);
									local527.setAccessible(false);
									@Pc(544) Field local544 = local520.getClass().getDeclaredField("handle");
									local544.setAccessible(true);
									local544.set(local520, Integer.valueOf(0));
									local544.setAccessible(false);
								}
								local499.setAccessible(false);
							} else {
								@Pc(238) Class281 local238;
								if (local46 == 12) {
									local238 = method6361((String) local17.anObject12, this.anInt7836, this.aString72);
									local17.anObject13 = local238;
								} else if (local46 == 13) {
									local238 = method6361((String) local17.anObject12, this.anInt7836, "");
									local17.anObject13 = local238;
								} else if (local46 == 14) {
									@Pc(484) int local484 = local17.anInt7848;
									@Pc(487) int local487 = local17.anInt7846;
									this.aClass278_1.method6382(local484, local487);
								} else if (local46 == 15) {
									@Pc(470) boolean local470 = local17.anInt7848 != 0;
									@Pc(474) Component local474 = (Component) local17.anObject12;
									this.aClass278_1.method6383(local470, local474);
								} else if (local46 == 17) {
									local276 = (Object[]) local17.anObject12;
									this.aClass278_1.method6381(local17.anInt7848, (int[]) local276[1], (Point) local276[2], local17.anInt7846, (Component) local276[0]);
								} else if (local46 == 16) {
									try {
										if (!aString75.startsWith("win")) {
											throw new Exception();
										}
										local406 = (String) local17.anObject12;
										if (!local406.startsWith("http://") && !local406.startsWith("https://")) {
											throw new Exception();
										}
										@Pc(420) String local420 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
										for (local422 = 0; local422 < local406.length(); local422++) {
											if (local420.indexOf(local406.charAt(local422)) == -1) {
												throw new Exception();
											}
										}
										Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local406 + "\"");
										local17.anObject13 = null;
									} catch (@Pc(458) Exception local458) {
										local17.anObject13 = local458;
										throw local458;
									}
								} else if (local46 == 20) {
									try {
										@Pc(317) Class[] local317 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
										@Pc(319) Runtime local319 = Runtime.getRuntime();
										@Pc(325) Method local325 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local317);
										local325.setAccessible(true);
										if (aString75.startsWith("win")) {
											if (aString78.startsWith("amd64") || aString78.startsWith("x86_64")) {
												local325.invoke(local319, local17.anObject12, this.method6347("jagmisc64.dll").toString());
											} else {
												local325.invoke(local319, local17.anObject12, this.method6347("jagmisc.dll").toString());
											}
										}
										local325.setAccessible(false);
									} catch (@Pc(384) Throwable local384) {
										local17.anObject13 = local384;
									}
								} else {
									throw new Exception("");
								}
							}
						}
					}
				}
				local17.anInt7845 = 1;
			} catch (@Pc(706) ThreadDeath local706) {
				throw local706;
			} catch (@Pc(709) Throwable local709) {
				local17.anInt7845 = 2;
			}
			synchronized (local17) {
				local17.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(Ljava/awt/Frame;I)Lloader!ow;")
	private Class279 method6358(@OriginalArg(0) Frame arg0) {
		return this.method6346(-25318, arg0, 7, 0, 0);
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(IIIII)Lloader!ow;")
	private Class279 method6359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 != -503554192) {
			this.method6356(false, -74, null);
		}
		return this.method6346(-25318, null, 6, arg3 + (arg0 << 16), (arg2 << 16) + arg1);
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(II)Lloader!ow;")
	private Class279 method6360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 > -113 ? (Class279) null : this.method6346(-25318, null, 3, arg0, 0);
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(BLjava/lang/String;)Lloader!ow;")
	private Class279 method6362(@OriginalArg(1) String arg0) {
		return this.method6346(-25318, arg0, 16, 0, 0);
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lloader!ow;")
	private Class279 method6363(@OriginalArg(0) Transferable arg0, @OriginalArg(1) int arg1) {
		return arg1 == -5276 ? this.method6346(-25318, arg0, 19, 0, 0) : (Class279) null;
	}

	@OriginalMember(owner = "loader!dq", name = "b", descriptor = "(ILjava/lang/String;)Lloader!ow;")
	private Class279 method6364(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != 27414) {
			this.aClass279_1 = null;
		}
		return this.method6346(-25318, arg1, 21, 0, 0);
	}

	@OriginalMember(owner = "loader!dq", name = "b", descriptor = "(BLjava/lang/Class;)Lloader!ow;")
	private Class279 method6365(@OriginalArg(0) byte arg0, @OriginalArg(1) Class arg1) {
		if (arg0 > -89) {
			this.aBoolean523 = false;
		}
		return this.method6346(-25318, arg1, 20, 0, 0);
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(I)Lloader!ow;")
	private Class279 method6366(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			aString75 = null;
		}
		return this.method6346(-25318, null, 18, 0, 0);
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(ILjava/lang/String;I)Lloader!ow;")
	private Class279 method6367(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 1) {
			this.method6350(-36);
		}
		return this.method6346(arg2 - 25319, arg1, 1, arg0, 0);
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lloader!ow;")
	private Class279 method6368(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1, @OriginalArg(2) int arg2) {
		return arg2 == 0 ? this.method6346(arg2 ^ 0xFFFF9D1A, arg1, 2, arg0, 0) : (Class279) null;
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lloader!ow;")
	private Class279 method6369(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 0) {
			this.method6360(-49, -11);
		}
		return this.method6346(-25318, new Object[] { arg1, arg0 }, 9, 0, 0);
	}

	@OriginalMember(owner = "loader!dq", name = "b", descriptor = "(B)V")
	private void method6370(@OriginalArg(0) byte arg0) {
		synchronized (this) {
			if (arg0 != 32) {
				this.method6372(true);
			}
			this.aBoolean523 = true;
			this.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(28) InterruptedException local28) {
		}
		if (this.aClass281_3 != null) {
			try {
				this.aClass281_3.method6400();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass281_2 != null) {
			try {
				this.aClass281_2.method6400();
			} catch (@Pc(49) IOException local49) {
			}
		}
		if (this.aClass281Array1 != null) {
			for (@Pc(54) int local54 = 0; local54 < this.aClass281Array1.length; local54++) {
				if (this.aClass281Array1[local54] != null) {
					try {
						this.aClass281Array1[local54].method6400();
					} catch (@Pc(77) IOException local77) {
					}
				}
			}
		}
		if (this.aClass281_1 != null) {
			try {
				this.aClass281_1.method6400();
			} catch (@Pc(89) IOException local89) {
			}
		}
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method6371(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(9) Class279 local9 = this.method6352(arg1, 0, 21, arg0 ^ 0x3413, 0);
		if (arg0 != 13388) {
			this.method6375(19, null);
		}
		return (byte[]) local9.anObject13;
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(Z)Lloader!pv;")
	private Interface15 method6372(@OriginalArg(0) boolean arg0) {
		return arg0 ? (Interface15) null : this.anInterface15_1;
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(B)Z")
	private boolean method6373(@OriginalArg(0) byte arg0) {
		if (arg0 != 12) {
			this.aClass281Array1 = null;
		}
		return this.aClass275_1 != null;
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lloader!ow;")
	private Class279 method6374(@OriginalArg(0) Component arg0, @OriginalArg(2) boolean arg1) {
		return this.method6346(-25318, arg0, 15, arg1 ? 1 : 0, 0);
	}

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(ILjava/lang/Class;)Lloader!ow;")
	private Class279 method6375(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) {
		if (arg0 != 11) {
			this.aClass279_2 = null;
		}
		return this.method6346(arg0 - 25329, arg1, 11, 0, 0);
	}
}
