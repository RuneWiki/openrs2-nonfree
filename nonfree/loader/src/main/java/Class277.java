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

@OriginalClass("loader!ec")
public final class Class277 implements Runnable {

	@OriginalMember(owner = "loader!ec", name = "n", descriptor = "Ljava/lang/String;")
	private static String aString76;

	@OriginalMember(owner = "loader!ec", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString78;

	@OriginalMember(owner = "loader!ec", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString79;

	@OriginalMember(owner = "loader!ec", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString80;

	@OriginalMember(owner = "loader!ec", name = "v", descriptor = "Ljava/lang/String;")
	private static String aString81;

	@OriginalMember(owner = "loader!ec", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString82;

	@OriginalMember(owner = "loader!ec", name = "m", descriptor = "Ljava/lang/String;")
	private static String aString83;

	@OriginalMember(owner = "loader!ec", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!ec", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!ec", name = "f", descriptor = "I")
	private static final int anInt7547 = 1;

	@OriginalMember(owner = "loader!ec", name = "k", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable3 = new Hashtable(16);

	@OriginalMember(owner = "loader!ec", name = "w", descriptor = "J")
	private static volatile long aLong232 = 0L;

	@OriginalMember(owner = "loader!ec", name = "A", descriptor = "Lloader!in;")
	private Interface14 anInterface14_1;

	@OriginalMember(owner = "loader!ec", name = "h", descriptor = "Lloader!wi;")
	private Class280 aClass280_1 = null;

	@OriginalMember(owner = "loader!ec", name = "d", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!ec", name = "i", descriptor = "Lloader!tf;")
	private Class279 aClass279_1 = null;

	@OriginalMember(owner = "loader!ec", name = "e", descriptor = "Lloader!wi;")
	private Class280 aClass280_3 = null;

	@OriginalMember(owner = "loader!ec", name = "q", descriptor = "Lloader!wi;")
	private Class280 aClass280_2 = null;

	@OriginalMember(owner = "loader!ec", name = "r", descriptor = "Lloader!tf;")
	private Class279 aClass279_2 = null;

	@OriginalMember(owner = "loader!ec", name = "s", descriptor = "Z")
	private boolean aBoolean515 = false;

	@OriginalMember(owner = "loader!ec", name = "a", descriptor = "Ljava/lang/String;")
	private final String aString77;

	@OriginalMember(owner = "loader!ec", name = "o", descriptor = "I")
	private int anInt7548;

	@OriginalMember(owner = "loader!ec", name = "g", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!ec", name = "l", descriptor = "[Lloader!wi;")
	private final Class280[] aClass280Array1;

	@OriginalMember(owner = "loader!ec", name = "p", descriptor = "Lloader!a;")
	private Class273 aClass273_1;

	@OriginalMember(owner = "loader!ec", name = "z", descriptor = "Lloader!e;")
	private Class276 aClass276_1;

	@OriginalMember(owner = "loader!ec", name = "t", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!ec", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Ljava/io/File;")
	private static File method5836(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable3.get(arg0);
		if (local4 != null) {
			return local4;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString82, "/tmp/", "" };
		@Pc(69) String[] local69 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(71) int local71 = 0; local71 < 2; local71++) {
			for (@Pc(82) int local82 = 0; local82 < local69.length; local82++) {
				for (@Pc(88) int local88 = 0; local88 < local44.length; local88++) {
					@Pc(127) String local127 = local44[local88] + local69[local82] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
					@Pc(129) RandomAccessFile local129 = null;
					try {
						@Pc(134) File local134 = new File(local127);
						if (local71 != 0 || local134.exists()) {
							@Pc(148) String local148 = local44[local88];
							if (local71 != 1 || local148.length() <= 0 || (new File(local148)).exists()) {
								(new File(local44[local88] + local69[local82])).mkdir();
								if (arg2 != null) {
									(new File(local44[local88] + local69[local82] + "/" + arg2)).mkdir();
								}
								local129 = new RandomAccessFile(local134, "rw");
								@Pc(215) int local215 = local129.read();
								local129.seek(0L);
								local129.write(local215);
								local129.seek(0L);
								local129.close();
								aHashtable3.put(arg0, local134);
								return local134;
							}
						}
					} catch (@Pc(234) Exception local234) {
						try {
							if (local129 != null) {
								local129.close();
							}
						} catch (@Pc(244) Exception local244) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!ec", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Lloader!wi;")
	private static Class280 method5843(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(22) String local22;
		if (arg0 == 33) {
			local22 = "jagex_" + arg1 + "_preferences" + arg2 + "_rc.dat";
		} else if (arg0 == 34) {
			local22 = "jagex_" + arg1 + "_preferences" + arg2 + "_wip.dat";
		} else {
			local22 = "jagex_" + arg1 + "_preferences" + arg2 + ".dat";
		}
		@Pc(100) String[] local100 = new String[] { "c:/rscache/", "/rscache/", aString82, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(102) int local102 = 0; local102 < local100.length; local102++) {
			@Pc(114) String local114 = local100[local102];
			if (local114.length() <= 0 || (new File(local114)).exists()) {
				try {
					return new Class280(new File(local114, local22), "rw", 10000L);
				} catch (@Pc(139) Exception local139) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!ec", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class277(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString79 = "1.1";
		aString78 = "Unknown";
		this.aString77 = arg2;
		this.anApplet2 = arg0;
		this.anInt7548 = arg1;
		try {
			aString78 = System.getProperty("java.vendor");
			aString79 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString81 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString81 = "Unknown";
		}
		aString83 = aString81.toLowerCase();
		try {
			aString80 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString80 = "";
		}
		try {
			aString76 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString76 = "";
		}
		try {
			aString82 = System.getProperty("user.home");
			if (aString82 != null) {
				aString82 = aString82 + "/";
			}
		} catch (@Pc(87) Exception local87) {
		}
		if (aString82 == null) {
			aString82 = "~/";
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
		} catch (@Pc(153) Exception local153) {
		}
		this.aClass280_3 = new Class280(method5836("random.dat", this.anInt7548, null), "rw", 25L);
		this.aClass280_2 = new Class280(this.method5834("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass280_1 = new Class280(this.method5834("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass280Array1 = new Class280[arg3];
		for (@Pc(194) int local194 = 0; local194 < arg3; local194++) {
			this.aClass280Array1[local194] = new Class280(this.method5834("main_file_cache.idx" + local194), "rw", 1048576L);
		}
		try {
			this.aClass273_1 = new Class273();
		} catch (@Pc(230) Throwable local230) {
		}
		try {
			this.aClass276_1 = new Class276();
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
		this.aBoolean515 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!ec", name = "a", descriptor = "(B)Lloader!in;")
	private Interface14 method5815() {
		return this.anInterface14_1;
	}

	@OriginalMember(owner = "loader!ec", name = "b", descriptor = "(I)Lloader!tf;")
	private Class279 method5816(@OriginalArg(0) int arg0) {
		if (arg0 != 800271248) {
			this.method5818(56, false);
		}
		return this.method5844(28895, 0, null, 0, 5);
	}

	@OriginalMember(owner = "loader!ec", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lloader!tf;")
	private Class279 method5817(@OriginalArg(0) Transferable arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != 125) {
			this.aClass279_1 = null;
		}
		return this.method5844(28895, 0, arg0, 0, 19);
	}

	@OriginalMember(owner = "loader!ec", name = "a", descriptor = "(IZ)Lloader!tf;")
	private Class279 method5818(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return arg1 ? this.method5844(28895, 0, null, arg0, 3) : (Class279) null;
	}

	@OriginalMember(owner = "loader!ec", name = "a", descriptor = "(IILjava/lang/Object;II)Lloader!tf;")
	private Class279 method5819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class279 local3 = new Class279();
		synchronized (local3) {
			local3.anObject13 = arg2;
			local3.anInt7558 = arg3;
			local3.anInt7557 = arg1;
			local3.anInt7555 = arg0;
			synchronized (this) {
				if (this.aClass279_2 == null) {
					this.aClass279_2 = this.aClass279_1 = local3;
				} else {
					this.aClass279_2.aClass279_3 = local3;
					this.aClass279_2 = local3;
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

	@OriginalMember(owner = "loader!ec", name = "a", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method5820(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != -3650) {
			this.aClass279_2 = null;
		}
		@Pc(14) Class279 local14 = this.method5819(21, 0, arg1, 0);
		return (byte[]) local14.anObject12;
	}

	@OriginalMember(owner = "loader!ec", name = "a", descriptor = "(ZLjava/awt/Component;II)Lloader!tf;")
	private Class279 method5821(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0) {
			this.method5821(true, null, 83, -121);
		}
		@Pc(12) Point local12 = arg1.getLocationOnScreen();
		return this.method5844(28895, arg2 + local12.y, null, arg3 + local12.x, 14);
	}

	@OriginalMember(owner = "loader!ec", name = "a", descriptor = "(ILjava/lang/String;Z)Lloader!tf;")
	private Class279 method5822(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != 0) {
			this.method5818(83, false);
		}
		return arg2 ? this.method5844(28895, 0, arg1, 0, 12) : this.method5844(28895, 0, arg1, 0, 13);
	}

	@OriginalMember(owner = "loader!ec", name = "a", descriptor = "(ILjava/awt/Frame;)Lloader!tf;")
	private Class279 method5823(@OriginalArg(0) int arg0, @OriginalArg(1) Frame arg1) {
		if (arg0 != 10000) {
			this.method5826(null, true);
		}
		return this.method5844(28895, 0, arg1, 0, 7);
	}

	@OriginalMember(owner = "loader!ec", name = "a", descriptor = "(BLjava/lang/Class;)V")
	private void method5824(@OriginalArg(0) byte arg0, @OriginalArg(1) Class arg1) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(36) Method local36;
		if (!aString83.startsWith("mac")) {
			local36 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local36, Boolean.TRUE);
			local36.invoke(local14, arg1, "jawt");
			local25.invoke(local36, Boolean.FALSE);
		}
		if (arg0 < 13) {
			return;
		}
		local36 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local25.invoke(local36, Boolean.TRUE);
		if (!aString83.startsWith("win")) {
			throw new Exception();
		}
		local36.invoke(local14, arg1, this.method5834("sw3d.dll").toString());
		local25.invoke(local36, Boolean.FALSE);
	}

	@OriginalMember(owner = "loader!ec", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lloader!tf;")
	private Class279 method5825(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2) {
		if (arg0 != -11539) {
			aString82 = null;
		}
		return this.method5844(28895, 0, new Object[] { arg2, arg1 }, 0, 9);
	}

	@OriginalMember(owner = "loader!ec", name = "a", descriptor = "(ILjava/awt/Component;Z)Lloader!tf;")
	private Class279 method5826(@OriginalArg(1) Component arg0, @OriginalArg(2) boolean arg1) {
		return this.method5844(28895, 0, arg0, arg1 ? 1 : 0, 15);
	}

	@OriginalMember(owner = "loader!ec", name = "a", descriptor = "(I)Lloader!tf;")
	private Class279 method5827(@OriginalArg(0) int arg0) {
		return arg0 <= 43 ? (Class279) null : this.method5844(28895, 0, null, 0, 18);
	}

	@OriginalMember(owner = "loader!ec", name = "b", descriptor = "(Z)V")
	private void method5828(@OriginalArg(0) boolean arg0) {
		aLong232 = Class278.method5854() + 5000L;
		if (arg0) {
			this.method5844(0, -44, null, -109, 46);
		}
	}

	@OriginalMember(owner = "loader!ec", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class279 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean515) {
						return;
					}
					if (this.aClass279_1 != null) {
						local16 = this.aClass279_1;
						this.aClass279_1 = this.aClass279_1.aClass279_3;
						if (this.aClass279_1 == null) {
							this.aClass279_2 = null;
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
				@Pc(46) int local46 = local16.anInt7555;
				if (local46 == 1) {
					if (Class278.method5854() < aLong232) {
						throw new IOException();
					}
					local16.anObject12 = new Socket(InetAddress.getByName((String) local16.anObject13), local16.anInt7557);
				} else if (local46 == 2) {
					@Pc(61) Thread local61 = new Thread((Runnable) local16.anObject13);
					local61.setDaemon(true);
					local61.start();
					local61.setPriority(local16.anInt7557);
					local16.anObject12 = local61;
				} else if (local46 == 4) {
					if (aLong232 > Class278.method5854()) {
						throw new IOException();
					}
					local16.anObject12 = new DataInputStream(((URL) local16.anObject13).openStream());
				} else {
					@Pc(85) Object[] local85;
					if (local46 == 8) {
						local85 = (Object[]) local16.anObject13;
						if (((Class) local85[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject12 = ((Class) local85[0]).getDeclaredMethod((String) local85[1], (Class[]) local85[2]);
					} else if (local46 == 9) {
						local85 = (Object[]) local16.anObject13;
						if (((Class) local85[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject12 = ((Class) local85[0]).getDeclaredField((String) local85[1]);
					} else if (local46 == 18) {
						@Pc(660) Clipboard local660 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.anObject12 = local660.getContents(null);
					} else if (local46 == 19) {
						@Pc(157) Transferable local157 = (Transferable) local16.anObject13;
						@Pc(160) Clipboard local160 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local160.setContents(local157, null);
					} else {
						@Pc(368) String local368;
						if (local46 == 3) {
							if (aLong232 > Class278.method5854()) {
								throw new IOException();
							}
							local368 = (local16.anInt7557 >> 24 & 0xFF) + "." + (local16.anInt7557 >> 16 & 0xFF) + "." + (local16.anInt7557 >> 8 & 0xFF) + "." + (local16.anInt7557 & 0xFF);
							local16.anObject12 = InetAddress.getByName(local368).getHostName();
						} else if (local46 == 21) {
							if (aLong232 > Class278.method5854()) {
								throw new IOException();
							}
							local16.anObject12 = InetAddress.getByName((String) local16.anObject13).getAddress();
						} else if (local46 == 5) {
							local16.anObject12 = this.aClass273_1.method5808();
						} else if (local46 == 6) {
							@Pc(566) Frame local566 = new Frame("Jagex Full Screen");
							local16.anObject12 = local566;
							local566.setResizable(false);
							this.aClass273_1.method5810(local16.anInt7557 & 0xFFFF, local566, local16.anInt7557 >>> 16, local16.anInt7558 & 0xFFFF, local16.anInt7558 >> 16);
						} else if (local46 == 7) {
							this.aClass273_1.method5809();
						} else {
							@Pc(384) int local384;
							if (local46 == 11) {
								@Pc(493) Field local493 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local493.setAccessible(true);
								@Pc(504) Vector local504 = (Vector) local493.get(((Class) local16.anObject13).getClassLoader());
								for (local384 = 0; local384 < local504.size(); local384++) {
									@Pc(518) Object local518 = local504.elementAt(local384);
									@Pc(525) Method local525 = local518.getClass().getDeclaredMethod("finalize");
									local525.setAccessible(true);
									local525.invoke(local518);
									local525.setAccessible(false);
									@Pc(542) Field local542 = local518.getClass().getDeclaredField("handle");
									local542.setAccessible(true);
									local542.set(local518, Integer.valueOf(0));
									local542.setAccessible(false);
								}
								local493.setAccessible(false);
							} else {
								@Pc(229) Class280 local229;
								if (local46 == 12) {
									local229 = method5843(this.anInt7548, this.aString77, (String) local16.anObject13);
									local16.anObject12 = local229;
								} else if (local46 == 13) {
									local229 = method5843(this.anInt7548, "", (String) local16.anObject13);
									local16.anObject12 = local229;
								} else if (local46 == 14) {
									@Pc(244) int local244 = local16.anInt7557;
									@Pc(247) int local247 = local16.anInt7558;
									this.aClass276_1.method5812(local244, local247);
								} else if (local46 == 15) {
									@Pc(464) boolean local464 = local16.anInt7557 != 0;
									@Pc(468) Component local468 = (Component) local16.anObject13;
									this.aClass276_1.method5813(local468, local464);
								} else if (local46 == 17) {
									local85 = (Object[]) local16.anObject13;
									this.aClass276_1.method5814((int[]) local85[1], local16.anInt7557, (Component) local85[0], (Point) local85[2], local16.anInt7558);
								} else if (local46 == 16) {
									try {
										if (!aString83.startsWith("win")) {
											throw new Exception();
										}
										local368 = (String) local16.anObject13;
										if (!local368.startsWith("http://") && !local368.startsWith("https://")) {
											throw new Exception();
										}
										@Pc(382) String local382 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
										for (local384 = 0; local384 < local368.length(); local384++) {
											if (local382.indexOf(local368.charAt(local384)) == -1) {
												throw new Exception();
											}
										}
										Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local368 + "\"");
										local16.anObject12 = null;
									} catch (@Pc(424) Exception local424) {
										local16.anObject12 = local424;
										throw local424;
									}
								} else if (local46 == 20) {
									try {
										@Pc(284) Class[] local284 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
										@Pc(286) Runtime local286 = Runtime.getRuntime();
										@Pc(292) Method local292 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local284);
										local292.setAccessible(true);
										if (aString83.startsWith("win")) {
											if (aString80.startsWith("amd64") || aString80.startsWith("x86_64")) {
												local292.invoke(local286, local16.anObject13, this.method5834("jagmisc64.dll").toString());
											} else {
												local292.invoke(local286, local16.anObject13, this.method5834("jagmisc.dll").toString());
											}
										}
										local292.setAccessible(false);
									} catch (@Pc(351) Throwable local351) {
										local16.anObject12 = local351;
									}
								} else {
									throw new Exception("");
								}
							}
						}
					}
				}
				local16.anInt7556 = 1;
			} catch (@Pc(711) ThreadDeath local711) {
				throw local711;
			} catch (@Pc(714) Throwable local714) {
				local16.anInt7556 = 2;
			}
			synchronized (local16) {
				local16.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!ec", name = "a", descriptor = "(Ljava/net/URL;Z)Lloader!tf;")
	private Class279 method5829(@OriginalArg(0) URL arg0, @OriginalArg(1) boolean arg1) {
		return arg1 ? this.method5844(28895, 0, arg0, 0, 4) : (Class279) null;
	}

	@OriginalMember(owner = "loader!ec", name = "a", descriptor = "([ILjava/awt/Point;ILjava/awt/Component;BI)Lloader!tf;")
	private Class279 method5830(@OriginalArg(0) int[] arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3, @OriginalArg(5) int arg4) {
		return this.method5844(28895, arg2, new Object[] { arg3, arg0, arg1 }, arg4, 17);
	}

	@OriginalMember(owner = "loader!ec", name = "a", descriptor = "(IIIIB)Lloader!tf;")
	private Class279 method5831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (arg4 > -86) {
			this.anInt7548 = -97;
		}
		return this.method5844(28895, arg3 + (arg0 << 16), null, arg1 + (arg2 << 16), 6);
	}

	@OriginalMember(owner = "loader!ec", name = "a", descriptor = "(Z)Z")
	private boolean method5832(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return this.aClass273_1 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "loader!ec", name = "a", descriptor = "(I[Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Lloader!tf;")
	private Class279 method5833(@OriginalArg(0) int arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class arg3) {
		if (arg0 != 0) {
			aString82 = null;
		}
		return this.method5844(28895, 0, new Object[] { arg3, arg2, arg1 }, 0, 8);
	}

	@OriginalMember(owner = "loader!ec", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;")
	public File method5834(@OriginalArg(0) String arg0) {
		return method5836(arg0, this.anInt7548, this.aString77);
	}

	@OriginalMember(owner = "loader!ec", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lloader!tf;")
	private Class279 method5835(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 <= 14) {
			this.aClass279_1 = null;
		}
		return this.method5844(28895, 0, arg0, arg2, 2);
	}

	@OriginalMember(owner = "loader!ec", name = "a", descriptor = "(Ljava/lang/String;I)Lloader!tf;")
	private Class279 method5837(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return arg1 == -15248 ? this.method5844(28895, 0, arg0, 0, 16) : (Class279) null;
	}

	@OriginalMember(owner = "loader!ec", name = "c", descriptor = "(I)V")
	private void method5838(@OriginalArg(0) int arg0) {
		synchronized (this) {
			this.aBoolean515 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass280_2 != null) {
			try {
				this.aClass280_2.method5869();
			} catch (@Pc(31) IOException local31) {
			}
		}
		if (arg0 <= 89) {
			this.method5828(false);
		}
		if (this.aClass280_1 != null) {
			try {
				this.aClass280_1.method5869();
			} catch (@Pc(47) IOException local47) {
			}
		}
		if (this.aClass280Array1 != null) {
			for (@Pc(53) int local53 = 0; local53 < this.aClass280Array1.length; local53++) {
				if (this.aClass280Array1[local53] != null) {
					try {
						this.aClass280Array1[local53].method5869();
					} catch (@Pc(73) IOException local73) {
					}
				}
			}
		}
		if (this.aClass280_3 != null) {
			try {
				this.aClass280_3.method5869();
			} catch (@Pc(84) IOException local84) {
			}
		}
	}

	@OriginalMember(owner = "loader!ec", name = "a", descriptor = "(ILjava/lang/Class;)Lloader!tf;")
	private Class279 method5839(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) {
		if (arg0 != 0) {
			this.method5830(null, null, 83, null, -46);
		}
		return this.method5844(28895, 0, arg1, 0, 20);
	}

	@OriginalMember(owner = "loader!ec", name = "b", descriptor = "(BLjava/lang/Class;)Lloader!tf;")
	private Class279 method5840(@OriginalArg(0) byte arg0, @OriginalArg(1) Class arg1) {
		if (arg0 > -104) {
			this.run();
		}
		return this.method5844(28895, 0, arg1, 0, 11);
	}

	@OriginalMember(owner = "loader!ec", name = "b", descriptor = "(ILjava/lang/String;)Lloader!tf;")
	private Class279 method5841(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return arg0 < 21 ? (Class279) null : this.method5844(28895, 0, arg1, 0, 21);
	}

	@OriginalMember(owner = "loader!ec", name = "a", descriptor = "(Ljava/lang/String;II)Lloader!tf;")
	private Class279 method5842(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 0) {
			this.method5815();
		}
		return this.method5844(28895, 0, arg0, arg1, 1);
	}

	@OriginalMember(owner = "loader!ec", name = "b", descriptor = "(IILjava/lang/Object;II)Lloader!tf;")
	private Class279 method5844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class279 local3 = new Class279();
		local3.anInt7555 = arg4;
		local3.anObject13 = arg2;
		if (arg0 != 28895) {
			this.method5838(-94);
		}
		local3.anInt7558 = arg1;
		local3.anInt7557 = arg3;
		synchronized (this) {
			if (this.aClass279_2 == null) {
				this.aClass279_2 = this.aClass279_1 = local3;
			} else {
				this.aClass279_2.aClass279_3 = local3;
				this.aClass279_2 = local3;
			}
			this.notify();
			return local3;
		}
	}
}
