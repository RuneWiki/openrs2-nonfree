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

@OriginalClass("loader!ap")
public final class Class221 implements Runnable {

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString255;

	@OriginalMember(owner = "loader!ap", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString256;

	@OriginalMember(owner = "loader!ap", name = "n", descriptor = "Ljava/lang/String;")
	private static String aString257;

	@OriginalMember(owner = "loader!ap", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString259;

	@OriginalMember(owner = "loader!ap", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString260;

	@OriginalMember(owner = "loader!ap", name = "z", descriptor = "Ljava/lang/String;")
	private static String aString261;

	@OriginalMember(owner = "loader!ap", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString262;

	@OriginalMember(owner = "loader!ap", name = "u", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!ap", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!ap", name = "d", descriptor = "I")
	private static final int anInt6764 = 1;

	@OriginalMember(owner = "loader!ap", name = "i", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable1 = new Hashtable(16);

	@OriginalMember(owner = "loader!ap", name = "v", descriptor = "J")
	private static volatile long aLong218 = 0L;

	@OriginalMember(owner = "loader!ap", name = "w", descriptor = "Lloader!a;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "loader!ap", name = "e", descriptor = "Lloader!vd;")
	private Class228 aClass228_1 = null;

	@OriginalMember(owner = "loader!ap", name = "h", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!ap", name = "o", descriptor = "Z")
	private boolean aBoolean447 = false;

	@OriginalMember(owner = "loader!ap", name = "s", descriptor = "Lloader!k;")
	private Class226 aClass226_2 = null;

	@OriginalMember(owner = "loader!ap", name = "r", descriptor = "Lloader!k;")
	private Class226 aClass226_3 = null;

	@OriginalMember(owner = "loader!ap", name = "q", descriptor = "Lloader!vd;")
	private Class228 aClass228_2 = null;

	@OriginalMember(owner = "loader!ap", name = "g", descriptor = "Lloader!k;")
	private Class226 aClass226_1 = null;

	@OriginalMember(owner = "loader!ap", name = "m", descriptor = "Ljava/lang/String;")
	private final String aString258;

	@OriginalMember(owner = "loader!ap", name = "x", descriptor = "I")
	private final int anInt6765;

	@OriginalMember(owner = "loader!ap", name = "l", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!ap", name = "p", descriptor = "[Lloader!k;")
	private final Class226[] aClass226Array1;

	@OriginalMember(owner = "loader!ap", name = "j", descriptor = "Lloader!e;")
	private Class223 aClass223_1;

	@OriginalMember(owner = "loader!ap", name = "A", descriptor = "Lloader!i;")
	private Class225 aClass225_1;

	@OriginalMember(owner = "loader!ap", name = "y", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(Ljava/lang/String;ZI)Lloader!k;")
	private static Class226 method6028(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(16) String local16;
		if (arg1 == 33) {
			local16 = "jagex_" + arg0 + "_preferences2_rc.dat";
		} else if (arg1 == 34) {
			local16 = "jagex_" + arg0 + "_preferences2_wip.dat";
		} else {
			local16 = "jagex_" + arg0 + "_preferences2.dat";
		}
		@Pc(75) String[] local75 = new String[] { "c:/rscache/", "/rscache/", aString261, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(77) int local77 = 0; local77 < local75.length; local77++) {
			@Pc(89) String local89 = local75[local77];
			if (local89.length() <= 0 || (new File(local89)).exists()) {
				try {
					return new Class226(new File(local89, local16), "rw", 10000L);
				} catch (@Pc(113) Exception local113) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(Ljava/lang/String;IB)Lloader!k;")
	private static Class226 method6034(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13;
		if (arg1 == 33) {
			local13 = "jagex_" + arg0 + "_preferences_rc.dat";
		} else if (arg1 == 34) {
			local13 = "jagex_" + arg0 + "_preferences_wip.dat";
		} else {
			local13 = "jagex_" + arg0 + "_preferences.dat";
		}
		@Pc(77) String[] local77 = new String[] { "c:/rscache/", "/rscache/", aString261, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
			@Pc(91) String local91 = local77[local79];
			if (local91.length() <= 0 || (new File(local91)).exists()) {
				try {
					return new Class226(new File(local91, local13), "rw", 10000L);
				} catch (@Pc(117) Exception local117) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	private static File method6039(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable1.get(arg1);
		if (local4 != null) {
			return local4;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString261, "/tmp/", "" };
		@Pc(68) String[] local68 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(70) int local70 = 0; local70 < 2; local70++) {
			for (@Pc(75) int local75 = 0; local75 < local68.length; local75++) {
				for (@Pc(81) int local81 = 0; local81 < local43.length; local81++) {
					@Pc(115) String local115 = local43[local81] + local68[local75] + "/" + (arg2 == null ? "" : arg2 + "/") + arg1;
					@Pc(117) RandomAccessFile local117 = null;
					try {
						@Pc(122) File local122 = new File(local115);
						if (local70 != 0 || local122.exists()) {
							@Pc(135) String local135 = local43[local81];
							if (local70 != 1 || local135.length() <= 0 || (new File(local135)).exists()) {
								(new File(local43[local81] + local68[local75])).mkdir();
								if (arg2 != null) {
									(new File(local43[local81] + local68[local75] + "/" + arg2)).mkdir();
								}
								local117 = new RandomAccessFile(local122, "rw");
								@Pc(199) int local199 = local117.read();
								local117.seek(0L);
								local117.write(local199);
								local117.seek(0L);
								local117.close();
								aHashtable1.put(arg1, local122);
								return local122;
							}
						}
					} catch (@Pc(218) Exception local218) {
						try {
							if (local117 != null) {
								local117.close();
							}
						} catch (@Pc(228) Exception local228) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!ap", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class221(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.aString258 = arg2;
		aString255 = "1.1";
		this.anInt6765 = arg1;
		this.anApplet2 = arg0;
		aString259 = "Unknown";
		try {
			aString259 = System.getProperty("java.vendor");
			aString255 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString257 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString257 = "Unknown";
		}
		aString260 = aString257.toLowerCase();
		try {
			aString256 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString256 = "";
		}
		try {
			aString262 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString262 = "";
		}
		try {
			aString261 = System.getProperty("user.home");
			if (aString261 != null) {
				aString261 = aString261 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (aString261 == null) {
			aString261 = "~/";
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
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aClass226_2 = new Class226(method6039(this.anInt6765, "random.dat", null), "rw", 25L);
		this.aClass226_1 = new Class226(this.method6042("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass226_3 = new Class226(this.method6042("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass226Array1 = new Class226[arg3];
		for (@Pc(190) int local190 = 0; local190 < arg3; local190++) {
			this.aClass226Array1[local190] = new Class226(this.method6042("main_file_cache.idx" + local190), "rw", 1048576L);
		}
		try {
			this.aClass223_1 = new Class223();
		} catch (@Pc(226) Throwable local226) {
		}
		try {
			this.aClass225_1 = new Class225();
		} catch (@Pc(233) Throwable local233) {
		}
		@Pc(236) ThreadGroup local236 = Thread.currentThread().getThreadGroup();
		for (@Pc(239) ThreadGroup local239 = local236.getParent(); local239 != null; local239 = local239.getParent()) {
			local236 = local239;
		}
		@Pc(250) Thread[] local250 = new Thread[1000];
		local236.enumerate(local250);
		for (@Pc(256) int local256 = 0; local256 < local250.length; local256++) {
			if (local250[local256] != null && local250[local256].getName().startsWith("AWT")) {
				local250[local256].setPriority(1);
			}
		}
		this.aBoolean447 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!ap", name = "d", descriptor = "(I)Lloader!vd;")
	private Class228 method6016(@OriginalArg(0) int arg0) {
		if (arg0 < 69) {
			aString261 = null;
		}
		return this.method6020(18, 0, 0, null, 6);
	}

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(Z)Lloader!a;")
	private Interface10 method6017(@OriginalArg(0) boolean arg0) {
		return arg0 ? this.anInterface10_1 : (Interface10) null;
	}

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(II)Lloader!vd;")
	private Class228 method6018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > -42) {
			this.method6042(null);
		}
		return this.method6020(3, 0, arg0, null, 6);
	}

	@OriginalMember(owner = "loader!ap", name = "b", descriptor = "(I)V")
	private void method6019(@OriginalArg(0) int arg0) {
		synchronized (this) {
			this.aBoolean447 = true;
			this.notifyAll();
			if (arg0 != 5953) {
				this.method6035(null, (byte) -75);
			}
		}
		try {
			this.aThread4.join();
		} catch (@Pc(30) InterruptedException local30) {
		}
		if (this.aClass226_1 != null) {
			try {
				this.aClass226_1.method6066();
			} catch (@Pc(39) IOException local39) {
			}
		}
		if (this.aClass226_3 != null) {
			try {
				this.aClass226_3.method6066();
			} catch (@Pc(49) IOException local49) {
			}
		}
		if (this.aClass226Array1 != null) {
			for (@Pc(56) int local56 = 0; local56 < this.aClass226Array1.length; local56++) {
				if (this.aClass226Array1[local56] != null) {
					try {
						this.aClass226Array1[local56].method6066();
					} catch (@Pc(79) IOException local79) {
					}
				}
			}
		}
		if (this.aClass226_2 != null) {
			try {
				this.aClass226_2.method6066();
			} catch (@Pc(90) IOException local90) {
			}
		}
	}

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(IIILjava/lang/Object;I)Lloader!vd;")
	private Class228 method6020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4) {
		if (arg4 != 6) {
			aHashtable1 = null;
		}
		@Pc(9) Class228 local9 = new Class228();
		local9.anObject9 = arg3;
		local9.anInt6777 = arg2;
		local9.anInt6776 = arg1;
		local9.anInt6774 = arg0;
		synchronized (this) {
			if (this.aClass228_2 == null) {
				this.aClass228_2 = this.aClass228_1 = local9;
			} else {
				this.aClass228_2.aClass228_3 = local9;
				this.aClass228_2 = local9;
			}
			this.notify();
			return local9;
		}
	}

	@OriginalMember(owner = "loader!ap", name = "c", descriptor = "(I)V")
	private void method6021(@OriginalArg(0) int arg0) {
		if (arg0 <= 69) {
			this.aBoolean447 = true;
		}
		aLong218 = Class227.method6071() + 5000L;
	}

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(IIIBI)Lloader!vd;")
	private Class228 method6022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		if (arg3 <= 10) {
			this.aClass228_2 = null;
		}
		return this.method6020(6, (arg1 << 16) + arg4, arg2 + (arg0 << 16), null, 6);
	}

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(Ljava/awt/Component;ZB)Lloader!vd;")
	private Class228 method6023(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		if (arg2 != -114) {
			this.aThread4 = null;
		}
		return this.method6020(15, 0, arg1 ? 1 : 0, arg0, 6);
	}

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	private byte[] method6024(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class228 local7 = this.method6026(96, 0, arg0, 0, 21);
		return arg1 >= -79 ? (byte[]) null : (byte[]) local7.anObject10;
	}

	@OriginalMember(owner = "loader!ap", name = "b", descriptor = "(ILjava/lang/Class;)Lloader!vd;")
	private Class228 method6025(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) {
		return arg0 == -17074 ? this.method6020(11, 0, 0, arg1, 6) : (Class228) null;
	}

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(IILjava/lang/Object;II)Lloader!vd;")
	private Class228 method6026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class228 local3 = new Class228();
		synchronized (local3) {
			local3.anInt6776 = arg3;
			local3.anInt6774 = arg4;
			local3.anInt6777 = arg1;
			local3.anObject9 = arg2;
			synchronized (this) {
				if (this.aClass228_2 == null) {
					this.aClass228_2 = this.aClass228_1 = local3;
				} else {
					this.aClass228_2.aClass228_3 = local3;
					this.aClass228_2 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(55) InterruptedException local55) {
			}
			if (arg0 < 51) {
				this.anInterface10_1 = null;
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I)Lloader!vd;")
	private Class228 method6027(@OriginalArg(0) Class[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2, @OriginalArg(3) int arg3) {
		return arg3 == 0 ? this.method6020(8, 0, 0, new Object[] { arg2, arg1, arg0 }, 6) : (Class228) null;
	}

	@OriginalMember(owner = "loader!ap", name = "b", descriptor = "(Z)Z")
	private boolean method6029(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.run();
		}
		return this.aClass223_1 != null;
	}

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lloader!vd;")
	private Class228 method6030(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 > -108) {
			this.method6042(null);
		}
		return this.method6020(9, 0, 0, new Object[] { arg0, arg2 }, 6);
	}

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(ILjava/lang/String;)Lloader!vd;")
	private Class228 method6031(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != 0) {
			this.method6037((byte) 81, null);
		}
		return this.method6020(21, 0, 0, arg1, 6);
	}

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(ILjava/lang/String;I)Lloader!vd;")
	private Class228 method6032(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		return arg0 == 0 ? this.method6020(1, 0, arg2, arg1, 6) : (Class228) null;
	}

	@OriginalMember(owner = "loader!ap", name = "b", descriptor = "(B)Lloader!vd;")
	private Class228 method6033(@OriginalArg(0) byte arg0) {
		return arg0 == -49 ? this.method6020(13, 0, 0, null, 6) : (Class228) null;
	}

	@OriginalMember(owner = "loader!ap", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class228 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean447) {
						return;
					}
					if (this.aClass228_1 != null) {
						local17 = this.aClass228_1;
						this.aClass228_1 = this.aClass228_1.aClass228_3;
						if (this.aClass228_1 == null) {
							this.aClass228_2 = null;
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
				@Pc(46) int local46 = local17.anInt6774;
				if (local46 == 1) {
					if (aLong218 > Class227.method6071()) {
						throw new IOException();
					}
					local17.anObject10 = new Socket(InetAddress.getByName((String) local17.anObject9), local17.anInt6777);
				} else if (local46 == 2) {
					@Pc(88) Thread local88 = new Thread((Runnable) local17.anObject9);
					local88.setDaemon(true);
					local88.start();
					local88.setPriority(local17.anInt6777);
					local17.anObject10 = local88;
				} else if (local46 == 4) {
					if (aLong218 > Class227.method6071()) {
						throw new IOException();
					}
					local17.anObject10 = new DataInputStream(((URL) local17.anObject9).openStream());
				} else {
					@Pc(114) Object[] local114;
					if (local46 == 8) {
						local114 = (Object[]) local17.anObject9;
						if (((Class) local114[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject10 = ((Class) local114[0]).getDeclaredMethod((String) local114[1], (Class[]) local114[2]);
					} else if (local46 == 9) {
						local114 = (Object[]) local17.anObject9;
						if (((Class) local114[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject10 = ((Class) local114[0]).getDeclaredField((String) local114[1]);
					} else if (local46 == 18) {
						@Pc(864) Clipboard local864 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local17.anObject10 = local864.getContents(null);
					} else if (local46 == 19) {
						@Pc(853) Transferable local853 = (Transferable) local17.anObject9;
						@Pc(856) Clipboard local856 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local856.setContents(local853, null);
					} else {
						@Pc(643) String local643;
						if (local46 == 3) {
							if (Class227.method6071() < aLong218) {
								throw new IOException();
							}
							local643 = (local17.anInt6777 >> 24 & 0xFF) + "." + (local17.anInt6777 >> 16 & 0xFF) + "." + (local17.anInt6777 >> 8 & 0xFF) + "." + (local17.anInt6777 & 0xFF);
							local17.anObject10 = InetAddress.getByName(local643).getHostName();
						} else if (local46 == 21) {
							if (aLong218 > Class227.method6071()) {
								throw new IOException();
							}
							local17.anObject10 = InetAddress.getByName((String) local17.anObject9).getAddress();
						} else if (local46 == 5) {
							local17.anObject10 = this.aClass223_1.method6055();
						} else if (local46 == 6) {
							@Pc(747) Frame local747 = new Frame("Jagex Full Screen");
							local17.anObject10 = local747;
							local747.setResizable(false);
							this.aClass223_1.method6056(local17.anInt6777 & 0xFFFF, local17.anInt6776 >> 16, local17.anInt6776 & 0xFFFF, local747, local17.anInt6777 >>> 16);
						} else if (local46 == 7) {
							this.aClass223_1.method6058();
						} else {
							@Pc(227) Class[] local227;
							@Pc(229) Runtime local229;
							@Pc(239) Method local239;
							if (local46 == 10) {
								local227 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local229 = Runtime.getRuntime();
								if (!aString260.startsWith("mac")) {
									local239 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local227);
									local239.setAccessible(true);
									local239.invoke(local229, local17.anObject9, "jawt");
									local239.setAccessible(false);
								}
								local239 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local227);
								local239.setAccessible(true);
								if (aString260.startsWith("linux") || aString260.startsWith("sunos")) {
									local239.invoke(local229, local17.anObject9, this.method6042("libjaggl_dri.so").toString());
									@Pc(303) Class local303 = ((Class) local17.anObject9).getClassLoader().loadClass("jaggl.X11.dri");
									local303.getMethod("bind").invoke(null);
									local239.invoke(local229, local17.anObject9, this.method6042("libjaggl.so").toString());
									local303.getMethod("close").invoke(null);
								} else if (aString260.startsWith("mac")) {
									local239.invoke(local229, local17.anObject9, this.method6042("libjaggl.jnilib").toString());
								} else if (aString260.startsWith("win")) {
									local239.invoke(local229, local17.anObject9, this.method6042("jaggl.dll").toString());
								} else {
									throw new Exception();
								}
								local239.setAccessible(false);
							} else {
								@Pc(420) int local420;
								if (local46 == 11) {
									@Pc(407) Field local407 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local407.setAccessible(true);
									@Pc(418) Vector local418 = (Vector) local407.get(((Class) local17.anObject9).getClassLoader());
									for (local420 = 0; local420 < local418.size(); local420++) {
										@Pc(428) Object local428 = local418.elementAt(local420);
										@Pc(435) Method local435 = local428.getClass().getDeclaredMethod("finalize");
										local435.setAccessible(true);
										local435.invoke(local428);
										local435.setAccessible(false);
										@Pc(452) Field local452 = local428.getClass().getDeclaredField("handle");
										local452.setAccessible(true);
										local452.set(local428, Integer.valueOf(0));
										local452.setAccessible(false);
									}
									local407.setAccessible(false);
								} else {
									@Pc(486) Class226 local486;
									if (local46 == 12) {
										local486 = method6034(this.aString258, this.anInt6765);
										local17.anObject10 = local486;
									} else if (local46 == 13) {
										local486 = method6028(this.aString258, this.anInt6765);
										local17.anObject10 = local486;
									} else if (local46 == 14) {
										@Pc(496) int local496 = local17.anInt6777;
										@Pc(499) int local499 = local17.anInt6776;
										this.aClass225_1.method6063(local496, local499);
									} else if (local46 == 15) {
										@Pc(519) boolean local519 = local17.anInt6777 != 0;
										@Pc(523) Component local523 = (Component) local17.anObject9;
										this.aClass225_1.method6064(local519, local523);
									} else if (local46 == 17) {
										local114 = (Object[]) local17.anObject9;
										this.aClass225_1.method6062((Component) local114[0], local17.anInt6776, (Point) local114[2], (int[]) local114[1], local17.anInt6777);
									} else if (local46 == 16) {
										try {
											if (!aString260.startsWith("win")) {
												throw new Exception();
											}
											local643 = (String) local17.anObject9;
											if (!local643.startsWith("http://") && !local643.startsWith("https://")) {
												throw new Exception();
											}
											@Pc(658) String local658 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
											for (local420 = 0; local420 < local643.length(); local420++) {
												if (local658.indexOf(local643.charAt(local420)) == -1) {
													throw new Exception();
												}
											}
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local643 + "\"");
											local17.anObject10 = null;
										} catch (@Pc(695) Exception local695) {
											local17.anObject10 = local695;
										}
									} else if (local46 == 20) {
										try {
											local227 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
											local229 = Runtime.getRuntime();
											local239 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local227);
											local239.setAccessible(true);
											if (aString260.startsWith("win")) {
												if (aString256.startsWith("amd64") || aString256.startsWith("x86_64")) {
													local239.invoke(local229, local17.anObject9, this.method6042("jagmisc64.dll").toString());
												} else {
													local239.invoke(local229, local17.anObject9, this.method6042("jagmisc.dll").toString());
												}
											}
											local239.setAccessible(false);
										} catch (@Pc(621) Throwable local621) {
											local17.anObject10 = local621;
										}
									} else {
										throw new Exception("");
									}
								}
							}
						}
					}
				}
				local17.anInt6775 = 1;
			} catch (@Pc(897) ThreadDeath local897) {
				throw local897;
			} catch (@Pc(900) Throwable local900) {
				local17.anInt6775 = 2;
			}
			synchronized (local17) {
				local17.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lloader!vd;")
	private Class228 method6035(@OriginalArg(0) Transferable arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != 41) {
			this.method6037((byte) 20, null);
		}
		return this.method6020(19, 0, 0, arg0, arg1 ^ 0x2F);
	}

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(IBILjava/awt/Component;)Lloader!vd;")
	private Class228 method6036(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		if (arg1 != 124) {
			this.method6043(null, true);
		}
		@Pc(11) Point local11 = arg3.getLocationOnScreen();
		return this.method6020(14, arg2 + local11.y, arg0 - -local11.x, null, 6);
	}

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(BLjava/awt/Frame;)Lloader!vd;")
	private Class228 method6037(@OriginalArg(0) byte arg0, @OriginalArg(1) Frame arg1) {
		if (arg0 >= -35) {
			method6039(27, null, null);
		}
		return this.method6020(7, 0, 0, arg1, 6);
	}

	@OriginalMember(owner = "loader!ap", name = "b", descriptor = "(ILjava/lang/String;)Lloader!vd;")
	private Class228 method6038(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return arg0 == 0 ? this.method6020(16, 0, 0, arg1, 6) : (Class228) null;
	}

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(Ljava/awt/Component;II[IILjava/awt/Point;)Lloader!vd;")
	private Class228 method6040(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Point arg5) {
		return arg2 <= 2 ? (Class228) null : this.method6020(17, arg4, arg1, new Object[] { arg0, arg3, arg5 }, 6);
	}

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(B)Lloader!vd;")
	private Class228 method6041(@OriginalArg(0) byte arg0) {
		if (arg0 != -40) {
			this.method6036(13, (byte) -106, 103, null);
		}
		return this.method6020(12, 0, 0, null, 6);
	}

	@OriginalMember(owner = "loader!ap", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public File method6042(@OriginalArg(0) String arg0) {
		return method6039(this.anInt6765, arg0, this.aString258);
	}

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(Ljava/lang/Class;Z)Lloader!vd;")
	private Class228 method6043(@OriginalArg(0) Class arg0, @OriginalArg(1) boolean arg1) {
		return arg1 ? this.method6020(20, 0, 0, arg0, 6) : (Class228) null;
	}

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(I)Lloader!vd;")
	private Class228 method6044(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method6037((byte) 94, null);
		}
		return this.method6020(5, 0, 0, null, arg0 ^ 0x6);
	}

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(ILjava/lang/Class;)Lloader!vd;")
	private Class228 method6045(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) {
		return arg0 == 0 ? this.method6020(10, 0, 0, arg1, 6) : (Class228) null;
	}

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lloader!vd;")
	private Class228 method6046(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 2) {
			this.method6031(-81, null);
		}
		return this.method6020(2, 0, arg0, arg1, 6);
	}

	@OriginalMember(owner = "loader!ap", name = "a", descriptor = "(Ljava/net/URL;I)Lloader!vd;")
	private Class228 method6047(@OriginalArg(0) URL arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 18) {
			this.method6031(-76, null);
		}
		return this.method6020(4, 0, 0, arg0, 6);
	}
}
