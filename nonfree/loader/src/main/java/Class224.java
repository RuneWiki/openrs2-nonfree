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

@OriginalClass("loader!nh")
public final class Class224 implements Runnable {

	@OriginalMember(owner = "loader!nh", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString74;

	@OriginalMember(owner = "loader!nh", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString75;

	@OriginalMember(owner = "loader!nh", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString76;

	@OriginalMember(owner = "loader!nh", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString77;

	@OriginalMember(owner = "loader!nh", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString79;

	@OriginalMember(owner = "loader!nh", name = "s", descriptor = "Ljava/lang/String;")
	private static String aString80;

	@OriginalMember(owner = "loader!nh", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString81;

	@OriginalMember(owner = "loader!nh", name = "u", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!nh", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!nh", name = "a", descriptor = "I")
	private static final int anInt6822 = 1;

	@OriginalMember(owner = "loader!nh", name = "h", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!nh", name = "t", descriptor = "J")
	private static volatile long aLong221 = 0L;

	@OriginalMember(owner = "loader!nh", name = "A", descriptor = "Lloader!fq;")
	private Interface11 anInterface11_1;

	@OriginalMember(owner = "loader!nh", name = "e", descriptor = "Lloader!ib;")
	private Class222 aClass222_1 = null;

	@OriginalMember(owner = "loader!nh", name = "k", descriptor = "Lloader!ib;")
	private Class222 aClass222_2 = null;

	@OriginalMember(owner = "loader!nh", name = "l", descriptor = "Lloader!ib;")
	private Class222 aClass222_3 = null;

	@OriginalMember(owner = "loader!nh", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!nh", name = "x", descriptor = "Lloader!ph;")
	private Class225 aClass225_1 = null;

	@OriginalMember(owner = "loader!nh", name = "r", descriptor = "Lloader!ph;")
	private Class225 aClass225_2 = null;

	@OriginalMember(owner = "loader!nh", name = "n", descriptor = "Z")
	private boolean aBoolean670 = false;

	@OriginalMember(owner = "loader!nh", name = "w", descriptor = "Ljava/lang/String;")
	private final String aString78;

	@OriginalMember(owner = "loader!nh", name = "q", descriptor = "I")
	private final int anInt6821;

	@OriginalMember(owner = "loader!nh", name = "p", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!nh", name = "m", descriptor = "[Lloader!ib;")
	private final Class222[] aClass222Array1;

	@OriginalMember(owner = "loader!nh", name = "i", descriptor = "Lloader!a;")
	private Class218 aClass218_1;

	@OriginalMember(owner = "loader!nh", name = "y", descriptor = "Lloader!c;")
	private Class219 aClass219_1;

	@OriginalMember(owner = "loader!nh", name = "z", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "loader!nh", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
	private static File method5743(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg1);
		if (local4 != null) {
			return local4;
		}
		@Pc(45) String[] local45 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString75, "/tmp/", "" };
		@Pc(70) String[] local70 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(72) int local72 = 0; local72 < 2; local72++) {
			for (@Pc(85) int local85 = 0; local85 < local70.length; local85++) {
				for (@Pc(91) int local91 = 0; local91 < local45.length; local91++) {
					@Pc(125) String local125 = local45[local91] + local70[local85] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(127) RandomAccessFile local127 = null;
					try {
						@Pc(132) File local132 = new File(local125);
						if (local72 != 0 || local132.exists()) {
							@Pc(145) String local145 = local45[local91];
							if (local72 != 1 || local145.length() <= 0 || (new File(local145)).exists()) {
								(new File(local45[local91] + local70[local85])).mkdir();
								if (arg0 != null) {
									(new File(local45[local91] + local70[local85] + "/" + arg0)).mkdir();
								}
								local127 = new RandomAccessFile(local132, "rw");
								@Pc(210) int local210 = local127.read();
								local127.seek(0L);
								local127.write(local210);
								local127.seek(0L);
								local127.close();
								aHashtable2.put(arg1, local132);
								return local132;
							}
						}
					} catch (@Pc(229) Exception local229) {
						try {
							if (local127 != null) {
								local127.close();
							}
						} catch (@Pc(237) Exception local237) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!nh", name = "a", descriptor = "(ILjava/lang/String;Z)Lloader!ib;")
	private static Class222 method5745(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(18) String local18;
		if (arg0 == 33) {
			local18 = "jagex_" + arg1 + "_preferences_rc.dat";
		} else if (arg0 == 34) {
			local18 = "jagex_" + arg1 + "_preferences_wip.dat";
		} else {
			local18 = "jagex_" + arg1 + "_preferences.dat";
		}
		@Pc(82) String[] local82 = new String[] { "c:/rscache/", "/rscache/", aString75, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(84) int local84 = 0; local84 < local82.length; local84++) {
			@Pc(96) String local96 = local82[local84];
			if (local96.length() <= 0 || (new File(local96)).exists()) {
				try {
					return new Class222(new File(local96, local18), "rw", 10000L);
				} catch (@Pc(123) Exception local123) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!nh", name = "a", descriptor = "(IILjava/lang/String;)Lloader!ib;")
	private static Class222 method5747(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(26) String local26;
		if (arg0 == 33) {
			local26 = "jagex_" + arg1 + "_preferences2_rc.dat";
		} else if (arg0 == 34) {
			local26 = "jagex_" + arg1 + "_preferences2_wip.dat";
		} else {
			local26 = "jagex_" + arg1 + "_preferences2.dat";
		}
		@Pc(90) String[] local90 = new String[] { "c:/rscache/", "/rscache/", aString75, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(92) int local92 = 0; local92 < local90.length; local92++) {
			@Pc(100) String local100 = local90[local92];
			if (local100.length() <= 0 || (new File(local100)).exists()) {
				try {
					return new Class222(new File(local100, local26), "rw", 10000L);
				} catch (@Pc(127) Exception local127) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!nh", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class224(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anApplet3 = arg0;
		aString79 = "Unknown";
		this.aString78 = arg2;
		this.anInt6821 = arg1;
		aString74 = "1.1";
		try {
			aString79 = System.getProperty("java.vendor");
			aString74 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString77 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString77 = "Unknown";
		}
		aString76 = aString77.toLowerCase();
		try {
			aString81 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString81 = "";
		}
		try {
			aString80 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString80 = "";
		}
		try {
			aString75 = System.getProperty("user.home");
			if (aString75 != null) {
				aString75 = aString75 + "/";
			}
		} catch (@Pc(87) Exception local87) {
		}
		if (aString75 == null) {
			aString75 = "~/";
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
		this.aClass222_1 = new Class222(method5743(null, "random.dat", this.anInt6821), "rw", 25L);
		this.aClass222_3 = new Class222(this.method5754("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass222_2 = new Class222(this.method5754("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass222Array1 = new Class222[arg3];
		for (@Pc(194) int local194 = 0; local194 < arg3; local194++) {
			this.aClass222Array1[local194] = new Class222(this.method5754("main_file_cache.idx" + local194), "rw", 1048576L);
		}
		try {
			this.aClass218_1 = new Class218();
		} catch (@Pc(230) Throwable local230) {
		}
		try {
			this.aClass219_1 = new Class219();
		} catch (@Pc(237) Throwable local237) {
		}
		@Pc(240) ThreadGroup local240 = Thread.currentThread().getThreadGroup();
		for (@Pc(243) ThreadGroup local243 = local240.getParent(); local243 != null; local243 = local243.getParent()) {
			local240 = local243;
		}
		@Pc(255) Thread[] local255 = new Thread[1000];
		local240.enumerate(local255);
		for (@Pc(261) int local261 = 0; local261 < local255.length; local261++) {
			if (local255[local261] != null && local255[local261].getName().startsWith("AWT")) {
				local255[local261].setPriority(1);
			}
		}
		this.aBoolean670 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!nh", name = "a", descriptor = "(ZLjava/lang/Class;Ljava/lang/String;)Lloader!ph;")
	private Class225 method5726(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) String arg2) {
		if (!arg0) {
			aString81 = null;
		}
		return this.method5727(0, -64, new Object[] { arg1, arg2 }, 9, 0);
	}

	@OriginalMember(owner = "loader!nh", name = "a", descriptor = "(IILjava/lang/Object;II)Lloader!ph;")
	private Class225 method5727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class225 local3 = new Class225();
		local3.anObject8 = arg2;
		local3.anInt6826 = arg3;
		local3.anInt6823 = arg4;
		local3.anInt6824 = arg0;
		synchronized (this) {
			if (this.aClass225_2 == null) {
				this.aClass225_2 = this.aClass225_1 = local3;
			} else {
				this.aClass225_2.aClass225_3 = local3;
				this.aClass225_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!nh", name = "a", descriptor = "(ILjava/awt/Point;II[ILjava/awt/Component;)Lloader!ph;")
	private Class225 method5728(@OriginalArg(0) int arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) Component arg5) {
		return arg3 == 0 ? this.method5727(arg0, 119, new Object[] { arg5, arg4, arg1 }, 17, arg2) : (Class225) null;
	}

	@OriginalMember(owner = "loader!nh", name = "b", descriptor = "(Z)Lloader!ph;")
	private Class225 method5729(@OriginalArg(0) boolean arg0) {
		return arg0 ? (Class225) null : this.method5727(0, -70, null, 18, 0);
	}

	@OriginalMember(owner = "loader!nh", name = "d", descriptor = "(I)Lloader!ph;")
	private Class225 method5730(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? this.method5727(0, -48, null, 12, 0) : (Class225) null;
	}

	@OriginalMember(owner = "loader!nh", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;I)Lloader!ph;")
	private Class225 method5731(@OriginalArg(0) Class arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		if (arg3 != 10) {
			this.method5744(false);
		}
		return this.method5727(0, 108, new Object[] { arg0, arg2, arg1 }, 8, 0);
	}

	@OriginalMember(owner = "loader!nh", name = "b", descriptor = "(I)Lloader!ph;")
	private Class225 method5732(@OriginalArg(0) int arg0) {
		if (arg0 != 21) {
			aLong221 = -10L;
		}
		return this.method5727(0, -24, null, 5, 0);
	}

	@OriginalMember(owner = "loader!nh", name = "e", descriptor = "(I)Lloader!fq;")
	private Interface11 method5733(@OriginalArg(0) int arg0) {
		if (arg0 >= -59) {
			this.method5737(-124);
		}
		return this.anInterface11_1;
	}

	@OriginalMember(owner = "loader!nh", name = "b", descriptor = "(Ljava/lang/String;B)Lloader!ph;")
	private Class225 method5734(@OriginalArg(0) String arg0) {
		return this.method5727(0, 127, arg0, 16, 0);
	}

	@OriginalMember(owner = "loader!nh", name = "a", descriptor = "(IZLjava/lang/String;)Lloader!ph;")
	private Class225 method5735(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2) {
		if (arg1) {
			aMethod3 = null;
		}
		return this.method5727(0, 110, arg2, 1, arg0);
	}

	@OriginalMember(owner = "loader!nh", name = "b", descriptor = "(ILjava/lang/Class;)Lloader!ph;")
	private Class225 method5736(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) {
		return arg0 < 76 ? (Class225) null : this.method5727(0, -47, arg1, 20, 0);
	}

	@OriginalMember(owner = "loader!nh", name = "c", descriptor = "(I)V")
	private void method5737(@OriginalArg(0) int arg0) {
		if (arg0 != 18220) {
			aString76 = null;
		}
		aLong221 = Class223.method5719() + 5000L;
	}

	@OriginalMember(owner = "loader!nh", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lloader!ph;")
	private Class225 method5738(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1, @OriginalArg(2) int arg2) {
		if (arg0 != 0) {
			this.aClass225_2 = null;
		}
		return this.method5727(0, arg0 - 77, arg1, 2, arg2);
	}

	@OriginalMember(owner = "loader!nh", name = "a", descriptor = "(ZBLjava/awt/Component;)Lloader!ph;")
	private Class225 method5739(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Component arg2) {
		if (arg1 > -125) {
			aString74 = null;
		}
		return this.method5727(0, 117, arg2, 15, arg0 ? 1 : 0);
	}

	@OriginalMember(owner = "loader!nh", name = "a", descriptor = "(I)Lloader!ph;")
	private Class225 method5740(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? this.method5727(0, -46, null, 13, 0) : (Class225) null;
	}

	@OriginalMember(owner = "loader!nh", name = "a", descriptor = "(Ljava/lang/String;I)Lloader!ph;")
	private Class225 method5741(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.anInterface11_1 = null;
		}
		return this.method5727(0, arg1 + 100, arg0, 21, 0);
	}

	@OriginalMember(owner = "loader!nh", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lloader!ph;")
	private Class225 method5742(@OriginalArg(0) Transferable arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method5740(-93);
		}
		return this.method5727(0, 109, arg0, 19, 0);
	}

	@OriginalMember(owner = "loader!nh", name = "a", descriptor = "(Z)Z")
	private boolean method5744(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method5734(null);
		}
		return this.aClass218_1 != null;
	}

	@OriginalMember(owner = "loader!nh", name = "a", descriptor = "(II)Lloader!ph;")
	private Class225 method5746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			aString75 = null;
		}
		return this.method5727(0, -117, null, 3, arg0);
	}

	@OriginalMember(owner = "loader!nh", name = "a", descriptor = "(ZILjava/lang/Object;II)Lloader!ph;")
	private Class225 method5748(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class225 local3 = new Class225();
		synchronized (local3) {
			local3.anObject8 = arg2;
			local3.anInt6824 = arg4;
			local3.anInt6826 = arg1;
			local3.anInt6823 = arg3;
			synchronized (this) {
				if (this.aClass225_2 == null) {
					this.aClass225_2 = this.aClass225_1 = local3;
				} else {
					this.aClass225_2.aClass225_3 = local3;
					this.aClass225_2 = local3;
				}
				if (arg0) {
					this.aClass225_1 = null;
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

	@OriginalMember(owner = "loader!nh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class225 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean670) {
						return;
					}
					if (this.aClass225_1 != null) {
						local16 = this.aClass225_1;
						this.aClass225_1 = this.aClass225_1.aClass225_3;
						if (this.aClass225_1 == null) {
							this.aClass225_2 = null;
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
				@Pc(45) int local45 = local16.anInt6826;
				if (local45 == 1) {
					if (Class223.method5719() < aLong221) {
						throw new IOException();
					}
					local16.anObject9 = new Socket(InetAddress.getByName((String) local16.anObject8), local16.anInt6823);
				} else if (local45 == 2) {
					@Pc(62) Thread local62 = new Thread((Runnable) local16.anObject8);
					local62.setDaemon(true);
					local62.start();
					local62.setPriority(local16.anInt6823);
					local16.anObject9 = local62;
				} else if (local45 == 4) {
					if (Class223.method5719() < aLong221) {
						throw new IOException();
					}
					local16.anObject9 = new DataInputStream(((URL) local16.anObject8).openStream());
				} else {
					@Pc(108) Object[] local108;
					if (local45 == 8) {
						local108 = (Object[]) local16.anObject8;
						if (((Class) local108[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject9 = ((Class) local108[0]).getDeclaredMethod((String) local108[1], (Class[]) local108[2]);
					} else if (local45 == 9) {
						local108 = (Object[]) local16.anObject8;
						if (((Class) local108[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject9 = ((Class) local108[0]).getDeclaredField((String) local108[1]);
					} else if (local45 == 18) {
						@Pc(139) Clipboard local139 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.anObject9 = local139.getContents(null);
					} else if (local45 == 19) {
						@Pc(827) Transferable local827 = (Transferable) local16.anObject8;
						@Pc(830) Clipboard local830 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local830.setContents(local827, null);
					} else {
						@Pc(197) String local197;
						if (local45 == 3) {
							if (Class223.method5719() < aLong221) {
								throw new IOException();
							}
							local197 = (local16.anInt6823 >> 24 & 0xFF) + "." + (local16.anInt6823 >> 16 & 0xFF) + "." + (local16.anInt6823 >> 8 & 0xFF) + "." + (local16.anInt6823 & 0xFF);
							local16.anObject9 = InetAddress.getByName(local197).getHostName();
						} else if (local45 == 21) {
							if (aLong221 > Class223.method5719()) {
								throw new IOException();
							}
							local16.anObject9 = InetAddress.getByName((String) local16.anObject8).getAddress();
						} else if (local45 == 5) {
							local16.anObject9 = this.aClass218_1.method5693();
						} else if (local45 == 6) {
							@Pc(242) Frame local242 = new Frame("Jagex Full Screen");
							local16.anObject9 = local242;
							local242.setResizable(false);
							this.aClass218_1.method5690(local242, local16.anInt6824 & 0xFFFF, local16.anInt6823 >>> 16, local16.anInt6823 & 0xFFFF, local16.anInt6824 >> 16);
						} else if (local45 == 7) {
							this.aClass218_1.method5692();
						} else {
							@Pc(433) Method local433;
							@Pc(425) Class[] local425;
							@Pc(427) Runtime local427;
							if (local45 == 10) {
								local425 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local427 = Runtime.getRuntime();
								if (!aString76.startsWith("mac")) {
									local433 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local425);
									local433.setAccessible(true);
									local433.invoke(local427, local16.anObject8, "jawt");
									local433.setAccessible(false);
								}
								local433 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local425);
								local433.setAccessible(true);
								if (aString76.startsWith("linux") || aString76.startsWith("sunos")) {
									local433.invoke(local427, local16.anObject8, this.method5754("libjaggl_dri.so").toString());
									@Pc(716) Class local716 = ((Class) local16.anObject8).getClassLoader().loadClass("jaggl.X11.dri");
									local716.getMethod("bind").invoke(null);
									local433.invoke(local427, local16.anObject8, this.method5754("libjaggl.so").toString());
									local716.getMethod("close").invoke(null);
								} else if (aString76.startsWith("mac")) {
									local433.invoke(local427, local16.anObject8, this.method5754("libjaggl.jnilib").toString());
								} else if (aString76.startsWith("win")) {
									local433.invoke(local427, local16.anObject8, this.method5754("jaggl.dll").toString());
								} else {
									throw new Exception();
								}
								local433.setAccessible(false);
							} else {
								@Pc(358) int local358;
								if (local45 == 11) {
									@Pc(558) Field local558 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local558.setAccessible(true);
									@Pc(569) Vector local569 = (Vector) local558.get(((Class) local16.anObject8).getClassLoader());
									for (local358 = 0; local358 < local569.size(); local358++) {
										@Pc(583) Object local583 = local569.elementAt(local358);
										@Pc(590) Method local590 = local583.getClass().getDeclaredMethod("finalize");
										local590.setAccessible(true);
										local590.invoke(local583);
										local590.setAccessible(false);
										@Pc(607) Field local607 = local583.getClass().getDeclaredField("handle");
										local607.setAccessible(true);
										local607.set(local583, Integer.valueOf(0));
										local607.setAccessible(false);
									}
									local558.setAccessible(false);
								} else {
									@Pc(294) Class222 local294;
									if (local45 == 12) {
										local294 = method5745(this.anInt6821, this.aString78);
										local16.anObject9 = local294;
									} else if (local45 == 13) {
										local294 = method5747(this.anInt6821, this.aString78);
										local16.anObject9 = local294;
									} else if (local45 == 14) {
										@Pc(306) int local306 = local16.anInt6823;
										@Pc(309) int local309 = local16.anInt6824;
										this.aClass219_1.method5697(local309, local306);
									} else if (local45 == 15) {
										@Pc(531) boolean local531 = local16.anInt6823 != 0;
										@Pc(535) Component local535 = (Component) local16.anObject8;
										this.aClass219_1.method5696(local535, local531);
									} else if (local45 == 17) {
										local108 = (Object[]) local16.anObject8;
										this.aClass219_1.method5695((int[]) local108[1], (Point) local108[2], local16.anInt6824, local16.anInt6823, (Component) local108[0]);
									} else if (local45 == 16) {
										try {
											if (!aString76.startsWith("win")) {
												throw new Exception();
											}
											local197 = (String) local16.anObject8;
											if (!local197.startsWith("http://") && !local197.startsWith("https://")) {
												throw new Exception();
											}
											@Pc(356) String local356 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
											for (local358 = 0; local358 < local197.length(); local358++) {
												if (local356.indexOf(local197.charAt(local358)) == -1) {
													throw new Exception();
												}
											}
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local197 + "\"");
											local16.anObject9 = null;
										} catch (@Pc(398) Exception local398) {
											local16.anObject9 = local398;
										}
									} else if (local45 == 20) {
										try {
											local425 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
											local427 = Runtime.getRuntime();
											local433 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local425);
											local433.setAccessible(true);
											if (aString76.startsWith("win")) {
												if (aString81.startsWith("amd64") || aString81.startsWith("x86_64")) {
													local433.invoke(local427, local16.anObject8, this.method5754("jagmisc64.dll").toString());
												} else {
													local433.invoke(local427, local16.anObject8, this.method5754("jagmisc.dll").toString());
												}
											}
											local433.setAccessible(false);
										} catch (@Pc(493) Throwable local493) {
											local16.anObject9 = local493;
										}
									} else {
										throw new Exception("");
									}
								}
							}
						}
					}
				}
				local16.anInt6825 = 1;
			} catch (@Pc(894) ThreadDeath local894) {
				throw local894;
			} catch (@Pc(897) Throwable local897) {
				local16.anInt6825 = 2;
			}
			synchronized (local16) {
				local16.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!nh", name = "a", descriptor = "(IIIII)Lloader!ph;")
	private Class225 method5749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.method5727(arg1 + (arg3 << 16), -39, null, 6, arg0 + (arg2 << 16));
	}

	@OriginalMember(owner = "loader!nh", name = "a", descriptor = "(B)V")
	private void method5750(@OriginalArg(0) byte arg0) {
		synchronized (this) {
			this.aBoolean670 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass222_3 != null) {
			try {
				this.aClass222_3.method5717();
			} catch (@Pc(30) IOException local30) {
			}
		}
		if (this.aClass222_2 != null) {
			try {
				this.aClass222_2.method5717();
			} catch (@Pc(39) IOException local39) {
			}
		}
		if (arg0 < 53) {
			this.aThread4 = null;
		}
		if (this.aClass222Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass222Array1.length; local52++) {
				if (this.aClass222Array1[local52] != null) {
					try {
						this.aClass222Array1[local52].method5717();
					} catch (@Pc(74) IOException local74) {
					}
				}
			}
		}
		if (this.aClass222_1 != null) {
			try {
				this.aClass222_1.method5717();
			} catch (@Pc(86) IOException local86) {
			}
		}
	}

	@OriginalMember(owner = "loader!nh", name = "a", descriptor = "(ILjava/lang/Class;)Lloader!ph;")
	private Class225 method5751(@OriginalArg(1) Class arg0) {
		return this.method5727(0, 95, arg0, 10, 0);
	}

	@OriginalMember(owner = "loader!nh", name = "a", descriptor = "(BLjava/net/URL;)Lloader!ph;")
	private Class225 method5752(@OriginalArg(0) byte arg0, @OriginalArg(1) URL arg1) {
		if (arg0 != -53) {
			method5747(-110, null);
		}
		return this.method5727(0, -105, arg1, 4, 0);
	}

	@OriginalMember(owner = "loader!nh", name = "a", descriptor = "(Ljava/lang/Class;Z)Lloader!ph;")
	private Class225 method5753(@OriginalArg(0) Class arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			this.method5742(null, -109);
		}
		return this.method5727(0, -127, arg0, 11, 0);
	}

	@OriginalMember(owner = "loader!nh", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/io/File;")
	public File method5754(@OriginalArg(1) String arg0) {
		return method5743(this.aString78, arg0, this.anInt6821);
	}

	@OriginalMember(owner = "loader!nh", name = "a", descriptor = "(BLjava/awt/Component;II)Lloader!ph;")
	private Class225 method5755(@OriginalArg(0) byte arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 96) {
			this.aThread4 = null;
		}
		@Pc(9) Point local9 = arg1.getLocationOnScreen();
		return this.method5727(arg3 + local9.y, 105, null, 14, arg2 + local9.x);
	}

	@OriginalMember(owner = "loader!nh", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	private byte[] method5756(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) Class225 local7 = this.method5748(false, 21, arg0, 0, 0);
		if (arg1 > -65) {
			aString74 = null;
		}
		return (byte[]) local7.anObject9;
	}

	@OriginalMember(owner = "loader!nh", name = "a", descriptor = "(ZLjava/awt/Frame;)Lloader!ph;")
	private Class225 method5757(@OriginalArg(0) boolean arg0, @OriginalArg(1) Frame arg1) {
		return arg0 ? this.method5727(0, 103, arg1, 7, 0) : (Class225) null;
	}
}
