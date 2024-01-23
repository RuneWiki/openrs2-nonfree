import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!qg")
public final class Class111 implements Runnable {

	@OriginalMember(owner = "loader!qg", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!qg", name = "h", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!qg", name = "c", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!qg", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "loader!qg", name = "q", descriptor = "Ljava/lang/String;")
	private static String aString10;

	@OriginalMember(owner = "loader!qg", name = "a", descriptor = "I")
	private static int anInt4817 = 1;

	@OriginalMember(owner = "loader!qg", name = "f", descriptor = "[Lloader!fg;")
	private Class109[] aClass109Array1;

	@OriginalMember(owner = "loader!qg", name = "i", descriptor = "Lloader!qd;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "loader!qg", name = "b", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!qg", name = "e", descriptor = "Lloader!p;")
	private Class110 aClass110_2 = null;

	@OriginalMember(owner = "loader!qg", name = "g", descriptor = "Z")
	private boolean aBoolean298 = false;

	@OriginalMember(owner = "loader!qg", name = "o", descriptor = "Ljava/io/File;")
	public File aFile6 = null;

	@OriginalMember(owner = "loader!qg", name = "l", descriptor = "Lloader!fg;")
	private Class109 aClass109_2 = null;

	@OriginalMember(owner = "loader!qg", name = "d", descriptor = "Lloader!fg;")
	private Class109 aClass109_3 = null;

	@OriginalMember(owner = "loader!qg", name = "j", descriptor = "Lloader!fg;")
	private Class109 aClass109_1 = null;

	@OriginalMember(owner = "loader!qg", name = "k", descriptor = "Lloader!p;")
	private Class110 aClass110_3 = null;

	@OriginalMember(owner = "loader!qg", name = "s", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!qg", name = "n", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!qg", name = "r", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "loader!qg", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class111(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		aString8 = "Unknown";
		this.anApplet3 = arg1;
		aString9 = "1.1";
		try {
			aString8 = System.getProperty("java.vendor");
			aString9 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString10 = System.getProperty("user.home");
			if (aString10 != null) {
				aString10 = aString10 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (aString10 == null) {
			aString10 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(97) Exception local97) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(124) Exception local124) {
		}
		this.method3365(arg3, arg4, arg2);
		this.aBoolean298 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!qg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class110 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean298) {
						return;
					}
					if (this.aClass110_2 != null) {
						local15 = this.aClass110_2;
						this.aClass110_2 = this.aClass110_2.aClass110_1;
						if (this.aClass110_2 == null) {
							this.aClass110_3 = null;
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
				@Pc(43) int local43 = local15.anInt4815;
				if (local43 == 1) {
					local15.anObject5 = new Socket(InetAddress.getByName((String) local15.anObject6), local15.anInt4816);
				} else if (local43 == 2) {
					@Pc(72) Thread local72 = new Thread((Runnable) local15.anObject6);
					local72.setDaemon(true);
					local72.start();
					local72.setPriority(local15.anInt4816);
					local15.anObject5 = local72;
				} else if (local43 == 4) {
					local15.anObject5 = new DataInputStream(((URL) local15.anObject6).openStream());
				} else {
					@Pc(165) Object[] local165;
					if (local43 == 8) {
						local165 = (Object[]) local15.anObject6;
						if (((Class) local165[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject5 = ((Class) local165[0]).getDeclaredMethod((String) local165[1], (Class[]) local165[2]);
					} else if (local43 == 9) {
						local165 = (Object[]) local15.anObject6;
						if (((Class) local165[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject5 = ((Class) local165[0]).getDeclaredField((String) local165[1]);
					} else if (local43 == 3) {
						@Pc(154) String local154 = (local15.anInt4816 >> 24 & 0xFF) + "." + (local15.anInt4816 >> 16 & 0xFF) + "." + (local15.anInt4816 >> 8 & 0xFF) + "." + (local15.anInt4816 & 0xFF);
						local15.anObject5 = InetAddress.getByName(local154).getHostName();
					} else {
						throw new Exception();
					}
				}
				local15.anInt4814 = 1;
			} catch (@Pc(226) ThreadDeath local226) {
				throw local226;
			} catch (@Pc(229) Throwable local229) {
				local15.anInt4814 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!qg", name = "a", descriptor = "(ILjava/lang/String;II)V")
	private void method3365(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(47) String[] local47 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString10, "/tmp/", "" };
		@Pc(72) String[] local72 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(74) int local74 = 0; local74 < 2; local74++) {
			for (@Pc(81) int local81 = 0; local81 < local72.length; local81++) {
				for (@Pc(91) int local91 = 0; local91 < local47.length; local91++) {
					try {
						@Pc(99) String local99 = local47[local91];
						if (local99.length() > 0 && !(new File(local99)).exists()) {
							continue;
						}
						@Pc(126) File local126 = new File(local99 + local72[local81]);
						@Pc(136) boolean local136;
						if (local74 == 1 && !local126.exists()) {
							local136 = local126.mkdir();
							if (!local136) {
								continue;
							}
						}
						@Pc(149) File local149;
						if (this.aClass109_1 == null) {
							try {
								local149 = new File(local126, "random.dat");
								if (local74 == 1 || local149.exists()) {
									this.aClass109_1 = new Class109(local149, "rw", 25L);
								}
							} catch (@Pc(167) Exception local167) {
								this.aClass109_1 = null;
							}
						}
						if (this.aFile5 == null) {
							@Pc(225) int local225;
							try {
								local126 = new File(local126, arg0);
								if (local74 == 1 && !local126.exists()) {
									local136 = local126.mkdir();
									if (!local136) {
										continue;
									}
								}
								local149 = new File(local126, "main_file_cache.dat2");
								if (local74 == 0 && !local149.exists()) {
									continue;
								}
								this.aClass109_2 = new Class109(local149, "rw", 104857600L);
								this.aClass109Array1 = new Class109[27];
								for (local225 = 0; local225 < 27; local225++) {
									this.aClass109Array1[local225] = new Class109(new File(local126, "main_file_cache.idx" + local225), "rw", 1048576L);
								}
								this.aClass109_3 = new Class109(new File(local126, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile6 = this.aFile5 = local126;
							} catch (@Pc(275) Exception local275) {
								try {
									this.aClass109_2.method3346();
									for (local225 = 0; local225 < 27; local225++) {
										this.aClass109Array1[local225].method3346();
									}
									this.aClass109_3.method3346();
								} catch (@Pc(298) Exception local298) {
								}
								this.aClass109Array1 = null;
								this.aFile6 = this.aFile5 = null;
								this.aClass109_2 = this.aClass109_3 = null;
							}
						}
					} catch (@Pc(315) Exception local315) {
					}
					if (this.aClass109_1 != null && this.aFile5 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile5 == null) {
			throw new RuntimeException();
		}
	}
}
