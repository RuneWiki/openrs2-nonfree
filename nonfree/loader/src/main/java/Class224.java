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

@OriginalClass("loader!ko")
public final class Class224 implements Runnable {

	@OriginalMember(owner = "loader!ko", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString69;

	@OriginalMember(owner = "loader!ko", name = "s", descriptor = "Ljava/lang/String;")
	private static String aString70;

	@OriginalMember(owner = "loader!ko", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString71;

	@OriginalMember(owner = "loader!ko", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString73;

	@OriginalMember(owner = "loader!ko", name = "z", descriptor = "Ljava/lang/String;")
	private static String aString74;

	@OriginalMember(owner = "loader!ko", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString75;

	@OriginalMember(owner = "loader!ko", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString76;

	@OriginalMember(owner = "loader!ko", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!ko", name = "u", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!ko", name = "e", descriptor = "I")
	private static final int anInt6794 = 1;

	@OriginalMember(owner = "loader!ko", name = "A", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!ko", name = "v", descriptor = "J")
	private static volatile long aLong218 = 0L;

	@OriginalMember(owner = "loader!ko", name = "c", descriptor = "Lloader!jq;")
	private Interface11 anInterface11_1;

	@OriginalMember(owner = "loader!ko", name = "n", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!ko", name = "r", descriptor = "Z")
	private boolean aBoolean429 = false;

	@OriginalMember(owner = "loader!ko", name = "b", descriptor = "Lloader!jp;")
	private Class223 aClass223_2 = null;

	@OriginalMember(owner = "loader!ko", name = "h", descriptor = "Lloader!aa;")
	private Class218 aClass218_2 = null;

	@OriginalMember(owner = "loader!ko", name = "m", descriptor = "Lloader!aa;")
	private Class218 aClass218_3 = null;

	@OriginalMember(owner = "loader!ko", name = "j", descriptor = "Lloader!jp;")
	private Class223 aClass223_1 = null;

	@OriginalMember(owner = "loader!ko", name = "q", descriptor = "Lloader!jp;")
	private Class223 aClass223_3 = null;

	@OriginalMember(owner = "loader!ko", name = "y", descriptor = "Ljava/lang/String;")
	private String aString72;

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "I")
	private int anInt6793;

	@OriginalMember(owner = "loader!ko", name = "d", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!ko", name = "k", descriptor = "[Lloader!jp;")
	private final Class223[] aClass223Array1;

	@OriginalMember(owner = "loader!ko", name = "l", descriptor = "Lloader!b;")
	private Class219 aClass219_1;

	@OriginalMember(owner = "loader!ko", name = "w", descriptor = "Lloader!c;")
	private Class220 aClass220_1;

	@OriginalMember(owner = "loader!ko", name = "x", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(Ljava/lang/String;II)Lloader!jp;")
	private static Class223 method5763(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(19) String local19;
		if (arg1 == 33) {
			local19 = "jagex_" + arg0 + "_preferences2_rc.dat";
		} else if (arg1 == 34) {
			local19 = "jagex_" + arg0 + "_preferences2_wip.dat";
		} else {
			local19 = "jagex_" + arg0 + "_preferences2.dat";
		}
		@Pc(81) String[] local81 = new String[] { "c:/rscache/", "/rscache/", aString74, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(83) int local83 = 0; local83 < local81.length; local83++) {
			@Pc(95) String local95 = local81[local83];
			if (local95.length() <= 0 || (new File(local95)).exists()) {
				try {
					return new Class223(new File(local95, local19), "rw", 10000L);
				} catch (@Pc(118) Exception local118) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(ILjava/lang/String;B)Lloader!jp;")
	private static Class223 method5772(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(18) String local18;
		if (arg0 == 33) {
			local18 = "jagex_" + arg1 + "_preferences_rc.dat";
		} else if (arg0 == 34) {
			local18 = "jagex_" + arg1 + "_preferences_wip.dat";
		} else {
			local18 = "jagex_" + arg1 + "_preferences.dat";
		}
		@Pc(77) String[] local77 = new String[] { "c:/rscache/", "/rscache/", aString74, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(87) int local87 = 0; local87 < local77.length; local87++) {
			@Pc(99) String local99 = local77[local87];
			if (local99.length() <= 0 || (new File(local99)).exists()) {
				try {
					return new Class223(new File(local99, local18), "rw", 10000L);
				} catch (@Pc(126) Exception local126) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
	private static File method5787(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg0);
		if (local4 != null) {
			return local4;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString74, "/tmp/", "" };
		@Pc(68) String[] local68 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(70) int local70 = 0; local70 < 2; local70++) {
			for (@Pc(75) int local75 = 0; local75 < local68.length; local75++) {
				for (@Pc(85) int local85 = 0; local85 < local43.length; local85++) {
					@Pc(119) String local119 = local43[local85] + local68[local75] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(121) RandomAccessFile local121 = null;
					try {
						@Pc(126) File local126 = new File(local119);
						if (local70 != 0 || local126.exists()) {
							@Pc(137) String local137 = local43[local85];
							if (local70 != 1 || local137.length() <= 0 || (new File(local137)).exists()) {
								(new File(local43[local85] + local68[local75])).mkdir();
								if (arg1 != null) {
									(new File(local43[local85] + local68[local75] + "/" + arg1)).mkdir();
								}
								local121 = new RandomAccessFile(local126, "rw");
								@Pc(203) int local203 = local121.read();
								local121.seek(0L);
								local121.write(local203);
								local121.seek(0L);
								local121.close();
								aHashtable2.put(arg0, local126);
								return local126;
							}
						}
					} catch (@Pc(222) Exception local222) {
						try {
							if (local121 != null) {
								local121.close();
							}
						} catch (@Pc(231) Exception local231) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!ko", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class224(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anApplet2 = arg0;
		aString76 = "1.1";
		aString71 = "Unknown";
		this.aString72 = arg2;
		this.anInt6793 = arg1;
		try {
			aString71 = System.getProperty("java.vendor");
			aString76 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString73 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString73 = "Unknown";
		}
		aString70 = aString73.toLowerCase();
		try {
			aString75 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString75 = "";
		}
		try {
			aString69 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString69 = "";
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
		this.aClass223_3 = new Class223(method5787("random.dat", null, this.anInt6793), "rw", 25L);
		this.aClass223_1 = new Class223(this.method5767("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass223_2 = new Class223(this.method5767("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass223Array1 = new Class223[arg3];
		for (@Pc(193) int local193 = 0; local193 < arg3; local193++) {
			this.aClass223Array1[local193] = new Class223(this.method5767("main_file_cache.idx" + local193), "rw", 1048576L);
		}
		try {
			this.aClass219_1 = new Class219();
		} catch (@Pc(225) Throwable local225) {
		}
		try {
			this.aClass220_1 = new Class220();
		} catch (@Pc(232) Throwable local232) {
		}
		@Pc(235) ThreadGroup local235 = Thread.currentThread().getThreadGroup();
		for (@Pc(238) ThreadGroup local238 = local235.getParent(); local238 != null; local238 = local238.getParent()) {
			local235 = local238;
		}
		@Pc(249) Thread[] local249 = new Thread[1000];
		local235.enumerate(local249);
		for (@Pc(255) int local255 = 0; local255 < local249.length; local255++) {
			if (local249[local255] != null && local249[local255].getName().startsWith("AWT")) {
				local249[local255].setPriority(1);
			}
		}
		this.aBoolean429 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(ILjava/lang/Object;IIB)Lloader!aa;")
	private Class218 method5762(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		@Pc(3) Class218 local3 = new Class218();
		synchronized (local3) {
			local3.anInt6787 = arg2;
			if (arg4 <= 117) {
				this.aClass223_2 = null;
			}
			local3.anInt6786 = arg3;
			local3.anInt6788 = arg0;
			local3.anObject9 = arg1;
			synchronized (this) {
				if (this.aClass218_3 == null) {
					this.aClass218_3 = this.aClass218_2 = local3;
				} else {
					this.aClass218_3.aClass218_1 = local3;
					this.aClass218_3 = local3;
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

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(ZLjava/lang/Class;)Lloader!aa;")
	private Class218 method5764(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class arg1) {
		if (arg0) {
			this.method5773(null, -54, -16, 13, -26);
		}
		return this.method5773(arg1, -22549, 10, 0, 0);
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lloader!aa;")
	private Class218 method5765(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class arg2) {
		if (arg1 != 1) {
			aString75 = null;
		}
		return this.method5773(new Object[] { arg2, arg0 }, -22549, 9, 0, 0);
	}

	@OriginalMember(owner = "loader!ko", name = "e", descriptor = "(I)Lloader!jq;")
	private Interface11 method5766(@OriginalArg(0) int arg0) {
		if (arg0 != 13) {
			this.method5771(true);
		}
		return this.anInterface11_1;
	}

	@OriginalMember(owner = "loader!ko", name = "b", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public File method5767(@OriginalArg(1) String arg0) {
		return method5787(arg0, this.aString72, this.anInt6793);
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(II)Lloader!aa;")
	private Class218 method5768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= -7) {
			this.method5791(-38, null);
		}
		return this.method5773(null, -22549, 3, 0, arg0);
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(B)Lloader!aa;")
	private Class218 method5769() {
		return this.method5773(null, -22549, 18, 0, 0);
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(Ljava/awt/Component;[IILjava/awt/Point;ZI)Lloader!aa;")
	private Class218 method5770(@OriginalArg(0) Component arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Point arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (!arg4) {
			this.aThread4 = null;
		}
		return this.method5773(new Object[] { arg0, arg1, arg3 }, -22549, 17, arg5, arg2);
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(Z)Lloader!aa;")
	private Class218 method5771(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.aString72 = null;
		}
		return this.method5773(null, -22549, 5, 0, 0);
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lloader!aa;")
	private Class218 method5773(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 != -22549) {
			this.method5773(null, -2, 42, 110, 25);
		}
		@Pc(15) Class218 local15 = new Class218();
		local15.anObject9 = arg0;
		local15.anInt6787 = arg3;
		local15.anInt6788 = arg2;
		local15.anInt6786 = arg4;
		synchronized (this) {
			if (this.aClass218_3 == null) {
				this.aClass218_3 = this.aClass218_2 = local15;
			} else {
				this.aClass218_3.aClass218_1 = local15;
				this.aClass218_3 = local15;
			}
			this.notify();
			return local15;
		}
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(Ljava/net/URL;B)Lloader!aa;")
	private Class218 method5774(@OriginalArg(0) URL arg0) {
		return this.method5773(arg0, -22549, 4, 0, 0);
	}

	@OriginalMember(owner = "loader!ko", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class218 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean429) {
						return;
					}
					if (this.aClass218_2 != null) {
						local17 = this.aClass218_2;
						this.aClass218_2 = this.aClass218_2.aClass218_1;
						if (this.aClass218_2 == null) {
							this.aClass218_3 = null;
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
				@Pc(45) int local45 = local17.anInt6788;
				if (local45 == 1) {
					if (Class225.method5800() < aLong218) {
						throw new IOException();
					}
					local17.anObject8 = new Socket(InetAddress.getByName((String) local17.anObject9), local17.anInt6786);
				} else if (local45 == 2) {
					@Pc(853) Thread local853 = new Thread((Runnable) local17.anObject9);
					local853.setDaemon(true);
					local853.start();
					local853.setPriority(local17.anInt6786);
					local17.anObject8 = local853;
				} else if (local45 == 4) {
					if (aLong218 > Class225.method5800()) {
						throw new IOException();
					}
					local17.anObject8 = new DataInputStream(((URL) local17.anObject9).openStream());
				} else {
					@Pc(88) Object[] local88;
					if (local45 == 8) {
						local88 = (Object[]) local17.anObject9;
						if (((Class) local88[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject8 = ((Class) local88[0]).getDeclaredMethod((String) local88[1], (Class[]) local88[2]);
					} else if (local45 == 9) {
						local88 = (Object[]) local17.anObject9;
						if (((Class) local88[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject8 = ((Class) local88[0]).getDeclaredField((String) local88[1]);
					} else if (local45 == 18) {
						@Pc(807) Clipboard local807 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local17.anObject8 = local807.getContents(null);
					} else if (local45 == 19) {
						@Pc(796) Transferable local796 = (Transferable) local17.anObject9;
						@Pc(799) Clipboard local799 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local799.setContents(local796, null);
					} else {
						@Pc(175) String local175;
						if (local45 == 3) {
							if (Class225.method5800() < aLong218) {
								throw new IOException();
							}
							local175 = (local17.anInt6786 >> 24 & 0xFF) + "." + (local17.anInt6786 >> 16 & 0xFF) + "." + (local17.anInt6786 >> 8 & 0xFF) + "." + (local17.anInt6786 & 0xFF);
							local17.anObject8 = InetAddress.getByName(local175).getHostName();
						} else if (local45 == 21) {
							if (Class225.method5800() < aLong218) {
								throw new IOException();
							}
							local17.anObject8 = InetAddress.getByName((String) local17.anObject9).getAddress();
						} else if (local45 == 5) {
							local17.anObject8 = this.aClass219_1.method5735();
						} else if (local45 == 6) {
							@Pc(204) Frame local204 = new Frame("Jagex Full Screen");
							local17.anObject8 = local204;
							local204.setResizable(false);
							this.aClass219_1.method5738(local17.anInt6786 & 0xFFFF, local204, local17.anInt6786 >>> 16, local17.anInt6787 >> 16, local17.anInt6787 & 0xFFFF);
						} else if (local45 == 7) {
							this.aClass219_1.method5736();
						} else {
							@Pc(253) Class[] local253;
							@Pc(255) Runtime local255;
							@Pc(265) Method local265;
							if (local45 == 10) {
								local253 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local255 = Runtime.getRuntime();
								if (!aString70.startsWith("mac")) {
									local265 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local253);
									local265.setAccessible(true);
									local265.invoke(local255, local17.anObject9, "jawt");
									local265.setAccessible(false);
								}
								local265 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local253);
								local265.setAccessible(true);
								if (aString70.startsWith("linux") || aString70.startsWith("sunos")) {
									local265.invoke(local255, local17.anObject9, this.method5767("libjaggl_dri.so").toString());
									@Pc(381) Class local381 = ((Class) local17.anObject9).getClassLoader().loadClass("jaggl.X11.dri");
									local381.getMethod("bind").invoke(null);
									local265.invoke(local255, local17.anObject9, this.method5767("libjaggl.so").toString());
									local381.getMethod("close").invoke(null);
								} else if (aString70.startsWith("mac")) {
									local265.invoke(local255, local17.anObject9, this.method5767("libjaggl.jnilib").toString());
								} else if (aString70.startsWith("win")) {
									local265.invoke(local255, local17.anObject9, this.method5767("jaggl.dll").toString());
								} else {
									throw new Exception();
								}
								local265.setAccessible(false);
							} else {
								@Pc(445) int local445;
								if (local45 == 11) {
									@Pc(432) Field local432 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local432.setAccessible(true);
									@Pc(443) Vector local443 = (Vector) local432.get(((Class) local17.anObject9).getClassLoader());
									for (local445 = 0; local445 < local443.size(); local445++) {
										@Pc(457) Object local457 = local443.elementAt(local445);
										@Pc(464) Method local464 = local457.getClass().getDeclaredMethod("finalize");
										local464.setAccessible(true);
										local464.invoke(local457);
										local464.setAccessible(false);
										@Pc(481) Field local481 = local457.getClass().getDeclaredField("handle");
										local481.setAccessible(true);
										local481.set(local457, Integer.valueOf(0));
										local481.setAccessible(false);
									}
									local432.setAccessible(false);
								} else {
									@Pc(510) Class223 local510;
									if (local45 == 12) {
										local510 = method5772(this.anInt6793, this.aString72);
										local17.anObject8 = local510;
									} else if (local45 == 13) {
										local510 = method5763(this.aString72, this.anInt6793);
										local17.anObject8 = local510;
									} else if (local45 == 14) {
										@Pc(536) int local536 = local17.anInt6786;
										@Pc(539) int local539 = local17.anInt6787;
										this.aClass220_1.method5740(local536, local539);
									} else if (local45 == 15) {
										@Pc(557) boolean local557 = local17.anInt6786 != 0;
										@Pc(561) Component local561 = (Component) local17.anObject9;
										this.aClass220_1.method5741(local557, local561);
									} else if (local45 == 17) {
										local88 = (Object[]) local17.anObject9;
										this.aClass220_1.method5739((Component) local88[0], local17.anInt6787, local17.anInt6786, (int[]) local88[1], (Point) local88[2]);
									} else if (local45 == 16) {
										try {
											if (!aString70.startsWith("win")) {
												throw new Exception();
											}
											local175 = (String) local17.anObject9;
											if (!local175.startsWith("http://") && !local175.startsWith("https://")) {
												throw new Exception();
											}
											@Pc(698) String local698 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
											for (local445 = 0; local175.length() > local445; local445++) {
												if (local698.indexOf(local175.charAt(local445)) == -1) {
													throw new Exception();
												}
											}
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local175 + "\"");
											local17.anObject8 = null;
										} catch (@Pc(739) Exception local739) {
											local17.anObject8 = local739;
										}
									} else if (local45 == 20) {
										try {
											local253 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
											local255 = Runtime.getRuntime();
											local265 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local253);
											local265.setAccessible(true);
											if (aString70.startsWith("win")) {
												if (aString75.startsWith("amd64") || aString75.startsWith("x86_64")) {
													local265.invoke(local255, local17.anObject9, this.method5767("jagmisc64.dll").toString());
												} else {
													local265.invoke(local255, local17.anObject9, this.method5767("jagmisc.dll").toString());
												}
											}
											local265.setAccessible(false);
										} catch (@Pc(667) Throwable local667) {
											local17.anObject8 = local667;
										}
									} else {
										throw new Exception("");
									}
								}
							}
						}
					}
				}
				local17.anInt6785 = 1;
			} catch (@Pc(892) ThreadDeath local892) {
				throw local892;
			} catch (@Pc(895) Throwable local895) {
				local17.anInt6785 = 2;
			}
			synchronized (local17) {
				local17.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!ko", name = "b", descriptor = "(B)Z")
	private boolean method5775(@OriginalArg(0) byte arg0) {
		if (arg0 < 89) {
			this.method5789(false, null);
		}
		return this.aClass219_1 != null;
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(Ljava/lang/Class;I)Lloader!aa;")
	private Class218 method5776(@OriginalArg(0) Class arg0) {
		return this.method5773(arg0, -22549, 11, 0, 0);
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(IIIII)Lloader!aa;")
	private Class218 method5777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 != 2) {
			this.method5780((byte) 46, null);
		}
		return this.method5773(null, -22549, 6, (arg1 << 16) + arg0, arg4 + (arg3 << 16));
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;ILjava/lang/String;)Lloader!aa;")
	private Class218 method5778(@OriginalArg(0) Class arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		if (arg2 >= -6) {
			this.anInt6793 = 89;
		}
		return this.method5773(new Object[] { arg0, arg3, arg1 }, -22549, 8, 0, 0);
	}

	@OriginalMember(owner = "loader!ko", name = "d", descriptor = "(I)V")
	private void method5779(@OriginalArg(0) int arg0) {
		aLong218 = Class225.method5800() + 5000L;
		if (arg0 != 0) {
			method5772(-23, null);
		}
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(BLjava/awt/datatransfer/Transferable;)Lloader!aa;")
	private Class218 method5780(@OriginalArg(0) byte arg0, @OriginalArg(1) Transferable arg1) {
		return arg0 >= -69 ? (Class218) null : this.method5773(arg1, -22549, 19, 0, 0);
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(I)Lloader!aa;")
	private Class218 method5781(@OriginalArg(0) int arg0) {
		if (arg0 != 13) {
			this.method5792(-16, -58, null);
		}
		return this.method5773(null, -22549, 13, 0, 0);
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(Ljava/lang/String;I)Lloader!aa;")
	private Class218 method5782(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 21) {
			this.method5769();
		}
		return this.method5773(arg0, -22549, 21, 0, 0);
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(ILjava/awt/Component;BI)Lloader!aa;")
	private Class218 method5783(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Point local10 = arg1.getLocationOnScreen();
		return this.method5773(null, -22549, 14, local10.y + arg2, arg0 + local10.x);
	}

	@OriginalMember(owner = "loader!ko", name = "c", descriptor = "(I)Lloader!aa;")
	private Class218 method5784(@OriginalArg(0) int arg0) {
		if (arg0 != 2) {
			aString75 = null;
		}
		return this.method5773(null, -22549, 12, 0, 0);
	}

	@OriginalMember(owner = "loader!ko", name = "b", descriptor = "(I)V")
	private void method5785(@OriginalArg(0) int arg0) {
		synchronized (this) {
			this.aBoolean429 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass223_1 != null) {
			try {
				this.aClass223_1.method5755(0);
			} catch (@Pc(31) IOException local31) {
			}
		}
		if (this.aClass223_2 != null) {
			try {
				this.aClass223_2.method5755(0);
			} catch (@Pc(41) IOException local41) {
			}
		}
		if (this.aClass223Array1 != null) {
			for (@Pc(46) int local46 = 0; local46 < this.aClass223Array1.length; local46++) {
				if (this.aClass223Array1[local46] != null) {
					try {
						this.aClass223Array1[local46].method5755(0);
					} catch (@Pc(66) IOException local66) {
					}
				}
			}
		}
		if (this.aClass223_3 != null) {
			try {
				this.aClass223_3.method5755(arg0 - 22805);
			} catch (@Pc(79) IOException local79) {
			}
		}
		if (arg0 != 22805) {
			this.method5767(null);
		}
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(Ljava/awt/Frame;I)Lloader!aa;")
	private Class218 method5786(@OriginalArg(0) Frame arg0) {
		return this.method5773(arg0, -22549, 7, 0, 0);
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(BLjava/lang/String;)[B")
	private byte[] method5788(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		@Pc(7) Class218 local7 = this.method5762(21, arg1, 0, 0, (byte) 127);
		return arg0 <= 111 ? (byte[]) null : (byte[]) local7.anObject8;
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(ZBLjava/awt/Component;)Lloader!aa;")
	private Class218 method5789(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1) {
		return this.method5773(arg1, -22549, 15, 0, arg0 ? 1 : 0);
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(Ljava/lang/Class;B)Lloader!aa;")
	private Class218 method5790(@OriginalArg(0) Class arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != -84) {
			method5772(83, null);
		}
		return this.method5773(arg0, -22549, 20, 0, 0);
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(ILjava/lang/String;)Lloader!aa;")
	private Class218 method5791(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != 0) {
			this.method5769();
		}
		return this.method5773(arg1, -22549, 16, 0, 0);
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(IILjava/lang/String;)Lloader!aa;")
	private Class218 method5792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 != 1) {
			method5787(null, null, -92);
		}
		return this.method5773(arg2, arg1 ^ 0xFFFFA7EA, 1, 0, arg0);
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(BILjava/lang/Runnable;)Lloader!aa;")
	private Class218 method5793(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Runnable arg2) {
		return arg0 == -63 ? this.method5773(arg2, -22549, 2, 0, arg1) : (Class218) null;
	}
}
