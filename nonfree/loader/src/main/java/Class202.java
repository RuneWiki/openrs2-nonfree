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

@OriginalClass("loader!ua")
public final class Class202 implements Runnable {

	@OriginalMember(owner = "loader!ua", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString240;

	@OriginalMember(owner = "loader!ua", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString241;

	@OriginalMember(owner = "loader!ua", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString242;

	@OriginalMember(owner = "loader!ua", name = "s", descriptor = "Ljava/lang/String;")
	private static String aString243;

	@OriginalMember(owner = "loader!ua", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString244;

	@OriginalMember(owner = "loader!ua", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString245;

	@OriginalMember(owner = "loader!ua", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString246;

	@OriginalMember(owner = "loader!ua", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!ua", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!ua", name = "m", descriptor = "I")
	private static int anInt6166 = 1;

	@OriginalMember(owner = "loader!ua", name = "A", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!ua", name = "u", descriptor = "J")
	private static volatile long aLong253 = 0L;

	@OriginalMember(owner = "loader!ua", name = "p", descriptor = "Lloader!bo;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "loader!ua", name = "n", descriptor = "Lloader!he;")
	private Class200 aClass200_2 = null;

	@OriginalMember(owner = "loader!ua", name = "q", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!ua", name = "i", descriptor = "Z")
	private boolean aBoolean440 = false;

	@OriginalMember(owner = "loader!ua", name = "e", descriptor = "Lloader!uh;")
	private Class203 aClass203_1 = null;

	@OriginalMember(owner = "loader!ua", name = "w", descriptor = "Lloader!uh;")
	private Class203 aClass203_2 = null;

	@OriginalMember(owner = "loader!ua", name = "b", descriptor = "Lloader!he;")
	private Class200 aClass200_1 = null;

	@OriginalMember(owner = "loader!ua", name = "o", descriptor = "Lloader!he;")
	private Class200 aClass200_3 = null;

	@OriginalMember(owner = "loader!ua", name = "y", descriptor = "I")
	private int anInt6167;

	@OriginalMember(owner = "loader!ua", name = "z", descriptor = "Ljava/lang/String;")
	private String aString247;

	@OriginalMember(owner = "loader!ua", name = "r", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!ua", name = "l", descriptor = "[Lloader!he;")
	private Class200[] aClass200Array1;

	@OriginalMember(owner = "loader!ua", name = "x", descriptor = "Lloader!e;")
	private Class198 aClass198_1;

	@OriginalMember(owner = "loader!ua", name = "f", descriptor = "Lloader!b;")
	private Class197 aClass197_1;

	@OriginalMember(owner = "loader!ua", name = "a", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "loader!ua", name = "b", descriptor = "(BLjava/lang/String;)Lloader!he;")
	private static Class200 method5091(@OriginalArg(1) String arg0) {
		@Pc(42) String[] local42 = new String[] { "c:/rscache/", "/rscache/", aString241, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(44) int local44 = 0; local44 < local42.length; local44++) {
			@Pc(52) String local52 = local42[local44];
			if (local52.length() <= 0 || (new File(local52)).exists()) {
				try {
					return new Class200(new File(local52, "jagex_" + arg0 + "_preferences.dat"), "rw", 10000L);
				} catch (@Pc(84) Exception local84) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!ua", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)Ljava/io/File;")
	public static File method5098(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg1);
		if (local4 != null) {
			return local4;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString241, "/tmp/", "" };
		@Pc(68) String[] local68 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(70) int local70 = 0; local70 < 2; local70++) {
			for (@Pc(75) int local75 = 0; local75 < local68.length; local75++) {
				for (@Pc(81) int local81 = 0; local81 < local43.length; local81++) {
					@Pc(115) String local115 = local43[local81] + local68[local75] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(117) RandomAccessFile local117 = null;
					try {
						@Pc(122) File local122 = new File(local115);
						if (local70 != 0 || local122.exists()) {
							@Pc(132) String local132 = local43[local81];
							if (local70 != 1 || local132.length() <= 0 || (new File(local132)).exists()) {
								(new File(local43[local81] + local68[local75])).mkdir();
								if (arg0 != null) {
									(new File(local43[local81] + local68[local75] + "/" + arg0)).mkdir();
								}
								local117 = new RandomAccessFile(local122, "rw");
								@Pc(199) int local199 = local117.read();
								local117.seek(0L);
								local117.write(local199);
								local117.seek(0L);
								local117.close();
								aHashtable2.put(arg1, local122);
								return local122;
							}
						}
					} catch (@Pc(218) Exception local218) {
						try {
							if (local117 != null) {
								local117.close();
							}
						} catch (@Pc(226) Exception local226) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!ua", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class202(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString242 = "1.1";
		this.anInt6167 = arg1;
		aString240 = "Unknown";
		this.anApplet3 = arg0;
		this.aString247 = arg2;
		try {
			aString240 = System.getProperty("java.vendor");
			aString242 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString244 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString244 = "Unknown";
		}
		aString246 = aString244.toLowerCase();
		try {
			aString243 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString243 = "";
		}
		try {
			aString245 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString245 = "";
		}
		try {
			aString241 = System.getProperty("user.home");
			if (aString241 != null) {
				aString241 = aString241 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (aString241 == null) {
			aString241 = "~/";
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
		this.aClass200_1 = new Class200(method5098(null, "random.dat", this.anInt6167), "rw", 25L);
		this.aClass200_3 = new Class200(method5098(this.aString247, "main_file_cache.dat2", this.anInt6167), "rw", 209715200L);
		this.aClass200_2 = new Class200(method5098(this.aString247, "main_file_cache.idx255", this.anInt6167), "rw", 1048576L);
		this.aClass200Array1 = new Class200[arg3];
		for (@Pc(198) int local198 = 0; local198 < arg3; local198++) {
			this.aClass200Array1[local198] = new Class200(method5098(this.aString247, "main_file_cache.idx" + local198, this.anInt6167), "rw", 1048576L);
		}
		try {
			this.aClass198_1 = new Class198();
		} catch (@Pc(237) Throwable local237) {
		}
		try {
			this.aClass197_1 = new Class197();
		} catch (@Pc(244) Throwable local244) {
		}
		@Pc(247) ThreadGroup local247 = Thread.currentThread().getThreadGroup();
		@Pc(250) Thread[] local250 = new Thread[1000];
		for (@Pc(253) ThreadGroup local253 = local247.getParent(); local253 != null; local253 = local253.getParent()) {
			local247 = local253;
		}
		local247.enumerate(local250);
		for (@Pc(268) int local268 = 0; local268 < local250.length; local268++) {
			if (local250[local268] != null && local250[local268].getName().startsWith("AWT")) {
				local250[local268].setPriority(1);
			}
		}
		this.aBoolean440 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!ua", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(18) Class203 local18;
			synchronized (this) {
				while (true) {
					if (this.aBoolean440) {
						return;
					}
					if (this.aClass203_2 != null) {
						local18 = this.aClass203_2;
						this.aClass203_2 = this.aClass203_2.aClass203_3;
						if (this.aClass203_2 == null) {
							this.aClass203_1 = null;
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
				@Pc(46) int local46 = local18.anInt6170;
				if (local46 == 1) {
					if (Class201.method5066() < aLong253) {
						throw new IOException();
					}
					local18.anObject8 = new Socket(InetAddress.getByName((String) local18.anObject9), local18.anInt6169);
				} else if (local46 == 2) {
					@Pc(832) Thread local832 = new Thread((Runnable) local18.anObject9);
					local832.setDaemon(true);
					local832.start();
					local832.setPriority(local18.anInt6169);
					local18.anObject8 = local832;
				} else if (local46 == 4) {
					if (aLong253 > Class201.method5066()) {
						throw new IOException();
					}
					local18.anObject8 = new DataInputStream(((URL) local18.anObject9).openStream());
				} else {
					@Pc(70) Object[] local70;
					if (local46 == 8) {
						local70 = (Object[]) local18.anObject9;
						if (((Class) local70[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject8 = ((Class) local70[0]).getDeclaredMethod((String) local70[1], (Class[]) local70[2]);
					} else if (local46 == 9) {
						local70 = (Object[]) local18.anObject9;
						if (((Class) local70[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject8 = ((Class) local70[0]).getDeclaredField((String) local70[1]);
					} else if (local46 == 18) {
						@Pc(99) Clipboard local99 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local18.anObject8 = local99.getContents(null);
					} else if (local46 == 19) {
						@Pc(762) Transferable local762 = (Transferable) local18.anObject9;
						@Pc(765) Clipboard local765 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local765.setContents(local762, null);
					} else {
						@Pc(346) String local346;
						if (local46 == 3) {
							if (Class201.method5066() < aLong253) {
								throw new IOException();
							}
							local346 = (local18.anInt6169 >> 24 & 0xFF) + "." + (local18.anInt6169 >> 16 & 0xFF) + "." + (local18.anInt6169 >> 8 & 0xFF) + "." + (local18.anInt6169 & 0xFF);
							local18.anObject8 = InetAddress.getByName(local346).getHostName();
						} else if (local46 == 5) {
							local18.anObject8 = this.aClass198_1.method5054();
						} else if (local46 == 6) {
							@Pc(677) Frame local677 = new Frame("Jagex Full Screen");
							local18.anObject8 = local677;
							local677.setResizable(false);
							this.aClass198_1.method5056(local18.anInt6169 >>> 16, local18.anInt6168 & 0xFFFF, local677, local18.anInt6169 & 0xFFFF, local18.anInt6168 >> 16);
						} else if (local46 == 7) {
							this.aClass198_1.method5055();
						} else {
							@Pc(151) Runtime local151;
							@Pc(161) Method local161;
							@Pc(149) Class[] local149;
							if (local46 == 10) {
								local149 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local151 = Runtime.getRuntime();
								if (!aString246.startsWith("mac")) {
									local161 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local149);
									local161.setAccessible(true);
									local161.invoke(local151, local18.anObject9, "jawt");
									local161.setAccessible(false);
								}
								local161 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local149);
								local161.setAccessible(true);
								if (aString246.startsWith("linux") || aString246.startsWith("sunos")) {
									local161.invoke(local151, local18.anObject9, method5098(this.aString247, "libjaggl_dri.so", this.anInt6167).toString());
									@Pc(286) Class local286 = ((Class) local18.anObject9).getClassLoader().loadClass("com.sun.opengl.impl.x11.DRIHack");
									local286.getMethod("begin").invoke(null);
									local161.invoke(local151, local18.anObject9, method5098(this.aString247, "libjaggl.so", this.anInt6167).toString());
									local286.getMethod("end").invoke(null);
								} else if (aString246.startsWith("mac")) {
									local161.invoke(local151, local18.anObject9, method5098(this.aString247, "libjaggl.jnilib", this.anInt6167).toString());
								} else if (aString246.startsWith("win")) {
									local161.invoke(local151, local18.anObject9, method5098(this.aString247, "jaggl.dll", this.anInt6167).toString());
								} else {
									throw new Exception();
								}
								local161.setAccessible(false);
							} else {
								@Pc(553) int local553;
								if (local46 == 11) {
									@Pc(599) Field local599 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local599.setAccessible(true);
									@Pc(610) Vector local610 = (Vector) local599.get(((Class) local18.anObject9).getClassLoader());
									for (local553 = 0; local610.size() > local553; local553++) {
										@Pc(624) Object local624 = local610.elementAt(local553);
										@Pc(631) Method local631 = local624.getClass().getDeclaredMethod("finalize");
										local631.setAccessible(true);
										local631.invoke(local624);
										local631.setAccessible(false);
										@Pc(648) Field local648 = local624.getClass().getDeclaredField("handle");
										local648.setAccessible(true);
										local648.set(local624, Integer.valueOf(0));
										local648.setAccessible(false);
									}
									local599.setAccessible(false);
								} else if (local46 == 12) {
									local346 = (String) local18.anObject9;
									@Pc(350) Class200 local350 = method5091(local346);
									local18.anObject8 = local350;
								} else if (local46 == 14) {
									@Pc(360) int local360 = local18.anInt6169;
									@Pc(363) int local363 = local18.anInt6168;
									this.aClass197_1.method5041(local360, local363);
								} else if (local46 == 15) {
									@Pc(380) boolean local380 = local18.anInt6169 != 0;
									@Pc(384) Component local384 = (Component) local18.anObject9;
									this.aClass197_1.method5040(local384, local380);
								} else if (local46 == 17) {
									local70 = (Object[]) local18.anObject9;
									this.aClass197_1.method5039((Point) local70[2], local18.anInt6168, (int[]) local70[1], local18.anInt6169, (Component) local70[0]);
								} else if (local46 == 16) {
									try {
										if (!aString246.startsWith("win")) {
											throw new Exception();
										}
										local346 = (String) local18.anObject9;
										if (!local346.startsWith("http://") && !local346.startsWith("https://")) {
											throw new Exception();
										}
										@Pc(551) String local551 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
										for (local553 = 0; local553 < local346.length(); local553++) {
											if (local551.indexOf(local346.charAt(local553)) == -1) {
												throw new Exception();
											}
										}
										Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local346 + "\"");
										local18.anObject8 = null;
									} catch (@Pc(590) Exception local590) {
										local18.anObject8 = local590;
									}
								} else if (local46 == 20) {
									try {
										local149 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
										local151 = Runtime.getRuntime();
										local161 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local149);
										local161.setAccessible(true);
										if (aString246.startsWith("win")) {
											if (aString243.startsWith("amd64") || aString243.startsWith("x86_64")) {
												local161.invoke(local151, local18.anObject9, method5098(this.aString247, "jagmisc64.dll", this.anInt6167).toString());
											} else {
												local161.invoke(local151, local18.anObject9, method5098(this.aString247, "jagmisc.dll", this.anInt6167).toString());
											}
										}
										local161.setAccessible(false);
									} catch (@Pc(515) Throwable local515) {
										local18.anObject8 = local515;
									}
								} else {
									throw new Exception();
								}
							}
						}
					}
				}
				local18.anInt6171 = 1;
			} catch (@Pc(871) ThreadDeath local871) {
				throw local871;
			} catch (@Pc(874) Throwable local874) {
				local18.anInt6171 = 2;
			}
		}
	}
}
