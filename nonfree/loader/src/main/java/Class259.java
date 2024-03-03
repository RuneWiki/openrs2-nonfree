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

@OriginalClass("loader!ml")
public final class Class259 implements Runnable {

	@OriginalMember(owner = "loader!ml", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString76;

	@OriginalMember(owner = "loader!ml", name = "q", descriptor = "Ljava/lang/String;")
	private static String aString77;

	@OriginalMember(owner = "loader!ml", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString78;

	@OriginalMember(owner = "loader!ml", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString80;

	@OriginalMember(owner = "loader!ml", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString81;

	@OriginalMember(owner = "loader!ml", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString82;

	@OriginalMember(owner = "loader!ml", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString83;

	@OriginalMember(owner = "loader!ml", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!ml", name = "u", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!ml", name = "g", descriptor = "I")
	private static final int anInt7264 = 1;

	@OriginalMember(owner = "loader!ml", name = "r", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!ml", name = "v", descriptor = "J")
	private static volatile long aLong235 = 0L;

	@OriginalMember(owner = "loader!ml", name = "o", descriptor = "Lloader!fc;")
	private Interface12 anInterface12_1;

	@OriginalMember(owner = "loader!ml", name = "s", descriptor = "Lloader!cc;")
	private Class256 aClass256_2 = null;

	@OriginalMember(owner = "loader!ml", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!ml", name = "m", descriptor = "Lloader!rl;")
	private Class260 aClass260_1 = null;

	@OriginalMember(owner = "loader!ml", name = "b", descriptor = "Lloader!rl;")
	private Class260 aClass260_2 = null;

	@OriginalMember(owner = "loader!ml", name = "n", descriptor = "Z")
	private boolean aBoolean493 = false;

	@OriginalMember(owner = "loader!ml", name = "j", descriptor = "Lloader!rl;")
	private Class260 aClass260_3 = null;

	@OriginalMember(owner = "loader!ml", name = "A", descriptor = "Lloader!cc;")
	private Class256 aClass256_3 = null;

	@OriginalMember(owner = "loader!ml", name = "w", descriptor = "Ljava/lang/String;")
	private final String aString79;

	@OriginalMember(owner = "loader!ml", name = "x", descriptor = "I")
	private final int anInt7265;

	@OriginalMember(owner = "loader!ml", name = "k", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!ml", name = "p", descriptor = "[Lloader!rl;")
	private final Class260[] aClass260Array1;

	@OriginalMember(owner = "loader!ml", name = "z", descriptor = "Lloader!c;")
	private Class255 aClass255_1;

	@OriginalMember(owner = "loader!ml", name = "y", descriptor = "Lloader!b;")
	private Class254 aClass254_1;

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!ml", name = "b", descriptor = "(Ljava/lang/String;II)Lloader!rl;", line = 188)
	private static Class260 method6533(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(16) String local16;
		if (arg1 == 33) {
			local16 = "jagex_" + arg0 + "_preferences_rc.dat";
		} else if (arg1 == 34) {
			local16 = "jagex_" + arg0 + "_preferences_wip.dat";
		} else {
			local16 = "jagex_" + arg0 + "_preferences.dat";
		}
		@Pc(75) String[] local75 = new String[] { "c:/rscache/", "/rscache/", aString78, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(83) int local83 = 0; local83 < local75.length; local83++) {
			@Pc(91) String local91 = local75[local83];
			if (local91.length() <= 0 || (new File(local91)).exists()) {
				try {
					return new Class260(new File(local91, local16), "rw", 10000L);
				} catch (@Pc(115) Exception local115) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;", line = 350)
	private static File method6542(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg2);
		if (local4 != null) {
			return local4;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString78, "/tmp/", "" };
		@Pc(68) String[] local68 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(76) int local76 = 0; local76 < 2; local76++) {
			for (@Pc(81) int local81 = 0; local81 < local68.length; local81++) {
				for (@Pc(87) int local87 = 0; local87 < local43.length; local87++) {
					@Pc(125) String local125 = local43[local87] + local68[local81] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					@Pc(127) RandomAccessFile local127 = null;
					try {
						@Pc(132) File local132 = new File(local125);
						if (local76 != 0 || local132.exists()) {
							@Pc(146) String local146 = local43[local87];
							if (local76 != 1 || local146.length() <= 0 || (new File(local146)).exists()) {
								(new File(local43[local87] + local68[local81])).mkdir();
								if (arg0 != null) {
									(new File(local43[local87] + local68[local81] + "/" + arg0)).mkdir();
								}
								local127 = new RandomAccessFile(local132, "rw");
								@Pc(215) int local215 = local127.read();
								local127.seek(0L);
								local127.write(local215);
								local127.seek(0L);
								local127.close();
								aHashtable2.put(arg2, local132);
								return local132;
							}
						}
					} catch (@Pc(234) Exception local234) {
						try {
							if (local127 != null) {
								local127.close();
							}
						} catch (@Pc(243) Exception local243) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(IILjava/lang/String;)Lloader!rl;", line = 450)
	private static Class260 method6544(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(13) String local13;
		if (arg0 == 33) {
			local13 = "jagex_" + arg1 + "_preferences2_rc.dat";
		} else if (arg0 == 34) {
			local13 = "jagex_" + arg1 + "_preferences2_wip.dat";
		} else {
			local13 = "jagex_" + arg1 + "_preferences2.dat";
		}
		@Pc(77) String[] local77 = new String[] { "c:/rscache/", "/rscache/", aString78, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(88) int local88 = 0; local88 < local77.length; local88++) {
			@Pc(100) String local100 = local77[local88];
			if (local100.length() <= 0 || (new File(local100)).exists()) {
				try {
					return new Class260(new File(local100, local13), "rw", 10000L);
				} catch (@Pc(127) Exception local127) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!ml", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 1025)
	public Class259(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.aString79 = arg2;
		aString82 = "1.1";
		this.anInt7265 = arg1;
		aString76 = "Unknown";
		this.anApplet3 = arg0;
		try {
			aString76 = System.getProperty("java.vendor");
			aString82 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString77 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString77 = "Unknown";
		}
		aString80 = aString77.toLowerCase();
		try {
			aString81 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString81 = "";
		}
		try {
			aString83 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString83 = "";
		}
		try {
			aString78 = System.getProperty("user.home");
			if (aString78 != null) {
				aString78 = aString78 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (aString78 == null) {
			aString78 = "~/";
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
		} catch (@Pc(124) Exception local124) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(151) Exception local151) {
		}
		this.aClass260_2 = new Class260(method6542(null, this.anInt7265, "random.dat"), "rw", 25L);
		this.aClass260_3 = new Class260(this.method6531("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass260_1 = new Class260(this.method6531("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass260Array1 = new Class260[arg3];
		for (@Pc(192) int local192 = 0; local192 < arg3; local192++) {
			this.aClass260Array1[local192] = new Class260(this.method6531("main_file_cache.idx" + local192), "rw", 1048576L);
		}
		try {
			this.aClass255_1 = new Class255();
		} catch (@Pc(224) Throwable local224) {
		}
		try {
			this.aClass254_1 = new Class254();
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
		this.aBoolean493 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!ml", name = "d", descriptor = "(I)V", line = 8)
	private void method6522(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.anApplet3 = null;
		}
		synchronized (this) {
			this.aBoolean493 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		if (this.aClass260_3 != null) {
			try {
				this.aClass260_3.method6555();
			} catch (@Pc(37) IOException local37) {
			}
		}
		if (this.aClass260_1 != null) {
			try {
				this.aClass260_1.method6555();
			} catch (@Pc(47) IOException local47) {
			}
		}
		if (this.aClass260Array1 != null) {
			for (@Pc(53) int local53 = 0; local53 < this.aClass260Array1.length; local53++) {
				if (this.aClass260Array1[local53] != null) {
					try {
						this.aClass260Array1[local53].method6555();
					} catch (@Pc(76) IOException local76) {
					}
				}
			}
		}
		if (this.aClass260_2 != null) {
			try {
				this.aClass260_2.method6555();
			} catch (@Pc(87) IOException local87) {
			}
		}
	}

	@OriginalMember(owner = "loader!ml", name = "b", descriptor = "(ILjava/lang/Class;)Lloader!cc;", line = 64)
	private Class256 method6523(@OriginalArg(1) Class arg0) {
		return this.method6535(arg0, (byte) -127, 10, 0, 0);
	}

	@OriginalMember(owner = "loader!ml", name = "c", descriptor = "(I)Z", line = 77)
	private boolean method6524(@OriginalArg(0) int arg0) {
		if (arg0 == -8719) {
			return this.aClass255_1 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(BLjava/lang/String;)Lloader!cc;", line = 91)
	private Class256 method6525(@OriginalArg(1) String arg0) {
		return this.method6535(arg0, (byte) -125, 21, 0, 0);
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 101)
	private byte[] method6526(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 == -30696) {
			@Pc(13) Class256 local13 = this.method6545(arg1, (byte) -91, 21, 0, 0);
			return (byte[]) local13.anObject8;
		} else {
			return (byte[]) null;
		}
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(ZLjava/net/URL;)Lloader!cc;", line = 112)
	private Class256 method6527(@OriginalArg(0) boolean arg0, @OriginalArg(1) URL arg1) {
		if (!arg0) {
			this.method6537((byte) -11);
		}
		return this.method6535(arg1, (byte) -113, 4, 0, 0);
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;[Ljava/lang/Class;)Lloader!cc;", line = 128)
	private Class256 method6528(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class[] arg3) {
		if (arg1 != 0) {
			aHashtable2 = null;
		}
		return this.method6535(new Object[] { arg0, arg2, arg3 }, (byte) -112, 8, 0, 0);
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(Ljava/lang/String;II)Lloader!cc;", line = 141)
	private Class256 method6529(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 1) {
			this.method6538(-40, -17, null, true);
		}
		return this.method6535(arg0, (byte) -127, 1, 0, arg1);
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(ZILjava/awt/Component;)Lloader!cc;", line = 154)
	private Class256 method6530(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		if (arg1 >= -88) {
			this.method6537((byte) -55);
		}
		return this.method6535(arg2, (byte) -117, 15, 0, arg0 ? 1 : 0);
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;", line = 164)
	public File method6531(@OriginalArg(0) String arg0) {
		return method6542(this.aString79, this.anInt7265, arg0);
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(Ljava/lang/String;B)Lloader!cc;", line = 175)
	private Class256 method6532(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg1 < 125) {
			this.anInterface12_1 = null;
		}
		return this.method6535(arg0, (byte) -115, 16, 0, 0);
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(ILjava/awt/Point;I[ILjava/awt/Component;I)Lloader!cc;", line = 229)
	private Class256 method6534(@OriginalArg(0) int arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Component arg4, @OriginalArg(5) int arg5) {
		return arg2 == 0 ? this.method6535(new Object[] { arg4, arg3, arg1 }, (byte) -112, 17, arg5, arg0) : (Class256) null;
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(Ljava/lang/Object;BIII)Lloader!cc;", line = 240)
	private Class256 method6535(@OriginalArg(0) Object arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class256 local3 = new Class256();
		local3.anInt7254 = arg4;
		local3.anInt7252 = arg3;
		local3.anObject9 = arg0;
		local3.anInt7253 = arg2;
		if (arg1 > -110) {
			aString82 = null;
		}
		synchronized (this) {
			if (this.aClass256_3 == null) {
				this.aClass256_3 = this.aClass256_2 = local3;
			} else {
				this.aClass256_3.aClass256_1 = local3;
				this.aClass256_3 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(ILjava/lang/Class;)Lloader!cc;", line = 269)
	private Class256 method6536(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) {
		if (arg0 != 0) {
			aString77 = null;
		}
		return this.method6535(arg1, (byte) -122, 20, 0, 0);
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(B)Lloader!cc;", line = 284)
	private Class256 method6537(@OriginalArg(0) byte arg0) {
		if (arg0 >= -125) {
			aString78 = null;
		}
		return this.method6535(null, (byte) -126, 13, 0, 0);
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(IILjava/awt/Component;Z)Lloader!cc;", line = 296)
	private Class256 method6538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) boolean arg3) {
		@Pc(2) Point local2 = arg2.getLocationOnScreen();
		if (arg3) {
			this.aBoolean493 = true;
		}
		return this.method6535(null, (byte) -119, 14, arg1 + local2.y, arg0 - -local2.x);
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(IILjava/lang/Runnable;)Lloader!cc;", line = 311)
	private Class256 method6539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Runnable arg2) {
		if (arg1 != 7000) {
			this.method6549(91);
		}
		return this.method6535(arg2, (byte) -128, 2, 0, arg0);
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Lloader!cc;", line = 323)
	private Class256 method6540(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		return this.method6535(new Object[] { arg0, arg1 }, (byte) -122, 9, 0, 0);
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(Ljava/awt/Frame;I)Lloader!cc;", line = 337)
	private Class256 method6541(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 12) {
			aMethod4 = null;
		}
		return this.method6535(arg0, (byte) -118, 7, 0, 0);
	}

	@OriginalMember(owner = "loader!ml", name = "c", descriptor = "(ILjava/lang/Class;)Lloader!cc;", line = 438)
	private Class256 method6543(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) {
		if (arg0 != 11) {
			this.method6538(-39, -98, null, false);
		}
		return this.method6535(arg1, (byte) -118, 11, 0, 0);
	}

	@OriginalMember(owner = "loader!ml", name = "run", descriptor = "()V", line = 502)
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class256 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean493) {
						return;
					}
					if (this.aClass256_2 != null) {
						local16 = this.aClass256_2;
						this.aClass256_2 = this.aClass256_2.aClass256_1;
						if (this.aClass256_2 == null) {
							this.aClass256_3 = null;
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
				@Pc(45) int local45 = local16.anInt7253;
				if (local45 == 1) {
					if (Class258.method6521() < aLong235) {
						throw new IOException();
					}
					local16.anObject8 = new Socket(InetAddress.getByName((String) local16.anObject9), local16.anInt7254);
				} else if (local45 == 2) {
					@Pc(853) Thread local853 = new Thread((Runnable) local16.anObject9);
					local853.setDaemon(true);
					local853.start();
					local853.setPriority(local16.anInt7254);
					local16.anObject8 = local853;
				} else if (local45 == 4) {
					if (Class258.method6521() < aLong235) {
						throw new IOException();
					}
					local16.anObject8 = new DataInputStream(((URL) local16.anObject9).openStream());
				} else {
					@Pc(73) Object[] local73;
					if (local45 == 8) {
						local73 = (Object[]) local16.anObject9;
						if (((Class) local73[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject8 = ((Class) local73[0]).getDeclaredMethod((String) local73[1], (Class[]) local73[2]);
					} else if (local45 == 9) {
						local73 = (Object[]) local16.anObject9;
						if (((Class) local73[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject8 = ((Class) local73[0]).getDeclaredField((String) local73[1]);
					} else if (local45 == 18) {
						@Pc(788) Clipboard local788 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.anObject8 = local788.getContents(null);
					} else if (local45 == 19) {
						@Pc(108) Transferable local108 = (Transferable) local16.anObject9;
						@Pc(111) Clipboard local111 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local111.setContents(local108, null);
					} else {
						@Pc(211) String local211;
						if (local45 == 3) {
							if (Class258.method6521() < aLong235) {
								throw new IOException();
							}
							local211 = (local16.anInt7254 >> 24 & 0xFF) + "." + (local16.anInt7254 >> 16 & 0xFF) + "." + (local16.anInt7254 >> 8 & 0xFF) + "." + (local16.anInt7254 & 0xFF);
							local16.anObject8 = InetAddress.getByName(local211).getHostName();
						} else if (local45 == 21) {
							if (aLong235 > Class258.method6521()) {
								throw new IOException();
							}
							local16.anObject8 = InetAddress.getByName((String) local16.anObject9).getAddress();
						} else if (local45 == 5) {
							local16.anObject8 = this.aClass255_1.method6497();
						} else if (local45 == 6) {
							@Pc(676) Frame local676 = new Frame("Jagex Full Screen");
							local16.anObject8 = local676;
							local676.setResizable(false);
							this.aClass255_1.method6498(local676, local16.anInt7254 & 0xFFFF, local16.anInt7252 >> 16, local16.anInt7254 >>> 16, local16.anInt7252 & 0xFFFF);
						} else if (local45 == 7) {
							this.aClass255_1.method6496();
						} else {
							@Pc(291) Runtime local291;
							@Pc(297) Method local297;
							@Pc(289) Class[] local289;
							if (local45 == 10) {
								local289 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local291 = Runtime.getRuntime();
								if (!aString80.startsWith("mac")) {
									local297 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local289);
									local297.setAccessible(true);
									local297.invoke(local291, local16.anObject9, "jawt");
									local297.setAccessible(false);
								}
								local297 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local289);
								local297.setAccessible(true);
								if (aString80.startsWith("linux") || aString80.startsWith("sunos")) {
									local297.invoke(local291, local16.anObject9, this.method6531("libjaggl_dri.so").toString());
									@Pc(575) Class local575 = ((Class) local16.anObject9).getClassLoader().loadClass("jaggl.X11.dri");
									local575.getMethod("bind").invoke(null);
									local297.invoke(local291, local16.anObject9, this.method6531("libjaggl.so").toString());
									local575.getMethod("close").invoke(null);
								} else if (aString80.startsWith("mac")) {
									local297.invoke(local291, local16.anObject9, this.method6531("libjaggl.jnilib").toString());
								} else if (aString80.startsWith("win")) {
									local297.invoke(local291, local16.anObject9, this.method6531("jaggl.dll").toString());
								} else {
									throw new Exception();
								}
								local297.setAccessible(false);
							} else {
								@Pc(227) int local227;
								if (local45 == 11) {
									@Pc(421) Field local421 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local421.setAccessible(true);
									@Pc(432) Vector local432 = (Vector) local421.get(((Class) local16.anObject9).getClassLoader());
									for (local227 = 0; local227 < local432.size(); local227++) {
										@Pc(442) Object local442 = local432.elementAt(local227);
										@Pc(449) Method local449 = local442.getClass().getDeclaredMethod("finalize");
										local449.setAccessible(true);
										local449.invoke(local442);
										local449.setAccessible(false);
										@Pc(466) Field local466 = local442.getClass().getDeclaredField("handle");
										local466.setAccessible(true);
										local466.set(local442, Integer.valueOf(0));
										local466.setAccessible(false);
									}
									local421.setAccessible(false);
								} else {
									@Pc(156) Class260 local156;
									if (local45 == 12) {
										local156 = method6533(this.aString79, this.anInt7265);
										local16.anObject8 = local156;
									} else if (local45 == 13) {
										local156 = method6544(this.anInt7265, this.aString79);
										local16.anObject8 = local156;
									} else if (local45 == 14) {
										@Pc(395) int local395 = local16.anInt7254;
										@Pc(398) int local398 = local16.anInt7252;
										this.aClass254_1.method6492(local395, local398);
									} else if (local45 == 15) {
										@Pc(179) boolean local179 = local16.anInt7254 != 0;
										@Pc(183) Component local183 = (Component) local16.anObject9;
										this.aClass254_1.method6494(local179, local183);
									} else if (local45 == 17) {
										local73 = (Object[]) local16.anObject9;
										this.aClass254_1.method6493((int[]) local73[1], local16.anInt7254, local16.anInt7252, (Point) local73[2], (Component) local73[0]);
									} else if (local45 == 16) {
										try {
											if (!aString80.startsWith("win")) {
												throw new Exception();
											}
											local211 = (String) local16.anObject9;
											if (!local211.startsWith("http://") && !local211.startsWith("https://")) {
												throw new Exception();
											}
											@Pc(225) String local225 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
											for (local227 = 0; local211.length() > local227; local227++) {
												if (local225.indexOf(local211.charAt(local227)) == -1) {
													throw new Exception();
												}
											}
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local211 + "\"");
											local16.anObject8 = null;
										} catch (@Pc(266) Exception local266) {
											local16.anObject8 = local266;
											throw local266;
										}
									} else if (local45 == 20) {
										try {
											local289 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
											local291 = Runtime.getRuntime();
											local297 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local289);
											local297.setAccessible(true);
											if (aString80.startsWith("win")) {
												if (aString81.startsWith("amd64") || aString81.startsWith("x86_64")) {
													local297.invoke(local291, local16.anObject9, this.method6531("jagmisc64.dll").toString());
												} else {
													local297.invoke(local291, local16.anObject9, this.method6531("jagmisc.dll").toString());
												}
											}
											local297.setAccessible(false);
										} catch (@Pc(356) Throwable local356) {
											local16.anObject8 = local356;
										}
									} else {
										throw new Exception("");
									}
								}
							}
						}
					}
				}
				local16.anInt7255 = 1;
			} catch (@Pc(896) ThreadDeath local896) {
				throw local896;
			} catch (@Pc(899) Throwable local899) {
				local16.anInt7255 = 2;
			}
			synchronized (local16) {
				local16.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!ml", name = "b", descriptor = "(Ljava/lang/Object;BIII)Lloader!cc;", line = 889)
	private Class256 method6545(@OriginalArg(0) Object arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class256 local3 = new Class256();
		synchronized (local3) {
			local3.anInt7253 = arg2;
			local3.anObject9 = arg0;
			local3.anInt7254 = arg3;
			local3.anInt7252 = arg4;
			synchronized (this) {
				if (this.aClass256_3 == null) {
					this.aClass256_3 = this.aClass256_2 = local3;
				} else {
					this.aClass256_3.aClass256_1 = local3;
					this.aClass256_3 = local3;
				}
				if (arg1 >= -22) {
					this.aClass260_3 = null;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(61) InterruptedException local61) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!ml", name = "d", descriptor = "(B)Lloader!cc;", line = 928)
	private Class256 method6546(@OriginalArg(0) byte arg0) {
		return arg0 == 112 ? this.method6535(null, (byte) -122, 18, 0, 0) : (Class256) null;
	}

	@OriginalMember(owner = "loader!ml", name = "c", descriptor = "(B)Lloader!cc;", line = 938)
	private Class256 method6547(@OriginalArg(0) byte arg0) {
		if (arg0 < 22) {
			this.anInterface12_1 = null;
		}
		return this.method6535(null, (byte) -122, 5, 0, 0);
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lloader!cc;", line = 955)
	private Class256 method6548(@OriginalArg(0) Transferable arg0, @OriginalArg(1) int arg1) {
		return arg1 == 0 ? this.method6535(arg0, (byte) -112, 19, 0, 0) : (Class256) null;
	}

	@OriginalMember(owner = "loader!ml", name = "b", descriptor = "(I)Lloader!fc;", line = 969)
	private Interface12 method6549(@OriginalArg(0) int arg0) {
		if (arg0 != 16) {
			aMethod4 = null;
		}
		return this.anInterface12_1;
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(I)Lloader!cc;", line = 982)
	private Class256 method6550(@OriginalArg(0) int arg0) {
		return arg0 < 6 ? (Class256) null : this.method6535(null, (byte) -127, 12, 0, 0);
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(IIIZI)Lloader!cc;", line = 992)
	private Class256 method6551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return arg3 ? (Class256) null : this.method6535(null, (byte) -117, 6, (arg4 << 16) + arg0, arg2 + (arg1 << 16));
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(BI)Lloader!cc;", line = 1016)
	private Class256 method6552(@OriginalArg(1) int arg0) {
		return this.method6535(null, (byte) -121, 3, 0, arg0);
	}

	@OriginalMember(owner = "loader!ml", name = "b", descriptor = "(B)V", line = 1168)
	private void method6553() {
		aLong235 = Class258.method6521() + 5000L;
	}
}
