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

@OriginalClass("loader!is")
public final class Class258 implements Runnable {

	@OriginalMember(owner = "loader!is", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString72;

	@OriginalMember(owner = "loader!is", name = "q", descriptor = "Ljava/lang/String;")
	private static String aString73;

	@OriginalMember(owner = "loader!is", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString74;

	@OriginalMember(owner = "loader!is", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString75;

	@OriginalMember(owner = "loader!is", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString76;

	@OriginalMember(owner = "loader!is", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString78;

	@OriginalMember(owner = "loader!is", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString79;

	@OriginalMember(owner = "loader!is", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!is", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!is", name = "s", descriptor = "I")
	private static final int anInt6634 = 1;

	@OriginalMember(owner = "loader!is", name = "x", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!is", name = "u", descriptor = "J")
	private static volatile long aLong214 = 0L;

	@OriginalMember(owner = "loader!is", name = "A", descriptor = "Lloader!uf;")
	private Interface13 anInterface13_1;

	@OriginalMember(owner = "loader!is", name = "r", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!is", name = "c", descriptor = "Lloader!bt;")
	private Class253 aClass253_1 = null;

	@OriginalMember(owner = "loader!is", name = "b", descriptor = "Lloader!or;")
	private Class259 aClass259_1 = null;

	@OriginalMember(owner = "loader!is", name = "n", descriptor = "Z")
	private boolean aBoolean477 = false;

	@OriginalMember(owner = "loader!is", name = "f", descriptor = "Lloader!bt;")
	private Class253 aClass253_2 = null;

	@OriginalMember(owner = "loader!is", name = "y", descriptor = "Lloader!or;")
	private Class259 aClass259_2 = null;

	@OriginalMember(owner = "loader!is", name = "d", descriptor = "Lloader!bt;")
	private Class253 aClass253_3 = null;

	@OriginalMember(owner = "loader!is", name = "w", descriptor = "Ljava/lang/String;")
	private String aString77;

	@OriginalMember(owner = "loader!is", name = "a", descriptor = "I")
	private final int anInt6633;

	@OriginalMember(owner = "loader!is", name = "m", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!is", name = "g", descriptor = "[Lloader!bt;")
	private Class253[] aClass253Array1;

	@OriginalMember(owner = "loader!is", name = "k", descriptor = "Lloader!g;")
	private Class257 aClass257_1;

	@OriginalMember(owner = "loader!is", name = "o", descriptor = "Lloader!b;")
	private Class252 aClass252_1;

	@OriginalMember(owner = "loader!is", name = "z", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "loader!is", name = "a", descriptor = "(Ljava/lang/String;IB)Lloader!bt;")
	private static Class253 method5697(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(18) String local18;
		if (arg1 == 33) {
			local18 = "jagex_" + arg0 + "_preferences_rc.dat";
		} else if (arg1 == 34) {
			local18 = "jagex_" + arg0 + "_preferences_wip.dat";
		} else {
			local18 = "jagex_" + arg0 + "_preferences.dat";
		}
		@Pc(83) String[] local83 = new String[] { "c:/rscache/", "/rscache/", aString72, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(85) int local85 = 0; local85 < local83.length; local85++) {
			@Pc(93) String local93 = local83[local85];
			if (local93.length() <= 0 || (new File(local93)).exists()) {
				try {
					return new Class253(new File(local93, local18), "rw", 10000L);
				} catch (@Pc(120) Exception local120) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!is", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)Ljava/io/File;")
	private static File method5702(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg0);
		if (local4 != null) {
			return local4;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString72, "/tmp/", "" };
		@Pc(69) String[] local69 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(71) int local71 = 0; local71 < 2; local71++) {
			for (@Pc(87) int local87 = 0; local87 < local69.length; local87++) {
				for (@Pc(93) int local93 = 0; local93 < local44.length; local93++) {
					@Pc(132) String local132 = local44[local93] + local69[local87] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(134) RandomAccessFile local134 = null;
					try {
						@Pc(139) File local139 = new File(local132);
						if (local71 != 0 || local139.exists()) {
							@Pc(150) String local150 = local44[local93];
							if (local71 != 1 || local150.length() <= 0 || (new File(local150)).exists()) {
								(new File(local44[local93] + local69[local87])).mkdir();
								if (arg1 != null) {
									(new File(local44[local93] + local69[local87] + "/" + arg1)).mkdir();
								}
								local134 = new RandomAccessFile(local139, "rw");
								@Pc(215) int local215 = local134.read();
								local134.seek(0L);
								local134.write(local215);
								local134.seek(0L);
								local134.close();
								aHashtable2.put(arg0, local139);
								return local139;
							}
						}
					} catch (@Pc(234) Exception local234) {
						try {
							if (local134 != null) {
								local134.close();
							}
						} catch (@Pc(244) Exception local244) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!is", name = "a", descriptor = "(BILjava/lang/String;)Lloader!bt;")
	private static Class253 method5712(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(24) String local24;
		if (arg0 == 33) {
			local24 = "jagex_" + arg1 + "_preferences2_rc.dat";
		} else if (arg0 == 34) {
			local24 = "jagex_" + arg1 + "_preferences2_wip.dat";
		} else {
			local24 = "jagex_" + arg1 + "_preferences2.dat";
		}
		@Pc(83) String[] local83 = new String[] { "c:/rscache/", "/rscache/", aString72, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(85) int local85 = 0; local85 < local83.length; local85++) {
			@Pc(93) String local93 = local83[local85];
			if (local93.length() <= 0 || (new File(local93)).exists()) {
				try {
					return new Class253(new File(local93, local24), "rw", 10000L);
				} catch (@Pc(120) Exception local120) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!is", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class258(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.aString77 = arg2;
		this.anInt6633 = arg1;
		aString79 = "Unknown";
		this.anApplet2 = arg0;
		aString78 = "1.1";
		try {
			aString79 = System.getProperty("java.vendor");
			aString78 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString76 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString76 = "Unknown";
		}
		aString73 = aString76.toLowerCase();
		try {
			aString75 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString75 = "";
		}
		try {
			aString74 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString74 = "";
		}
		try {
			aString72 = System.getProperty("user.home");
			if (aString72 != null) {
				aString72 = aString72 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString72 == null) {
			aString72 = "~/";
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
		this.aClass253_1 = new Class253(method5702("random.dat", null, this.anInt6633), "rw", 25L);
		this.aClass253_2 = new Class253(this.method5700("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass253_3 = new Class253(this.method5700("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass253Array1 = new Class253[arg3];
		for (@Pc(192) int local192 = 0; local192 < arg3; local192++) {
			this.aClass253Array1[local192] = new Class253(this.method5700("main_file_cache.idx" + local192), "rw", 1048576L);
		}
		try {
			this.aClass257_1 = new Class257();
		} catch (@Pc(224) Throwable local224) {
		}
		try {
			this.aClass252_1 = new Class252();
		} catch (@Pc(231) Throwable local231) {
		}
		@Pc(234) ThreadGroup local234 = Thread.currentThread().getThreadGroup();
		for (@Pc(237) ThreadGroup local237 = local234.getParent(); local237 != null; local237 = local237.getParent()) {
			local234 = local237;
		}
		@Pc(248) Thread[] local248 = new Thread[1000];
		local234.enumerate(local248);
		for (@Pc(254) int local254 = 0; local254 < local248.length; local254++) {
			if (local248[local254] != null && local248[local254].getName().startsWith("AWT")) {
				local248[local254].setPriority(1);
			}
		}
		this.aBoolean477 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!is", name = "e", descriptor = "(I)Lloader!uf;")
	private Interface13 method5696() {
		return this.anInterface13_1;
	}

	@OriginalMember(owner = "loader!is", name = "a", descriptor = "(ILjava/awt/Component;BI)Lloader!or;")
	private Class259 method5698(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		if (arg2 == -14) {
			@Pc(8) Point local8 = arg1.getLocationOnScreen();
			return this.method5703(14, local8.y + arg3, true, local8.x + arg0, null);
		} else {
			return (Class259) null;
		}
	}

	@OriginalMember(owner = "loader!is", name = "c", descriptor = "(I)V")
	private void method5699(@OriginalArg(0) int arg0) {
		synchronized (this) {
			this.aBoolean477 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass253_2 != null) {
			try {
				this.aClass253_2.method5682();
			} catch (@Pc(31) IOException local31) {
			}
		}
		if (this.aClass253_3 != null) {
			try {
				this.aClass253_3.method5682();
			} catch (@Pc(42) IOException local42) {
			}
		}
		if (this.aClass253Array1 != null) {
			for (@Pc(48) int local48 = 0; local48 < this.aClass253Array1.length; local48++) {
				if (this.aClass253Array1[local48] != null) {
					try {
						this.aClass253Array1[local48].method5682();
					} catch (@Pc(66) IOException local66) {
					}
				}
			}
		}
		if (this.aClass253_1 != null) {
			try {
				this.aClass253_1.method5682();
			} catch (@Pc(79) IOException local79) {
			}
		}
		if (arg0 >= -72) {
			this.aThread4 = null;
		}
	}

	@OriginalMember(owner = "loader!is", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;")
	public File method5700(@OriginalArg(0) String arg0) {
		return method5702(arg0, this.aString77, this.anInt6633);
	}

	@OriginalMember(owner = "loader!is", name = "a", descriptor = "(ILjava/awt/Frame;)Lloader!or;")
	private Class259 method5701(@OriginalArg(0) int arg0, @OriginalArg(1) Frame arg1) {
		if (arg0 != 10479) {
			this.method5700(null);
		}
		return this.method5703(7, 0, true, 0, arg1);
	}

	@OriginalMember(owner = "loader!is", name = "a", descriptor = "(IIZILjava/lang/Object;)Lloader!or;")
	private Class259 method5703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4) {
		@Pc(3) Class259 local3 = new Class259();
		local3.anInt6639 = arg0;
		local3.anObject8 = arg4;
		local3.anInt6642 = arg3;
		local3.anInt6641 = arg1;
		synchronized (this) {
			if (this.aClass259_1 == null) {
				this.aClass259_1 = this.aClass259_2 = local3;
			} else {
				this.aClass259_1.aClass259_3 = local3;
				this.aClass259_1 = local3;
			}
			this.notify();
		}
		if (!arg2) {
			this.method5699(119);
		}
		return local3;
	}

	@OriginalMember(owner = "loader!is", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lloader!or;")
	private Class259 method5704(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 != 1) {
			this.aString77 = null;
		}
		return this.method5703(2, 0, true, arg2, arg0);
	}

	@OriginalMember(owner = "loader!is", name = "a", descriptor = "(Z)Lloader!or;")
	private Class259 method5705(@OriginalArg(0) boolean arg0) {
		return arg0 ? this.method5703(18, 0, true, 0, null) : (Class259) null;
	}

	@OriginalMember(owner = "loader!is", name = "a", descriptor = "(BLjava/awt/datatransfer/Transferable;)Lloader!or;")
	private Class259 method5706(@OriginalArg(1) Transferable arg0) {
		return this.method5703(19, 0, true, 0, arg0);
	}

	@OriginalMember(owner = "loader!is", name = "b", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method5707(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != 32222) {
			aString75 = null;
		}
		@Pc(13) Class259 local13 = this.method5724(0, 0, 21, arg1);
		return (byte[]) local13.anObject9;
	}

	@OriginalMember(owner = "loader!is", name = "a", descriptor = "(IBLjava/lang/String;)Lloader!or;")
	private Class259 method5708(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) String arg2) {
		if (arg1 != 87) {
			this.method5727(-35);
		}
		return this.method5703(1, 0, true, arg0, arg2);
	}

	@OriginalMember(owner = "loader!is", name = "d", descriptor = "(I)Z")
	private boolean method5709() {
		return this.aClass257_1 != null;
	}

	@OriginalMember(owner = "loader!is", name = "a", descriptor = "(Ljava/awt/Component;ILjava/awt/Point;[III)Lloader!or;")
	private Class259 method5710(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Point arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return arg4 == -29482 ? this.method5703(17, arg1, true, arg5, new Object[] { arg0, arg3, arg2 }) : (Class259) null;
	}

	@OriginalMember(owner = "loader!is", name = "a", descriptor = "(IIIII)Lloader!or;")
	private Class259 method5711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != 0) {
			this.method5698(-47, null, (byte) -13, -41);
		}
		return this.method5703(6, (arg2 << 16) + arg1, true, (arg3 << 16) + arg4, null);
	}

	@OriginalMember(owner = "loader!is", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lloader!or;")
	private Class259 method5713(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		return arg2 == 15 ? this.method5703(15, 0, true, arg1 ? 1 : 0, arg0) : (Class259) null;
	}

	@OriginalMember(owner = "loader!is", name = "a", descriptor = "(II)Lloader!or;")
	private Class259 method5714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.aBoolean477 = true;
		}
		return this.method5703(3, 0, true, arg0, null);
	}

	@OriginalMember(owner = "loader!is", name = "a", descriptor = "(Ljava/lang/Class;B)Lloader!or;")
	private Class259 method5715(@OriginalArg(0) Class arg0) {
		return this.method5703(20, 0, true, 0, arg0);
	}

	@OriginalMember(owner = "loader!is", name = "a", descriptor = "(ILjava/lang/Class;)Lloader!or;")
	private Class259 method5716(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) {
		if (arg0 != 0) {
			this.method5700(null);
		}
		return this.method5703(11, 0, true, 0, arg1);
	}

	@OriginalMember(owner = "loader!is", name = "f", descriptor = "(I)Lloader!or;")
	private Class259 method5717(@OriginalArg(0) int arg0) {
		if (arg0 != 5712) {
			this.method5701(-90, null);
		}
		return this.method5703(5, 0, true, 0, null);
	}

	@OriginalMember(owner = "loader!is", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;B)Lloader!or;")
	private Class259 method5718(@OriginalArg(0) Class arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) String arg2, @OriginalArg(3) byte arg3) {
		if (arg3 < 60) {
			this.method5715(null);
		}
		return this.method5703(8, 0, true, 0, new Object[] { arg0, arg2, arg1 });
	}

	@OriginalMember(owner = "loader!is", name = "a", descriptor = "(Ljava/lang/Class;Z)Lloader!or;")
	private Class259 method5719(@OriginalArg(0) Class arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			this.method5705(false);
		}
		return this.method5703(10, 0, !arg1, 0, arg0);
	}

	@OriginalMember(owner = "loader!is", name = "a", descriptor = "(Ljava/lang/String;I)Lloader!or;")
	private Class259 method5720(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 21) {
			this.method5713(null, true, 108);
		}
		return this.method5703(21, 0, true, 0, arg0);
	}

	@OriginalMember(owner = "loader!is", name = "a", descriptor = "(Ljava/net/URL;B)Lloader!or;")
	private Class259 method5721(@OriginalArg(0) URL arg0, @OriginalArg(1) byte arg1) {
		if (arg1 <= 22) {
			this.method5706(null);
		}
		return this.method5703(4, 0, true, 0, arg0);
	}

	@OriginalMember(owner = "loader!is", name = "a", descriptor = "(I)V")
	private void method5722(@OriginalArg(0) int arg0) {
		aLong214 = Class255.method5684() + 5000L;
		if (arg0 != 5000) {
			this.method5714(18, -43);
		}
	}

	@OriginalMember(owner = "loader!is", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class259 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean477) {
						return;
					}
					if (this.aClass259_2 != null) {
						local16 = this.aClass259_2;
						this.aClass259_2 = this.aClass259_2.aClass259_3;
						if (this.aClass259_2 == null) {
							this.aClass259_1 = null;
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
				@Pc(45) int local45 = local16.anInt6639;
				if (local45 == 1) {
					if (Class255.method5684() < aLong214) {
						throw new IOException();
					}
					local16.anObject9 = new Socket(InetAddress.getByName((String) local16.anObject8), local16.anInt6642);
				} else if (local45 == 2) {
					@Pc(850) Thread local850 = new Thread((Runnable) local16.anObject8);
					local850.setDaemon(true);
					local850.start();
					local850.setPriority(local16.anInt6642);
					local16.anObject9 = local850;
				} else if (local45 == 4) {
					if (aLong214 > Class255.method5684()) {
						throw new IOException();
					}
					local16.anObject9 = new DataInputStream(((URL) local16.anObject8).openStream());
				} else {
					@Pc(75) Object[] local75;
					if (local45 == 8) {
						local75 = (Object[]) local16.anObject8;
						if (((Class) local75[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject9 = ((Class) local75[0]).getDeclaredMethod((String) local75[1], (Class[]) local75[2]);
					} else if (local45 == 9) {
						local75 = (Object[]) local16.anObject8;
						if (((Class) local75[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject9 = ((Class) local75[0]).getDeclaredField((String) local75[1]);
					} else if (local45 == 18) {
						@Pc(785) Clipboard local785 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.anObject9 = local785.getContents(null);
					} else if (local45 == 19) {
						@Pc(774) Transferable local774 = (Transferable) local16.anObject8;
						@Pc(777) Clipboard local777 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local777.setContents(local774, null);
					} else {
						@Pc(161) String local161;
						if (local45 == 3) {
							if (aLong214 > Class255.method5684()) {
								throw new IOException();
							}
							local161 = (local16.anInt6642 >> 24 & 0xFF) + "." + (local16.anInt6642 >> 16 & 0xFF) + "." + (local16.anInt6642 >> 8 & 0xFF) + "." + (local16.anInt6642 & 0xFF);
							local16.anObject9 = InetAddress.getByName(local161).getHostName();
						} else if (local45 == 21) {
							if (Class255.method5684() < aLong214) {
								throw new IOException();
							}
							local16.anObject9 = InetAddress.getByName((String) local16.anObject8).getAddress();
						} else if (local45 == 5) {
							local16.anObject9 = this.aClass257_1.method5689();
						} else if (local45 == 6) {
							@Pc(181) Frame local181 = new Frame("Jagex Full Screen");
							local16.anObject9 = local181;
							local181.setResizable(false);
							this.aClass257_1.method5688(local16.anInt6641 & 0xFFFF, local181, local16.anInt6641 >> 16, local16.anInt6642 & 0xFFFF, local16.anInt6642 >>> 16);
						} else if (local45 == 7) {
							this.aClass257_1.method5690();
						} else {
							@Pc(359) Method local359;
							@Pc(351) Class[] local351;
							@Pc(353) Runtime local353;
							if (local45 == 10) {
								local351 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local353 = Runtime.getRuntime();
								if (!aString73.startsWith("mac")) {
									local359 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local351);
									local359.setAccessible(true);
									local359.invoke(local353, local16.anObject8, "jawt");
									local359.setAccessible(false);
								}
								local359 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local351);
								local359.setAccessible(true);
								if (aString73.startsWith("linux") || aString73.startsWith("sunos")) {
									local359.invoke(local353, local16.anObject8, this.method5700("libjaggl_dri.so").toString());
									@Pc(645) Class local645 = ((Class) local16.anObject8).getClassLoader().loadClass("jaggl.X11.dri");
									local645.getMethod("bind").invoke(null);
									local359.invoke(local353, local16.anObject8, this.method5700("libjaggl.so").toString());
									local645.getMethod("close").invoke(null);
								} else if (aString73.startsWith("mac")) {
									local359.invoke(local353, local16.anObject8, this.method5700("libjaggl.jnilib").toString());
								} else if (aString73.startsWith("win")) {
									local359.invoke(local353, local16.anObject8, this.method5700("jaggl.dll").toString());
								} else {
									throw new Exception();
								}
								local359.setAccessible(false);
							} else {
								@Pc(240) int local240;
								if (local45 == 11) {
									@Pc(227) Field local227 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local227.setAccessible(true);
									@Pc(238) Vector local238 = (Vector) local227.get(((Class) local16.anObject8).getClassLoader());
									for (local240 = 0; local238.size() > local240; local240++) {
										@Pc(248) Object local248 = local238.elementAt(local240);
										@Pc(255) Method local255 = local248.getClass().getDeclaredMethod("finalize");
										local255.setAccessible(true);
										local255.invoke(local248);
										local255.setAccessible(false);
										@Pc(272) Field local272 = local248.getClass().getDeclaredField("handle");
										local272.setAccessible(true);
										local272.set(local248, Integer.valueOf(0));
										local272.setAccessible(false);
									}
									local227.setAccessible(false);
								} else {
									@Pc(306) Class253 local306;
									if (local45 == 12) {
										local306 = method5697(this.aString77, this.anInt6633);
										local16.anObject9 = local306;
									} else if (local45 == 13) {
										local306 = method5712(this.anInt6633, this.aString77);
										local16.anObject9 = local306;
									} else if (local45 == 14) {
										@Pc(316) int local316 = local16.anInt6642;
										@Pc(319) int local319 = local16.anInt6641;
										this.aClass252_1.method5676(local316, local319);
									} else if (local45 == 15) {
										@Pc(534) boolean local534 = local16.anInt6642 != 0;
										@Pc(538) Component local538 = (Component) local16.anObject8;
										this.aClass252_1.method5675(local538, local534);
									} else if (local45 == 17) {
										local75 = (Object[]) local16.anObject8;
										this.aClass252_1.method5677((Point) local75[2], (int[]) local75[1], (Component) local75[0], local16.anInt6642, local16.anInt6641);
									} else if (local45 == 16) {
										try {
											if (!aString73.startsWith("win")) {
												throw new Exception();
											}
											local161 = (String) local16.anObject8;
											if (!local161.startsWith("http://") && !local161.startsWith("https://")) {
												throw new Exception();
											}
											@Pc(454) String local454 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
											for (local240 = 0; local240 < local161.length(); local240++) {
												if (local454.indexOf(local161.charAt(local240)) == -1) {
													throw new Exception();
												}
											}
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local161 + "\"");
											local16.anObject9 = null;
										} catch (@Pc(492) Exception local492) {
											local16.anObject9 = local492;
											throw local492;
										}
									} else if (local45 == 20) {
										try {
											local351 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
											local353 = Runtime.getRuntime();
											local359 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local351);
											local359.setAccessible(true);
											if (aString73.startsWith("win")) {
												if (aString75.startsWith("amd64") || aString75.startsWith("x86_64")) {
													local359.invoke(local353, local16.anObject8, this.method5700("jagmisc64.dll").toString());
												} else {
													local359.invoke(local353, local16.anObject8, this.method5700("jagmisc.dll").toString());
												}
											}
											local359.setAccessible(false);
										} catch (@Pc(419) Throwable local419) {
											local16.anObject9 = local419;
										}
									} else {
										throw new Exception("");
									}
								}
							}
						}
					}
				}
				local16.anInt6640 = 1;
			} catch (@Pc(892) ThreadDeath local892) {
				throw local892;
			} catch (@Pc(895) Throwable local895) {
				local16.anInt6640 = 2;
			}
			synchronized (local16) {
				local16.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!is", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;B)Lloader!or;")
	private Class259 method5723(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) byte arg2) {
		if (arg2 >= -94) {
			this.aClass253Array1 = null;
		}
		return this.method5703(9, 0, true, 0, new Object[] { arg1, arg0 });
	}

	@OriginalMember(owner = "loader!is", name = "a", descriptor = "(IIIILjava/lang/Object;)Lloader!or;")
	private Class259 method5724(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(11) Class259 local11 = new Class259();
		synchronized (local11) {
			local11.anInt6642 = arg0;
			local11.anInt6641 = arg1;
			local11.anObject8 = arg3;
			local11.anInt6639 = arg2;
			synchronized (this) {
				if (this.aClass259_1 == null) {
					this.aClass259_1 = this.aClass259_2 = local11;
				} else {
					this.aClass259_1.aClass259_3 = local11;
					this.aClass259_1 = local11;
				}
				this.notify();
			}
			try {
				local11.wait();
			} catch (@Pc(63) InterruptedException local63) {
			}
			return local11;
		}
	}

	@OriginalMember(owner = "loader!is", name = "b", descriptor = "(Z)Lloader!or;")
	private Class259 method5725(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.aClass253_1 = null;
		}
		return this.method5703(12, 0, true, 0, null);
	}

	@OriginalMember(owner = "loader!is", name = "a", descriptor = "(ILjava/lang/String;)Lloader!or;")
	private Class259 method5726(@OriginalArg(1) String arg0) {
		return this.method5703(16, 0, true, 0, arg0);
	}

	@OriginalMember(owner = "loader!is", name = "b", descriptor = "(I)Lloader!or;")
	private Class259 method5727(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			aHashtable2 = null;
		}
		return this.method5703(13, 0, true, 0, null);
	}
}
