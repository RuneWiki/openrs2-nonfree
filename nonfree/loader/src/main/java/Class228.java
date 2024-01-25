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

@OriginalClass("loader!vj")
public final class Class228 implements Runnable {

	@OriginalMember(owner = "loader!vj", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString314;

	@OriginalMember(owner = "loader!vj", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString315;

	@OriginalMember(owner = "loader!vj", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString316;

	@OriginalMember(owner = "loader!vj", name = "s", descriptor = "Ljava/lang/String;")
	private static String aString317;

	@OriginalMember(owner = "loader!vj", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString318;

	@OriginalMember(owner = "loader!vj", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString320;

	@OriginalMember(owner = "loader!vj", name = "A", descriptor = "Ljava/lang/String;")
	private static String aString321;

	@OriginalMember(owner = "loader!vj", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!vj", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!vj", name = "c", descriptor = "I")
	private static final int anInt6421 = 1;

	@OriginalMember(owner = "loader!vj", name = "o", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!vj", name = "u", descriptor = "J")
	private static volatile long aLong227 = 0L;

	@OriginalMember(owner = "loader!vj", name = "w", descriptor = "Lloader!pg;")
	private Interface11 anInterface11_1;

	@OriginalMember(owner = "loader!vj", name = "d", descriptor = "Lloader!ue;")
	private Class226 aClass226_2 = null;

	@OriginalMember(owner = "loader!vj", name = "r", descriptor = "Lloader!um;")
	private Class227 aClass227_1 = null;

	@OriginalMember(owner = "loader!vj", name = "a", descriptor = "Z")
	private boolean aBoolean437 = false;

	@OriginalMember(owner = "loader!vj", name = "y", descriptor = "Lloader!ue;")
	private Class226 aClass226_3 = null;

	@OriginalMember(owner = "loader!vj", name = "f", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!vj", name = "h", descriptor = "Lloader!um;")
	private Class227 aClass227_2 = null;

	@OriginalMember(owner = "loader!vj", name = "p", descriptor = "Lloader!um;")
	private Class227 aClass227_3 = null;

	@OriginalMember(owner = "loader!vj", name = "z", descriptor = "Ljava/lang/String;")
	private String aString319;

	@OriginalMember(owner = "loader!vj", name = "n", descriptor = "I")
	private int anInt6422;

	@OriginalMember(owner = "loader!vj", name = "e", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!vj", name = "i", descriptor = "[Lloader!um;")
	private final Class227[] aClass227Array1;

	@OriginalMember(owner = "loader!vj", name = "x", descriptor = "Lloader!g;")
	private Class224 aClass224_1;

	@OriginalMember(owner = "loader!vj", name = "q", descriptor = "Lloader!c;")
	private Class221 aClass221_1;

	@OriginalMember(owner = "loader!vj", name = "k", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!vj", name = "a", descriptor = "(Ljava/lang/String;IZ)Lloader!um;")
	private static Class227 method5878(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(18) String local18;
		if (arg1 == 33) {
			local18 = "jagex_" + arg0 + "_preferences_rc.dat";
		} else if (arg1 == 34) {
			local18 = "jagex_" + arg0 + "_preferences_wip.dat";
		} else {
			local18 = "jagex_" + arg0 + "_preferences.dat";
		}
		@Pc(77) String[] local77 = new String[] { "c:/rscache/", "/rscache/", aString321, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(84) int local84 = 0; local84 < local77.length; local84++) {
			@Pc(96) String local96 = local77[local84];
			if (local96.length() <= 0 || (new File(local96)).exists()) {
				try {
					return new Class227(new File(local96, local18), "rw", 10000L);
				} catch (@Pc(121) Exception local121) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!vj", name = "a", descriptor = "(Ljava/lang/String;II)Lloader!um;")
	private static Class227 method5880(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(16) String local16;
		if (arg1 == 33) {
			local16 = "jagex_" + arg0 + "_preferences2_rc.dat";
		} else if (arg1 == 34) {
			local16 = "jagex_" + arg0 + "_preferences2_wip.dat";
		} else {
			local16 = "jagex_" + arg0 + "_preferences2.dat";
		}
		@Pc(75) String[] local75 = new String[] { "c:/rscache/", "/rscache/", aString321, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(83) int local83 = 0; local83 < local75.length; local83++) {
			@Pc(91) String local91 = local75[local83];
			if (local91.length() <= 0 || (new File(local91)).exists()) {
				try {
					return new Class227(new File(local91, local16), "rw", 10000L);
				} catch (@Pc(118) Exception local118) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!vj", name = "a", descriptor = "(IZLjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	private static File method5883(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg1);
		if (local4 != null) {
			return local4;
		}
		@Pc(45) String[] local45 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString321, "/tmp/", "" };
		@Pc(70) String[] local70 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(72) int local72 = 0; local72 < 2; local72++) {
			for (@Pc(77) int local77 = 0; local77 < local70.length; local77++) {
				for (@Pc(83) int local83 = 0; local83 < local45.length; local83++) {
					@Pc(122) String local122 = local45[local83] + local70[local77] + "/" + (arg2 == null ? "" : arg2 + "/") + arg1;
					@Pc(124) RandomAccessFile local124 = null;
					try {
						@Pc(129) File local129 = new File(local122);
						if (local72 != 0 || local129.exists()) {
							@Pc(143) String local143 = local45[local83];
							if (local72 != 1 || local143.length() <= 0 || (new File(local143)).exists()) {
								(new File(local45[local83] + local70[local77])).mkdir();
								if (arg2 != null) {
									(new File(local45[local83] + local70[local77] + "/" + arg2)).mkdir();
								}
								local124 = new RandomAccessFile(local129, "rw");
								@Pc(208) int local208 = local124.read();
								local124.seek(0L);
								local124.write(local208);
								local124.seek(0L);
								local124.close();
								aHashtable2.put(arg1, local129);
								return local129;
							}
						}
					} catch (@Pc(227) Exception local227) {
						try {
							if (local124 != null) {
								local124.close();
							}
						} catch (@Pc(236) Exception local236) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!vj", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class228(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.aString319 = arg2;
		this.anApplet3 = arg0;
		aString320 = "Unknown";
		aString315 = "1.1";
		this.anInt6422 = arg1;
		try {
			aString320 = System.getProperty("java.vendor");
			aString315 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString318 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString318 = "Unknown";
		}
		aString317 = aString318.toLowerCase();
		try {
			aString314 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString314 = "";
		}
		try {
			aString316 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString316 = "";
		}
		try {
			aString321 = System.getProperty("user.home");
			if (aString321 != null) {
				aString321 = aString321 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (aString321 == null) {
			aString321 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(96) Throwable local96) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(124) Exception local124) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(151) Exception local151) {
		}
		this.aClass227_3 = new Class227(method5883(this.anInt6422, "random.dat", null), "rw", 25L);
		this.aClass227_2 = new Class227(this.method5873("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass227_1 = new Class227(this.method5873("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass227Array1 = new Class227[arg3];
		for (@Pc(192) int local192 = 0; local192 < arg3; local192++) {
			this.aClass227Array1[local192] = new Class227(this.method5873("main_file_cache.idx" + local192), "rw", 1048576L);
		}
		try {
			this.aClass224_1 = new Class224();
		} catch (@Pc(224) Throwable local224) {
		}
		try {
			this.aClass221_1 = new Class221();
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
		this.aBoolean437 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!vj", name = "c", descriptor = "(I)V")
	private void method5872(@OriginalArg(0) int arg0) {
		if (arg0 >= 48) {
			aLong227 = Class225.method5865() + 5000L;
		}
	}

	@OriginalMember(owner = "loader!vj", name = "b", descriptor = "(Ljava/lang/String;B)Ljava/io/File;")
	public File method5873(@OriginalArg(0) String arg0) {
		return method5883(this.anInt6422, arg0, this.aString319);
	}

	@OriginalMember(owner = "loader!vj", name = "a", descriptor = "(Ljava/awt/Component;III)Lloader!ue;")
	private Class226 method5874(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 > -24) {
			this.method5872(-128);
		}
		@Pc(8) Point local8 = arg0.getLocationOnScreen();
		return this.method5887(null, local8.x + arg2, arg1 + local8.y, (byte) 105, 14);
	}

	@OriginalMember(owner = "loader!vj", name = "a", descriptor = "(B)Lloader!ue;")
	private Class226 method5875(@OriginalArg(0) byte arg0) {
		if (arg0 != 41) {
			this.method5895(null, (byte) 38);
		}
		return this.method5887(null, 0, 0, (byte) 82, 5);
	}

	@OriginalMember(owner = "loader!vj", name = "a", descriptor = "(II)Lloader!ue;")
	private Class226 method5876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 3) {
			this.method5902(null, (byte) 91);
		}
		return this.method5887(null, arg0, 0, (byte) 91, 3);
	}

	@OriginalMember(owner = "loader!vj", name = "d", descriptor = "(I)Lloader!pg;")
	private Interface11 method5877(@OriginalArg(0) int arg0) {
		if (arg0 != -1) {
			aLong227 = -16L;
		}
		return this.anInterface11_1;
	}

	@OriginalMember(owner = "loader!vj", name = "b", descriptor = "(I)Lloader!ue;")
	private Class226 method5879(@OriginalArg(0) int arg0) {
		if (arg0 != -19491) {
			this.anEventQueue2 = null;
		}
		return this.method5887(null, 0, 0, (byte) 127, 18);
	}

	@OriginalMember(owner = "loader!vj", name = "a", descriptor = "(IZLjava/lang/String;)Lloader!ue;")
	private Class226 method5881(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2) {
		if (!arg1) {
			this.anInt6422 = -93;
		}
		return this.method5887(arg2, arg0, 0, (byte) 89, 1);
	}

	@OriginalMember(owner = "loader!vj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;[Ljava/lang/Class;)Lloader!ue;")
	private Class226 method5882(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class arg2, @OriginalArg(3) Class[] arg3) {
		if (arg1 != 9) {
			this.aClass227_1 = null;
		}
		return this.method5887(new Object[] { arg2, arg0, arg3 }, 0, 0, (byte) 122, 8);
	}

	@OriginalMember(owner = "loader!vj", name = "a", descriptor = "(ILjava/awt/Component;Z)Lloader!ue;")
	private Class226 method5884(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != 1) {
			aHashtable2 = null;
		}
		return this.method5887(arg1, arg2 ? 1 : 0, 0, (byte) 112, 15);
	}

	@OriginalMember(owner = "loader!vj", name = "c", descriptor = "(B)Lloader!ue;")
	private Class226 method5885(@OriginalArg(0) byte arg0) {
		if (arg0 <= 113) {
			aString316 = null;
		}
		return this.method5887(null, 0, 0, (byte) 80, 12);
	}

	@OriginalMember(owner = "loader!vj", name = "a", descriptor = "(IIBII)Lloader!ue;")
	private Class226 method5886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return arg2 > -1 ? (Class226) null : this.method5887(null, (arg3 << 16) + arg0, (arg1 << 16) - -arg4, (byte) 99, 6);
	}

	@OriginalMember(owner = "loader!vj", name = "a", descriptor = "(Ljava/lang/Object;IIBI)Lloader!ue;")
	private Class226 method5887(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class226 local3 = new Class226();
		local3.anInt6418 = arg4;
		local3.anInt6419 = arg2;
		local3.anObject10 = arg0;
		local3.anInt6417 = arg1;
		synchronized (this) {
			if (this.aClass226_3 == null) {
				this.aClass226_3 = this.aClass226_2 = local3;
			} else {
				this.aClass226_3.aClass226_1 = local3;
				this.aClass226_3 = local3;
			}
			if (arg3 < 78) {
				this.method5896(null);
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!vj", name = "b", descriptor = "(Ljava/lang/String;I)[B")
	private byte[] method5888(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class226 local7 = this.method5898(21, (byte) 63, arg1, 0, arg0);
		return (byte[]) local7.anObject9;
	}

	@OriginalMember(owner = "loader!vj", name = "b", descriptor = "(B)Lloader!ue;")
	private Class226 method5889(@OriginalArg(0) byte arg0) {
		return arg0 == -124 ? this.method5887(null, 0, 0, (byte) 122, 13) : (Class226) null;
	}

	@OriginalMember(owner = "loader!vj", name = "a", descriptor = "(Ljava/lang/String;I)Lloader!ue;")
	private Class226 method5890(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 96) {
			this.method5903(null, null, -47);
		}
		return this.method5887(arg0, 0, 0, (byte) 124, 21);
	}

	@OriginalMember(owner = "loader!vj", name = "a", descriptor = "(Ljava/lang/Runnable;ZI)Lloader!ue;")
	private Class226 method5891(@OriginalArg(0) Runnable arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		return arg1 ? this.method5887(arg0, arg2, 0, (byte) 106, 2) : (Class226) null;
	}

	@OriginalMember(owner = "loader!vj", name = "a", descriptor = "(ILjava/awt/Point;[IBILjava/awt/Component;)Lloader!ue;")
	private Class226 method5892(@OriginalArg(0) int arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Component arg5) {
		return arg3 == 48 ? this.method5887(new Object[] { arg5, arg2, arg1 }, arg0, arg4, (byte) 83, 17) : (Class226) null;
	}

	@OriginalMember(owner = "loader!vj", name = "a", descriptor = "(ZLjava/net/URL;)Lloader!ue;")
	private Class226 method5893(@OriginalArg(0) boolean arg0, @OriginalArg(1) URL arg1) {
		return arg0 ? this.method5887(arg1, 0, 0, (byte) 94, 4) : (Class226) null;
	}

	@OriginalMember(owner = "loader!vj", name = "a", descriptor = "(Ljava/lang/String;B)Lloader!ue;")
	private Class226 method5894(@OriginalArg(0) String arg0) {
		return this.method5887(arg0, 0, 0, (byte) 115, 16);
	}

	@OriginalMember(owner = "loader!vj", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lloader!ue;")
	private Class226 method5895(@OriginalArg(0) Transferable arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != 50) {
			this.aString319 = null;
		}
		return this.method5887(arg0, 0, 0, (byte) 99, 19);
	}

	@OriginalMember(owner = "loader!vj", name = "a", descriptor = "(BLjava/lang/Class;)Lloader!ue;")
	private Class226 method5896(@OriginalArg(1) Class arg0) {
		return this.method5887(arg0, 0, 0, (byte) 121, 11);
	}

	@OriginalMember(owner = "loader!vj", name = "a", descriptor = "(I)V")
	private void method5897(@OriginalArg(0) int arg0) {
		synchronized (this) {
			this.aBoolean437 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass227_2 != null) {
			try {
				this.aClass227_2.method5869();
			} catch (@Pc(31) IOException local31) {
			}
		}
		if (this.aClass227_1 != null) {
			try {
				this.aClass227_1.method5869();
			} catch (@Pc(40) IOException local40) {
			}
		}
		if (arg0 != -27103) {
			this.method5876(115, 43);
		}
		if (this.aClass227Array1 != null) {
			for (@Pc(54) int local54 = 0; local54 < this.aClass227Array1.length; local54++) {
				if (this.aClass227Array1[local54] != null) {
					try {
						this.aClass227Array1[local54].method5869();
					} catch (@Pc(76) IOException local76) {
					}
				}
			}
		}
		if (this.aClass227_3 != null) {
			try {
				this.aClass227_3.method5869();
			} catch (@Pc(89) IOException local89) {
			}
		}
	}

	@OriginalMember(owner = "loader!vj", name = "a", descriptor = "(IBIILjava/lang/Object;)Lloader!ue;")
	private Class226 method5898(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4) {
		@Pc(3) Class226 local3 = new Class226();
		synchronized (local3) {
			local3.anObject10 = arg4;
			if (arg1 < 52) {
				aString316 = null;
			}
			local3.anInt6419 = arg2;
			local3.anInt6418 = arg0;
			local3.anInt6417 = arg3;
			synchronized (this) {
				if (this.aClass226_3 == null) {
					this.aClass226_3 = this.aClass226_2 = local3;
				} else {
					this.aClass226_3.aClass226_1 = local3;
					this.aClass226_3 = local3;
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

	@OriginalMember(owner = "loader!vj", name = "a", descriptor = "(ILjava/awt/Frame;)Lloader!ue;")
	private Class226 method5899(@OriginalArg(0) int arg0, @OriginalArg(1) Frame arg1) {
		if (arg0 != 1) {
			this.anInterface11_1 = null;
		}
		return this.method5887(arg1, 0, 0, (byte) 86, 7);
	}

	@OriginalMember(owner = "loader!vj", name = "a", descriptor = "(Ljava/lang/Class;I)Lloader!ue;")
	private Class226 method5900(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method5881(-21, false, null);
		}
		return this.method5887(arg0, 0, 0, (byte) 125, 10);
	}

	@OriginalMember(owner = "loader!vj", name = "d", descriptor = "(B)Z")
	private boolean method5901(@OriginalArg(0) byte arg0) {
		if (arg0 != -78) {
			this.aClass227_1 = null;
		}
		return this.aClass224_1 != null;
	}

	@OriginalMember(owner = "loader!vj", name = "a", descriptor = "(Ljava/lang/Class;B)Lloader!ue;")
	private Class226 method5902(@OriginalArg(0) Class arg0, @OriginalArg(1) byte arg1) {
		return arg1 == -14 ? this.method5887(arg0, 0, 0, (byte) 88, 20) : (Class226) null;
	}

	@OriginalMember(owner = "loader!vj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lloader!ue;")
	private Class226 method5903(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) int arg2) {
		return arg2 >= -73 ? (Class226) null : this.method5887(new Object[] { arg1, arg0 }, 0, 0, (byte) 99, 9);
	}

	@OriginalMember(owner = "loader!vj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class226 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean437) {
						return;
					}
					if (this.aClass226_2 != null) {
						local15 = this.aClass226_2;
						this.aClass226_2 = this.aClass226_2.aClass226_1;
						if (this.aClass226_2 == null) {
							this.aClass226_3 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(31) InterruptedException local31) {
					}
				}
			}
			try {
				@Pc(43) int local43 = local15.anInt6418;
				if (local43 == 1) {
					if (Class225.method5865() < aLong227) {
						throw new IOException();
					}
					local15.anObject9 = new Socket(InetAddress.getByName((String) local15.anObject10), local15.anInt6417);
				} else if (local43 == 2) {
					@Pc(881) Thread local881 = new Thread((Runnable) local15.anObject10);
					local881.setDaemon(true);
					local881.start();
					local881.setPriority(local15.anInt6417);
					local15.anObject9 = local881;
				} else if (local43 == 4) {
					if (aLong227 > Class225.method5865()) {
						throw new IOException();
					}
					local15.anObject9 = new DataInputStream(((URL) local15.anObject10).openStream());
				} else {
					@Pc(112) Object[] local112;
					if (local43 == 8) {
						local112 = (Object[]) local15.anObject10;
						if (((Class) local112[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject9 = ((Class) local112[0]).getDeclaredMethod((String) local112[1], (Class[]) local112[2]);
					} else if (local43 == 9) {
						local112 = (Object[]) local15.anObject10;
						if (((Class) local112[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject9 = ((Class) local112[0]).getDeclaredField((String) local112[1]);
					} else if (local43 == 18) {
						@Pc(179) Clipboard local179 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject9 = local179.getContents(null);
					} else if (local43 == 19) {
						@Pc(194) Transferable local194 = (Transferable) local15.anObject10;
						@Pc(197) Clipboard local197 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local197.setContents(local194, null);
					} else {
						@Pc(255) String local255;
						if (local43 == 3) {
							if (Class225.method5865() < aLong227) {
								throw new IOException();
							}
							local255 = (local15.anInt6417 >> 24 & 0xFF) + "." + (local15.anInt6417 >> 16 & 0xFF) + "." + (local15.anInt6417 >> 8 & 0xFF) + "." + (local15.anInt6417 & 0xFF);
							local15.anObject9 = InetAddress.getByName(local255).getHostName();
						} else if (local43 == 21) {
							if (aLong227 > Class225.method5865()) {
								throw new IOException();
							}
							local15.anObject9 = InetAddress.getByName((String) local15.anObject10).getAddress();
						} else if (local43 == 5) {
							local15.anObject9 = this.aClass224_1.method5850();
						} else if (local43 == 6) {
							@Pc(829) Frame local829 = new Frame("Jagex Full Screen");
							local15.anObject9 = local829;
							local829.setResizable(false);
							this.aClass224_1.method5851(local15.anInt6419 & 0xFFFF, local15.anInt6417 >>> 16, local15.anInt6417 & 0xFFFF, local829, local15.anInt6419 >> 16);
						} else if (local43 == 7) {
							this.aClass224_1.method5848();
						} else {
							@Pc(447) Runtime local447;
							@Pc(453) Method local453;
							@Pc(445) Class[] local445;
							if (local43 == 10) {
								local445 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local447 = Runtime.getRuntime();
								if (!aString317.startsWith("mac")) {
									local453 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local445);
									local453.setAccessible(true);
									local453.invoke(local447, local15.anObject10, "jawt");
									local453.setAccessible(false);
								}
								local453 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local445);
								local453.setAccessible(true);
								if (aString317.startsWith("linux") || aString317.startsWith("sunos")) {
									local453.invoke(local447, local15.anObject10, this.method5873("libjaggl_dri.so").toString());
									@Pc(781) Class local781 = ((Class) local15.anObject10).getClassLoader().loadClass("jaggl.X11.dri");
									local781.getMethod("bind").invoke(null);
									local453.invoke(local447, local15.anObject10, this.method5873("libjaggl.so").toString());
									local781.getMethod("close").invoke(null);
								} else if (aString317.startsWith("mac")) {
									local453.invoke(local447, local15.anObject10, this.method5873("libjaggl.jnilib").toString());
								} else if (aString317.startsWith("win")) {
									local453.invoke(local447, local15.anObject10, this.method5873("jaggl.dll").toString());
								} else {
									throw new Exception();
								}
								local453.setAccessible(false);
							} else {
								@Pc(315) int local315;
								if (local43 == 11) {
									@Pc(302) Field local302 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local302.setAccessible(true);
									@Pc(313) Vector local313 = (Vector) local302.get(((Class) local15.anObject10).getClassLoader());
									for (local315 = 0; local313.size() > local315; local315++) {
										@Pc(323) Object local323 = local313.elementAt(local315);
										@Pc(330) Method local330 = local323.getClass().getDeclaredMethod("finalize");
										local330.setAccessible(true);
										local330.invoke(local323);
										local330.setAccessible(false);
										@Pc(347) Field local347 = local323.getClass().getDeclaredField("handle");
										local347.setAccessible(true);
										local347.set(local323, Integer.valueOf(0));
										local347.setAccessible(false);
									}
									local302.setAccessible(false);
								} else {
									@Pc(625) Class227 local625;
									if (local43 == 12) {
										local625 = method5878(this.aString319, this.anInt6422);
										local15.anObject9 = local625;
									} else if (local43 == 13) {
										local625 = method5880(this.aString319, this.anInt6422);
										local15.anObject9 = local625;
									} else if (local43 == 14) {
										@Pc(380) int local380 = local15.anInt6417;
										@Pc(383) int local383 = local15.anInt6419;
										this.aClass221_1.method5842(local380, local383);
									} else if (local43 == 15) {
										@Pc(405) boolean local405 = local15.anInt6417 != 0;
										@Pc(409) Component local409 = (Component) local15.anObject10;
										this.aClass221_1.method5840(local409, local405);
									} else if (local43 == 17) {
										local112 = (Object[]) local15.anObject10;
										this.aClass221_1.method5841((int[]) local112[1], (Component) local112[0], local15.anInt6419, (Point) local112[2], local15.anInt6417);
									} else if (local43 == 16) {
										try {
											if (!aString317.startsWith("win")) {
												throw new Exception();
											}
											local255 = (String) local15.anObject10;
											if (!local255.startsWith("http://") && !local255.startsWith("https://")) {
												throw new Exception();
											}
											@Pc(544) String local544 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
											for (local315 = 0; local315 < local255.length(); local315++) {
												if (local544.indexOf(local255.charAt(local315)) == -1) {
													throw new Exception();
												}
											}
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local255 + "\"");
											local15.anObject9 = null;
										} catch (@Pc(587) Exception local587) {
											local15.anObject9 = local587;
										}
									} else if (local43 == 20) {
										try {
											local445 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
											local447 = Runtime.getRuntime();
											local453 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local445);
											local453.setAccessible(true);
											if (aString317.startsWith("win")) {
												if (aString314.startsWith("amd64") || aString314.startsWith("x86_64")) {
													local453.invoke(local447, local15.anObject10, this.method5873("jagmisc64.dll").toString());
												} else {
													local453.invoke(local447, local15.anObject10, this.method5873("jagmisc.dll").toString());
												}
											}
											local453.setAccessible(false);
										} catch (@Pc(513) Throwable local513) {
											local15.anObject9 = local513;
										}
									} else {
										throw new Exception("");
									}
								}
							}
						}
					}
				}
				local15.anInt6420 = 1;
			} catch (@Pc(898) ThreadDeath local898) {
				throw local898;
			} catch (@Pc(901) Throwable local901) {
				local15.anInt6420 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}
}
