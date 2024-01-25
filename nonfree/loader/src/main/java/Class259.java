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

@OriginalClass("loader!mj")
public final class Class259 implements Runnable {

	@OriginalMember(owner = "loader!mj", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString74;

	@OriginalMember(owner = "loader!mj", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString75;

	@OriginalMember(owner = "loader!mj", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString76;

	@OriginalMember(owner = "loader!mj", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString77;

	@OriginalMember(owner = "loader!mj", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString78;

	@OriginalMember(owner = "loader!mj", name = "s", descriptor = "Ljava/lang/String;")
	private static String aString79;

	@OriginalMember(owner = "loader!mj", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString80;

	@OriginalMember(owner = "loader!mj", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!mj", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!mj", name = "o", descriptor = "I")
	private static final int anInt6510 = 1;

	@OriginalMember(owner = "loader!mj", name = "r", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!mj", name = "u", descriptor = "J")
	private static volatile long aLong243 = 0L;

	@OriginalMember(owner = "loader!mj", name = "g", descriptor = "Lloader!qg;")
	private Interface13 anInterface13_1;

	@OriginalMember(owner = "loader!mj", name = "d", descriptor = "Lloader!kj;")
	private Class258 aClass258_2 = null;

	@OriginalMember(owner = "loader!mj", name = "m", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!mj", name = "y", descriptor = "Z")
	private boolean aBoolean509 = false;

	@OriginalMember(owner = "loader!mj", name = "h", descriptor = "Lloader!ia;")
	private Class257 aClass257_3 = null;

	@OriginalMember(owner = "loader!mj", name = "n", descriptor = "Lloader!ia;")
	private Class257 aClass257_1 = null;

	@OriginalMember(owner = "loader!mj", name = "b", descriptor = "Lloader!ia;")
	private Class257 aClass257_2 = null;

	@OriginalMember(owner = "loader!mj", name = "A", descriptor = "Lloader!kj;")
	private Class258 aClass258_3 = null;

	@OriginalMember(owner = "loader!mj", name = "p", descriptor = "Ljava/lang/String;")
	private final String aString73;

	@OriginalMember(owner = "loader!mj", name = "i", descriptor = "I")
	private final int anInt6509;

	@OriginalMember(owner = "loader!mj", name = "f", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!mj", name = "l", descriptor = "[Lloader!ia;")
	private final Class257[] aClass257Array1;

	@OriginalMember(owner = "loader!mj", name = "w", descriptor = "Lloader!f;")
	private Class255 aClass255_1;

	@OriginalMember(owner = "loader!mj", name = "z", descriptor = "Lloader!a;")
	private Class253 aClass253_1;

	@OriginalMember(owner = "loader!mj", name = "x", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "loader!mj", name = "a", descriptor = "(Ljava/lang/String;IB)Lloader!ia;")
	private static Class257 method5772(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(18) String local18;
		if (arg1 == 33) {
			local18 = "jagex_" + arg0 + "_preferences2_rc.dat";
		} else if (arg1 == 34) {
			local18 = "jagex_" + arg0 + "_preferences2_wip.dat";
		} else {
			local18 = "jagex_" + arg0 + "_preferences2.dat";
		}
		@Pc(77) String[] local77 = new String[] { "c:/rscache/", "/rscache/", aString80, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
			@Pc(91) String local91 = local77[local79];
			if (local91.length() <= 0 || (new File(local91)).exists()) {
				try {
					return new Class257(new File(local91, local18), "rw", 10000L);
				} catch (@Pc(114) Exception local114) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!mj", name = "a", descriptor = "(BILjava/lang/String;)Lloader!ia;")
	private static Class257 method5775(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(18) String local18;
		if (arg0 == 33) {
			local18 = "jagex_" + arg1 + "_preferences_rc.dat";
		} else if (arg0 == 34) {
			local18 = "jagex_" + arg1 + "_preferences_wip.dat";
		} else {
			local18 = "jagex_" + arg1 + "_preferences.dat";
		}
		@Pc(77) String[] local77 = new String[] { "c:/rscache/", "/rscache/", aString80, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(85) int local85 = 0; local85 < local77.length; local85++) {
			@Pc(93) String local93 = local77[local85];
			if (local93.length() <= 0 || (new File(local93)).exists()) {
				try {
					return new Class257(new File(local93, local18), "rw", 10000L);
				} catch (@Pc(119) Exception local119) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!mj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
	private static File method5777(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(13) File local13 = (File) aHashtable2.get(arg1);
		if (local13 != null) {
			return local13;
		}
		@Pc(54) String[] local54 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString80, "/tmp/", "" };
		@Pc(79) String[] local79 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(81) int local81 = 0; local81 < 2; local81++) {
			for (@Pc(88) int local88 = 0; local88 < local79.length; local88++) {
				for (@Pc(94) int local94 = 0; local94 < local54.length; local94++) {
					@Pc(128) String local128 = local54[local94] + local79[local88] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(130) RandomAccessFile local130 = null;
					try {
						@Pc(135) File local135 = new File(local128);
						if (local81 != 0 || local135.exists()) {
							@Pc(147) String local147 = local54[local94];
							if (local81 != 1 || local147.length() <= 0 || (new File(local147)).exists()) {
								(new File(local54[local94] + local79[local88])).mkdir();
								if (arg0 != null) {
									(new File(local54[local94] + local79[local88] + "/" + arg0)).mkdir();
								}
								local130 = new RandomAccessFile(local135, "rw");
								@Pc(214) int local214 = local130.read();
								local130.seek(0L);
								local130.write(local214);
								local130.seek(0L);
								local130.close();
								aHashtable2.put(arg1, local135);
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

	@OriginalMember(owner = "loader!mj", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class259(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.aString73 = arg2;
		this.anApplet3 = arg0;
		aString77 = "1.1";
		aString76 = "Unknown";
		this.anInt6509 = arg1;
		try {
			aString76 = System.getProperty("java.vendor");
			aString77 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString79 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString79 = "Unknown";
		}
		aString74 = aString79.toLowerCase();
		try {
			aString75 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString75 = "";
		}
		try {
			aString78 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString78 = "";
		}
		try {
			aString80 = System.getProperty("user.home");
			if (aString80 != null) {
				aString80 = aString80 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString80 == null) {
			aString80 = "~/";
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
		this.aClass257_3 = new Class257(method5777(null, "random.dat", this.anInt6509), "rw", 25L);
		this.aClass257_2 = new Class257(this.method5782("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass257_1 = new Class257(this.method5782("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass257Array1 = new Class257[arg3];
		for (@Pc(193) int local193 = 0; local193 < arg3; local193++) {
			this.aClass257Array1[local193] = new Class257(this.method5782("main_file_cache.idx" + local193), "rw", 1048576L);
		}
		try {
			this.aClass255_1 = new Class255();
		} catch (@Pc(225) Throwable local225) {
		}
		try {
			this.aClass253_1 = new Class253();
		} catch (@Pc(232) Throwable local232) {
		}
		@Pc(235) ThreadGroup local235 = Thread.currentThread().getThreadGroup();
		for (@Pc(238) ThreadGroup local238 = local235.getParent(); local238 != null; local238 = local238.getParent()) {
			local235 = local238;
		}
		@Pc(250) Thread[] local250 = new Thread[1000];
		local235.enumerate(local250);
		for (@Pc(256) int local256 = 0; local256 < local250.length; local256++) {
			if (local250[local256] != null && local250[local256].getName().startsWith("AWT")) {
				local250[local256].setPriority(1);
			}
		}
		this.aBoolean509 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!mj", name = "a", descriptor = "(ILjava/lang/Object;III)Lloader!kj;")
	private Class258 method5770(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class258 local3 = new Class258();
		synchronized (local3) {
			if (arg3 != -35) {
				this.method5794(109);
			}
			local3.anInt6501 = arg2;
			local3.anObject9 = arg1;
			local3.anInt6504 = arg4;
			local3.anInt6502 = arg0;
			synchronized (this) {
				if (this.aClass258_2 == null) {
					this.aClass258_2 = this.aClass258_3 = local3;
				} else {
					this.aClass258_2.aClass258_1 = local3;
					this.aClass258_2 = local3;
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

	@OriginalMember(owner = "loader!mj", name = "a", descriptor = "(B)Lloader!kj;")
	private Class258 method5771(@OriginalArg(0) byte arg0) {
		if (arg0 <= 2) {
			this.aClass257_2 = null;
		}
		return this.method5797(-7, 18, null, 0, 0);
	}

	@OriginalMember(owner = "loader!mj", name = "a", descriptor = "(Z)Lloader!kj;")
	private Class258 method5773(@OriginalArg(0) boolean arg0) {
		return arg0 ? (Class258) null : this.method5797(-7, 13, null, 0, 0);
	}

	@OriginalMember(owner = "loader!mj", name = "a", descriptor = "(Ljava/lang/String;BI)Lloader!kj;")
	private Class258 method5774(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		return arg1 > -124 ? (Class258) null : this.method5797(-7, 1, arg0, 0, arg2);
	}

	@OriginalMember(owner = "loader!mj", name = "a", descriptor = "(I)Lloader!kj;")
	private Class258 method5776(@OriginalArg(0) int arg0) {
		if (arg0 <= 122) {
			aMethod4 = null;
		}
		return this.method5797(-7, 5, null, 0, 0);
	}

	@OriginalMember(owner = "loader!mj", name = "a", descriptor = "(Ljava/lang/String;B)Lloader!kj;")
	private Class258 method5778(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg1 <= 43) {
			this.aThread4 = null;
		}
		return this.method5797(-7, 16, arg0, 0, 0);
	}

	@OriginalMember(owner = "loader!mj", name = "a", descriptor = "(ILjava/awt/Component;Z)Lloader!kj;")
	private Class258 method5779(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) {
		return arg0 == 0 ? this.method5797(-7, 15, arg1, 0, arg2 ? 1 : 0) : (Class258) null;
	}

	@OriginalMember(owner = "loader!mj", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lloader!kj;")
	private Class258 method5780(@OriginalArg(0) byte arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) String arg2) {
		if (arg0 != -24) {
			this.method5770(52, null, 66, 14, 122);
		}
		return this.method5797(-7, 9, new Object[] { arg1, arg2 }, 0, 0);
	}

	@OriginalMember(owner = "loader!mj", name = "a", descriptor = "(IIILjava/awt/Component;)Lloader!kj;")
	private Class258 method5781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		if (arg1 != 14) {
			this.aClass257_3 = null;
		}
		@Pc(9) Point local9 = arg3.getLocationOnScreen();
		return this.method5797(arg1 - 21, 14, null, local9.y + arg0, local9.x + arg2);
	}

	@OriginalMember(owner = "loader!mj", name = "a", descriptor = "(BLjava/lang/String;)Ljava/io/File;")
	public File method5782(@OriginalArg(1) String arg0) {
		return method5777(this.aString73, arg0, this.anInt6509);
	}

	@OriginalMember(owner = "loader!mj", name = "a", descriptor = "(ILjava/net/URL;)Lloader!kj;")
	private Class258 method5783(@OriginalArg(0) int arg0, @OriginalArg(1) URL arg1) {
		if (arg0 >= -74) {
			this.method5770(99, null, -115, 39, 93);
		}
		return this.method5797(-7, 4, arg1, 0, 0);
	}

	@OriginalMember(owner = "loader!mj", name = "c", descriptor = "(B)Z")
	private boolean method5784(@OriginalArg(0) byte arg0) {
		if (arg0 <= 104) {
			return true;
		} else {
			return this.aClass255_1 != null;
		}
	}

	@OriginalMember(owner = "loader!mj", name = "c", descriptor = "(I)Lloader!qg;")
	private Interface13 method5785(@OriginalArg(0) int arg0) {
		return arg0 == 19950 ? this.anInterface13_1 : (Interface13) null;
	}

	@OriginalMember(owner = "loader!mj", name = "b", descriptor = "(I)Lloader!kj;")
	private Class258 method5786(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			method5777(null, null, 74);
		}
		return this.method5797(-7, 12, null, 0, 0);
	}

	@OriginalMember(owner = "loader!mj", name = "b", descriptor = "(ILjava/lang/String;)Lloader!kj;")
	private Class258 method5787(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != 0) {
			this.method5785(-95);
		}
		return this.method5797(-7, 21, arg1, 0, 0);
	}

	@OriginalMember(owner = "loader!mj", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Lloader!kj;")
	private Class258 method5788(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method5797(-7, 2, arg0, 0, arg1);
	}

	@OriginalMember(owner = "loader!mj", name = "a", descriptor = "(II)Lloader!kj;")
	private Class258 method5789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 0 ? this.method5797(-7, 3, null, 0, arg1) : (Class258) null;
	}

	@OriginalMember(owner = "loader!mj", name = "a", descriptor = "(Ljava/awt/Point;I[IBILjava/awt/Component;)Lloader!kj;")
	private Class258 method5790(@OriginalArg(0) Point arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Component arg4) {
		return this.method5797(-7, 17, new Object[] { arg4, arg2, arg0 }, arg3, arg1);
	}

	@OriginalMember(owner = "loader!mj", name = "a", descriptor = "(BLjava/lang/Class;)Lloader!kj;")
	private Class258 method5791(@OriginalArg(0) byte arg0, @OriginalArg(1) Class arg1) {
		if (arg0 > -26) {
			this.method5783(68, null);
		}
		return this.method5797(-7, 20, arg1, 0, 0);
	}

	@OriginalMember(owner = "loader!mj", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lloader!kj;")
	private Class258 method5792(@OriginalArg(0) int arg0, @OriginalArg(1) Transferable arg1) {
		if (arg0 > -26) {
			method5777(null, null, 83);
		}
		return this.method5797(-7, 19, arg1, 0, 0);
	}

	@OriginalMember(owner = "loader!mj", name = "a", descriptor = "(BLjava/awt/Frame;)Lloader!kj;")
	private Class258 method5793(@OriginalArg(1) Frame arg0) {
		return this.method5797(-7, 7, arg0, 0, 0);
	}

	@OriginalMember(owner = "loader!mj", name = "d", descriptor = "(I)V")
	private void method5794(@OriginalArg(0) int arg0) {
		if (arg0 <= 22) {
			this.anInterface13_1 = null;
		}
		aLong243 = Class260.method5808() + 5000L;
	}

	@OriginalMember(owner = "loader!mj", name = "b", descriptor = "(B)V")
	private void method5795(@OriginalArg(0) byte arg0) {
		synchronized (this) {
			this.aBoolean509 = true;
			if (arg0 < 115) {
				aString79 = null;
			}
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		if (this.aClass257_2 != null) {
			try {
				this.aClass257_2.method5759();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass257_1 != null) {
			try {
				this.aClass257_1.method5759();
			} catch (@Pc(47) IOException local47) {
			}
		}
		if (this.aClass257Array1 != null) {
			for (@Pc(53) int local53 = 0; local53 < this.aClass257Array1.length; local53++) {
				if (this.aClass257Array1[local53] != null) {
					try {
						this.aClass257Array1[local53].method5759();
					} catch (@Pc(71) IOException local71) {
					}
				}
			}
		}
		if (this.aClass257_3 != null) {
			try {
				this.aClass257_3.method5759();
			} catch (@Pc(82) IOException local82) {
			}
		}
	}

	@OriginalMember(owner = "loader!mj", name = "a", descriptor = "([Ljava/lang/Class;BLjava/lang/String;Ljava/lang/Class;)Lloader!kj;")
	private Class258 method5796(@OriginalArg(0) Class[] arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class arg3) {
		if (arg1 != -41) {
			this.method5798(-30, -106, -68, true, -115);
		}
		return this.method5797(arg1 ^ 0x2E, 8, new Object[] { arg3, arg2, arg0 }, 0, 0);
	}

	@OriginalMember(owner = "loader!mj", name = "a", descriptor = "(IILjava/lang/Object;II)Lloader!kj;")
	private Class258 method5797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class258 local3 = new Class258();
		local3.anObject9 = arg2;
		if (arg0 != -7) {
			return (Class258) null;
		}
		local3.anInt6504 = arg3;
		local3.anInt6501 = arg1;
		local3.anInt6502 = arg4;
		synchronized (this) {
			if (this.aClass258_2 == null) {
				this.aClass258_2 = this.aClass258_3 = local3;
			} else {
				this.aClass258_2.aClass258_1 = local3;
				this.aClass258_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!mj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class258 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean509) {
						return;
					}
					if (this.aClass258_3 != null) {
						local16 = this.aClass258_3;
						this.aClass258_3 = this.aClass258_3.aClass258_1;
						if (this.aClass258_3 == null) {
							this.aClass258_2 = null;
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
				@Pc(44) int local44 = local16.anInt6501;
				if (local44 == 1) {
					if (Class260.method5808() < aLong243) {
						throw new IOException();
					}
					local16.anObject8 = new Socket(InetAddress.getByName((String) local16.anObject9), local16.anInt6502);
				} else if (local44 == 2) {
					@Pc(854) Thread local854 = new Thread((Runnable) local16.anObject9);
					local854.setDaemon(true);
					local854.start();
					local854.setPriority(local16.anInt6502);
					local16.anObject8 = local854;
				} else if (local44 == 4) {
					if (Class260.method5808() < aLong243) {
						throw new IOException();
					}
					local16.anObject8 = new DataInputStream(((URL) local16.anObject9).openStream());
				} else {
					@Pc(87) Object[] local87;
					if (local44 == 8) {
						local87 = (Object[]) local16.anObject9;
						if (((Class) local87[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject8 = ((Class) local87[0]).getDeclaredMethod((String) local87[1], (Class[]) local87[2]);
					} else if (local44 == 9) {
						local87 = (Object[]) local16.anObject9;
						if (((Class) local87[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject8 = ((Class) local87[0]).getDeclaredField((String) local87[1]);
					} else if (local44 == 18) {
						@Pc(812) Clipboard local812 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.anObject8 = local812.getContents(null);
					} else if (local44 == 19) {
						@Pc(801) Transferable local801 = (Transferable) local16.anObject9;
						@Pc(804) Clipboard local804 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local804.setContents(local801, null);
					} else {
						@Pc(485) String local485;
						if (local44 == 3) {
							if (aLong243 > Class260.method5808()) {
								throw new IOException();
							}
							local485 = (local16.anInt6502 >> 24 & 0xFF) + "." + (local16.anInt6502 >> 16 & 0xFF) + "." + (local16.anInt6502 >> 8 & 0xFF) + "." + (local16.anInt6502 & 0xFF);
							local16.anObject8 = InetAddress.getByName(local485).getHostName();
						} else if (local44 == 21) {
							if (Class260.method5808() < aLong243) {
								throw new IOException();
							}
							local16.anObject8 = InetAddress.getByName((String) local16.anObject9).getAddress();
						} else if (local44 == 5) {
							local16.anObject8 = this.aClass255_1.method5751();
						} else if (local44 == 6) {
							@Pc(691) Frame local691 = new Frame("Jagex Full Screen");
							local16.anObject8 = local691;
							local691.setResizable(false);
							this.aClass255_1.method5754(local16.anInt6502 & 0xFFFF, local16.anInt6504 >> 16, local16.anInt6504 & 0xFFFF, local16.anInt6502 >>> 16, local691);
						} else if (local44 == 7) {
							this.aClass255_1.method5752();
						} else {
							@Pc(176) Method local176;
							@Pc(163) Class[] local163;
							@Pc(165) Runtime local165;
							if (local44 == 10) {
								local163 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local165 = Runtime.getRuntime();
								if (!aString74.startsWith("mac")) {
									local176 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local163);
									local176.setAccessible(true);
									local176.invoke(local165, local16.anObject9, "jawt");
									local176.setAccessible(false);
								}
								local176 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local163);
								local176.setAccessible(true);
								if (aString74.startsWith("linux") || aString74.startsWith("sunos")) {
									local176.invoke(local165, local16.anObject9, this.method5782("libjaggl_dri.so").toString());
									@Pc(292) Class local292 = ((Class) local16.anObject9).getClassLoader().loadClass("jaggl.X11.dri");
									local292.getMethod("bind").invoke(null);
									local176.invoke(local165, local16.anObject9, this.method5782("libjaggl.so").toString());
									local292.getMethod("close").invoke(null);
								} else if (aString74.startsWith("mac")) {
									local176.invoke(local165, local16.anObject9, this.method5782("libjaggl.jnilib").toString());
								} else if (aString74.startsWith("win")) {
									local176.invoke(local165, local16.anObject9, this.method5782("jaggl.dll").toString());
								} else {
									throw new Exception();
								}
								local176.setAccessible(false);
							} else {
								@Pc(356) int local356;
								if (local44 == 11) {
									@Pc(343) Field local343 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local343.setAccessible(true);
									@Pc(354) Vector local354 = (Vector) local343.get(((Class) local16.anObject9).getClassLoader());
									for (local356 = 0; local354.size() > local356; local356++) {
										@Pc(368) Object local368 = local354.elementAt(local356);
										@Pc(375) Method local375 = local368.getClass().getDeclaredMethod("finalize");
										local375.setAccessible(true);
										local375.invoke(local368);
										local375.setAccessible(false);
										@Pc(392) Field local392 = local368.getClass().getDeclaredField("handle");
										local392.setAccessible(true);
										local392.set(local368, Integer.valueOf(0));
										local392.setAccessible(false);
									}
									local343.setAccessible(false);
								} else {
									@Pc(424) Class257 local424;
									if (local44 == 12) {
										local424 = method5775(this.anInt6509, this.aString73);
										local16.anObject8 = local424;
									} else if (local44 == 13) {
										local424 = method5772(this.aString73, this.anInt6509);
										local16.anObject8 = local424;
									} else if (local44 == 14) {
										@Pc(660) int local660 = local16.anInt6502;
										@Pc(663) int local663 = local16.anInt6504;
										this.aClass253_1.method5743(local663, local660);
									} else if (local44 == 15) {
										@Pc(646) boolean local646 = local16.anInt6502 != 0;
										@Pc(650) Component local650 = (Component) local16.anObject9;
										this.aClass253_1.method5741(local646, local650);
									} else if (local44 == 17) {
										local87 = (Object[]) local16.anObject9;
										this.aClass253_1.method5742(local16.anInt6504, (Component) local87[0], local16.anInt6502, (Point) local87[2], (int[]) local87[1]);
									} else if (local44 == 16) {
										try {
											if (!aString74.startsWith("win")) {
												throw new Exception();
											}
											local485 = (String) local16.anObject9;
											if (!local485.startsWith("http://") && !local485.startsWith("https://")) {
												throw new Exception();
											}
											@Pc(499) String local499 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
											for (local356 = 0; local485.length() > local356; local356++) {
												if (local499.indexOf(local485.charAt(local356)) == -1) {
													throw new Exception();
												}
											}
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local485 + "\"");
											local16.anObject8 = null;
										} catch (@Pc(540) Exception local540) {
											local16.anObject8 = local540;
											throw local540;
										}
									} else if (local44 == 20) {
										try {
											local163 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
											local165 = Runtime.getRuntime();
											local176 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local163);
											local176.setAccessible(true);
											if (aString74.startsWith("win")) {
												if (aString75.startsWith("amd64") || aString75.startsWith("x86_64")) {
													local176.invoke(local165, local16.anObject9, this.method5782("jagmisc64.dll").toString());
												} else {
													local176.invoke(local165, local16.anObject9, this.method5782("jagmisc.dll").toString());
												}
											}
											local176.setAccessible(false);
										} catch (@Pc(629) Throwable local629) {
											local16.anObject8 = local629;
										}
									} else {
										throw new Exception("");
									}
								}
							}
						}
					}
				}
				local16.anInt6503 = 1;
			} catch (@Pc(892) ThreadDeath local892) {
				throw local892;
			} catch (@Pc(895) Throwable local895) {
				local16.anInt6503 = 2;
			}
			synchronized (local16) {
				local16.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!mj", name = "a", descriptor = "(IIIZI)Lloader!kj;")
	private Class258 method5798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (!arg3) {
			this.aClass257_3 = null;
		}
		return this.method5797(-7, 6, null, arg2 + (arg4 << 16), arg1 + (arg0 << 16));
	}

	@OriginalMember(owner = "loader!mj", name = "a", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method5799(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(9) Class258 local9 = this.method5770(arg0, arg1, 21, arg0 ^ 0xFFFFFFDD, 0);
		return (byte[]) local9.anObject8;
	}

	@OriginalMember(owner = "loader!mj", name = "a", descriptor = "(ILjava/lang/Class;)Lloader!kj;")
	private Class258 method5800(@OriginalArg(1) Class arg0) {
		return this.method5797(-7, 10, arg0, 0, 0);
	}

	@OriginalMember(owner = "loader!mj", name = "a", descriptor = "(Ljava/lang/Class;I)Lloader!kj;")
	private Class258 method5801(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 11) {
			this.anEventQueue2 = null;
		}
		return this.method5797(-7, 11, arg0, 0, 0);
	}
}
