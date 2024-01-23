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

@OriginalClass("loader!we")
public final class Class196 implements Runnable {

	@OriginalMember(owner = "loader!we", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString208;

	@OriginalMember(owner = "loader!we", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString209;

	@OriginalMember(owner = "loader!we", name = "r", descriptor = "Ljava/lang/String;")
	private static String aString210;

	@OriginalMember(owner = "loader!we", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString211;

	@OriginalMember(owner = "loader!we", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString212;

	@OriginalMember(owner = "loader!we", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString213;

	@OriginalMember(owner = "loader!we", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString214;

	@OriginalMember(owner = "loader!we", name = "u", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!we", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!we", name = "m", descriptor = "I")
	private static int anInt5888 = 1;

	@OriginalMember(owner = "loader!we", name = "j", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!we", name = "v", descriptor = "J")
	private static volatile long aLong217 = 0L;

	@OriginalMember(owner = "loader!we", name = "c", descriptor = "Lloader!v;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "loader!we", name = "d", descriptor = "Lloader!hm;")
	private Class194 aClass194_1 = null;

	@OriginalMember(owner = "loader!we", name = "n", descriptor = "Z")
	private boolean aBoolean414 = false;

	@OriginalMember(owner = "loader!we", name = "o", descriptor = "Lloader!nn;")
	private Class195 aClass195_2 = null;

	@OriginalMember(owner = "loader!we", name = "h", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!we", name = "s", descriptor = "Lloader!hm;")
	private Class194 aClass194_2 = null;

	@OriginalMember(owner = "loader!we", name = "x", descriptor = "Lloader!nn;")
	private Class195 aClass195_3 = null;

	@OriginalMember(owner = "loader!we", name = "g", descriptor = "Lloader!hm;")
	private Class194 aClass194_3 = null;

	@OriginalMember(owner = "loader!we", name = "A", descriptor = "Ljava/lang/String;")
	private String aString215;

	@OriginalMember(owner = "loader!we", name = "y", descriptor = "I")
	private int anInt5889;

	@OriginalMember(owner = "loader!we", name = "e", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!we", name = "p", descriptor = "[Lloader!hm;")
	private Class194[] aClass194Array1;

	@OriginalMember(owner = "loader!we", name = "l", descriptor = "Lloader!c;")
	private Class190 aClass190_1;

	@OriginalMember(owner = "loader!we", name = "z", descriptor = "Lloader!d;")
	private Class191 aClass191_1;

	@OriginalMember(owner = "loader!we", name = "w", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "loader!we", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	public static File method4755(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg2);
		if (local4 != null) {
			return local4;
		}
		@Pc(45) String[] local45 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString209, "/tmp/", "" };
		@Pc(70) String[] local70 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(72) int local72 = 0; local72 < 2; local72++) {
			for (@Pc(79) int local79 = 0; local79 < local70.length; local79++) {
				for (@Pc(89) int local89 = 0; local89 < local45.length; local89++) {
					@Pc(123) String local123 = local45[local89] + local70[local79] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(125) RandomAccessFile local125 = null;
					try {
						@Pc(130) File local130 = new File(local123);
						if (local72 != 0 || local130.exists()) {
							@Pc(143) String local143 = local45[local89];
							if (local72 != 1 || local143.length() <= 0 || (new File(local143)).exists()) {
								(new File(local45[local89] + local70[local79])).mkdir();
								if (arg1 != null) {
									(new File(local45[local89] + local70[local79] + "/" + arg1)).mkdir();
								}
								local125 = new RandomAccessFile(local130, "rw");
								@Pc(208) int local208 = local125.read();
								local125.seek(0L);
								local125.write(local208);
								local125.seek(0L);
								local125.close();
								aHashtable2.put(arg2, local130);
								return local130;
							}
						}
					} catch (@Pc(227) Exception local227) {
						try {
							if (local125 != null) {
								local125.close();
							}
						} catch (@Pc(236) Exception local236) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!we", name = "a", descriptor = "(ILjava/lang/String;)Lloader!hm;")
	private static Class194 method4758(@OriginalArg(1) String arg0) {
		@Pc(40) String[] local40 = new String[] { "c:/rscache/", "/rscache/", aString209, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(42) int local42 = 0; local42 < local40.length; local42++) {
			@Pc(54) String local54 = local40[local42];
			if (local54.length() <= 0 || (new File(local54)).exists()) {
				try {
					return new Class194(new File(local54, "jagex_" + arg0 + "_preferences.dat"), "rw", 10000L);
				} catch (@Pc(88) Exception local88) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!we", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class196(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.aString215 = arg2;
		aString212 = "1.1";
		this.anInt5889 = arg1;
		this.anApplet3 = arg0;
		aString213 = "Unknown";
		try {
			aString213 = System.getProperty("java.vendor");
			aString212 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString211 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString211 = "Unknown";
		}
		aString208 = aString211.toLowerCase();
		try {
			aString214 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString214 = "";
		}
		try {
			aString210 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString210 = "";
		}
		try {
			aString209 = System.getProperty("user.home");
			if (aString209 != null) {
				aString209 = aString209 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString209 == null) {
			aString209 = "~/";
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
		this.aClass194_3 = new Class194(method4755(this.anInt5889, null, "random.dat"), "rw", 25L);
		this.aClass194_1 = new Class194(method4755(this.anInt5889, this.aString215, "main_file_cache.dat2"), "rw", 104857600L);
		this.aClass194_2 = new Class194(method4755(this.anInt5889, this.aString215, "main_file_cache.idx255"), "rw", 1048576L);
		this.aClass194Array1 = new Class194[arg3];
		for (@Pc(200) int local200 = 0; local200 < arg3; local200++) {
			this.aClass194Array1[local200] = new Class194(method4755(this.anInt5889, this.aString215, "main_file_cache.idx" + local200), "rw", 1048576L);
		}
		try {
			this.aClass190_1 = new Class190();
		} catch (@Pc(239) Throwable local239) {
		}
		try {
			this.aClass191_1 = new Class191();
		} catch (@Pc(246) Throwable local246) {
		}
		@Pc(249) Thread[] local249 = new Thread[1000];
		@Pc(252) ThreadGroup local252 = Thread.currentThread().getThreadGroup();
		for (@Pc(255) ThreadGroup local255 = local252.getParent(); local255 != null; local255 = local255.getParent()) {
			local252 = local255;
		}
		local252.enumerate(local249);
		for (@Pc(270) int local270 = 0; local270 < local249.length; local270++) {
			if (local249[local270] != null && local249[local270].getName().startsWith("AWT")) {
				local249[local270].setPriority(1);
			}
		}
		this.aBoolean414 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!we", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class195 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean414) {
						return;
					}
					if (this.aClass195_3 != null) {
						local16 = this.aClass195_3;
						this.aClass195_3 = this.aClass195_3.aClass195_1;
						if (this.aClass195_3 == null) {
							this.aClass195_2 = null;
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
				@Pc(45) int local45 = local16.anInt5884;
				if (local45 == 1) {
					if (Class192.method4728() < aLong217) {
						throw new IOException();
					}
					local16.anObject9 = new Socket(InetAddress.getByName((String) local16.anObject8), local16.anInt5885);
				} else if (local45 == 2) {
					@Pc(862) Thread local862 = new Thread((Runnable) local16.anObject8);
					local862.setDaemon(true);
					local862.start();
					local862.setPriority(local16.anInt5885);
					local16.anObject9 = local862;
				} else if (local45 == 4) {
					if (aLong217 > Class192.method4728()) {
						throw new IOException();
					}
					local16.anObject9 = new DataInputStream(((URL) local16.anObject8).openStream());
				} else {
					@Pc(97) Object[] local97;
					if (local45 == 8) {
						local97 = (Object[]) local16.anObject8;
						if (((Class) local97[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject9 = ((Class) local97[0]).getDeclaredMethod((String) local97[1], (Class[]) local97[2]);
					} else if (local45 == 9) {
						local97 = (Object[]) local16.anObject8;
						if (((Class) local97[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject9 = ((Class) local97[0]).getDeclaredField((String) local97[1]);
					} else if (local45 == 18) {
						@Pc(792) Clipboard local792 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.anObject9 = local792.getContents(null);
					} else if (local45 == 19) {
						@Pc(132) Transferable local132 = (Transferable) local16.anObject8;
						@Pc(135) Clipboard local135 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local135.setContents(local132, null);
					} else {
						@Pc(480) String local480;
						if (local45 == 3) {
							if (aLong217 > Class192.method4728()) {
								throw new IOException();
							}
							local480 = (local16.anInt5885 >> 24 & 0xFF) + "." + (local16.anInt5885 >> 16 & 0xFF) + "." + (local16.anInt5885 >> 8 & 0xFF) + "." + (local16.anInt5885 & 0xFF);
							local16.anObject9 = InetAddress.getByName(local480).getHostName();
						} else if (local45 == 5) {
							local16.anObject9 = this.aClass190_1.method4719();
						} else if (local45 == 6) {
							@Pc(165) Frame local165 = new Frame("Jagex Full Screen");
							local16.anObject9 = local165;
							local165.setResizable(false);
							this.aClass190_1.method4720(local16.anInt5885 >>> 16, local16.anInt5887 & 0xFFFF, local16.anInt5887 >> 16, local16.anInt5885 & 0xFFFF, local165);
						} else if (local45 == 7) {
							this.aClass190_1.method4721();
						} else {
							@Pc(226) Method local226;
							@Pc(214) Class[] local214;
							@Pc(216) Runtime local216;
							if (local45 == 10) {
								local214 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local216 = Runtime.getRuntime();
								if (!aString208.startsWith("mac")) {
									local226 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local214);
									local226.setAccessible(true);
									local226.invoke(local216, local16.anObject8, "jawt");
									local226.setAccessible(false);
								}
								local226 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local214);
								local226.setAccessible(true);
								if (aString208.startsWith("linux") || aString208.startsWith("sunos")) {
									local226.invoke(local216, local16.anObject8, method4755(this.anInt5889, this.aString215, "libjaggl_dri.so").toString());
									@Pc(293) Class local293 = ((Class) local16.anObject8).getClassLoader().loadClass("com.sun.opengl.impl.x11.DRIHack");
									local293.getMethod("begin").invoke(null);
									local226.invoke(local216, local16.anObject8, method4755(this.anInt5889, this.aString215, "libjaggl.so").toString());
									local293.getMethod("end").invoke(null);
								} else if (aString208.startsWith("mac")) {
									local226.invoke(local216, local16.anObject8, method4755(this.anInt5889, this.aString215, "libjaggl.jnilib").toString());
								} else if (aString208.startsWith("win")) {
									local226.invoke(local216, local16.anObject8, method4755(this.anInt5889, this.aString215, "jaggl.dll").toString());
								} else {
									throw new Exception();
								}
								local226.setAccessible(false);
							} else {
								@Pc(418) int local418;
								if (local45 == 11) {
									@Pc(405) Field local405 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local405.setAccessible(true);
									@Pc(416) Vector local416 = (Vector) local405.get(((Class) local16.anObject8).getClassLoader());
									for (local418 = 0; local416.size() > local418; local418++) {
										@Pc(430) Object local430 = local416.elementAt(local418);
										@Pc(437) Method local437 = local430.getClass().getDeclaredMethod("finalize");
										local437.setAccessible(true);
										local437.invoke(local430);
										local437.setAccessible(false);
										@Pc(454) Field local454 = local430.getClass().getDeclaredField("handle");
										local454.setAccessible(true);
										local454.set(local430, Integer.valueOf(0));
										local454.setAccessible(false);
									}
									local405.setAccessible(false);
								} else if (local45 == 12) {
									local480 = (String) local16.anObject8;
									@Pc(484) Class194 local484 = method4758(local480);
									local16.anObject9 = local484;
								} else if (local45 == 14) {
									@Pc(496) int local496 = local16.anInt5885;
									@Pc(499) int local499 = local16.anInt5887;
									this.aClass191_1.method4723(local499, local496);
								} else if (local45 == 15) {
									@Pc(721) boolean local721 = local16.anInt5885 != 0;
									@Pc(725) Component local725 = (Component) local16.anObject8;
									this.aClass191_1.method4722(local725, local721);
								} else if (local45 == 17) {
									local97 = (Object[]) local16.anObject8;
									this.aClass191_1.method4724((Point) local97[2], (int[]) local97[1], local16.anInt5887, local16.anInt5885, (Component) local97[0]);
								} else if (local45 == 16) {
									try {
										if (!aString208.startsWith("win")) {
											throw new Exception();
										}
										local480 = (String) local16.anObject8;
										if (!local480.startsWith("http://") && !local480.startsWith("https://")) {
											throw new Exception();
										}
										@Pc(545) String local545 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
										for (local418 = 0; local480.length() > local418; local418++) {
											if (local545.indexOf(local480.charAt(local418)) == -1) {
												throw new Exception();
											}
										}
										Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local480 + "\"");
										local16.anObject9 = null;
									} catch (@Pc(584) Exception local584) {
										local16.anObject9 = local584;
									}
								} else if (local45 == 20) {
									try {
										local214 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
										local216 = Runtime.getRuntime();
										local226 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local214);
										local226.setAccessible(true);
										if (aString208.startsWith("win")) {
											if (aString214.startsWith("amd64") || aString214.startsWith("x86_64")) {
												local226.invoke(local216, local16.anObject8, method4755(this.anInt5889, this.aString215, "jagmisc64.dll").toString());
											} else {
												local226.invoke(local216, local16.anObject8, method4755(this.anInt5889, this.aString215, "jagmisc.dll").toString());
											}
										}
										local226.setAccessible(false);
									} catch (@Pc(679) Throwable local679) {
										local16.anObject9 = local679;
									}
								} else {
									throw new Exception();
								}
							}
						}
					}
				}
				local16.anInt5886 = 1;
			} catch (@Pc(879) ThreadDeath local879) {
				throw local879;
			} catch (@Pc(882) Throwable local882) {
				local16.anInt5886 = 2;
			}
		}
	}
}
