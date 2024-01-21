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

@OriginalClass("loader!d")
public final class Class101 implements Runnable {

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!d", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!d", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString9;

	@OriginalMember(owner = "loader!d", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString10;

	@OriginalMember(owner = "loader!d", name = "g", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!d", name = "j", descriptor = "I")
	private static final int anInt4519 = 1;

	@OriginalMember(owner = "loader!d", name = "n", descriptor = "[Lloader!wh;")
	private Class103[] aClass103Array1;

	@OriginalMember(owner = "loader!d", name = "e", descriptor = "Lloader!pf;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!d", name = "k", descriptor = "Lloader!wh;")
	private Class103 aClass103_2 = null;

	@OriginalMember(owner = "loader!d", name = "m", descriptor = "Lloader!wh;")
	private Class103 aClass103_3 = null;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "Lloader!nc;")
	private Class102 aClass102_1 = null;

	@OriginalMember(owner = "loader!d", name = "h", descriptor = "Lloader!wh;")
	private Class103 aClass103_1 = null;

	@OriginalMember(owner = "loader!d", name = "c", descriptor = "Ljava/io/File;")
	public File aFile4 = null;

	@OriginalMember(owner = "loader!d", name = "q", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!d", name = "i", descriptor = "Lloader!nc;")
	private Class102 aClass102_2 = null;

	@OriginalMember(owner = "loader!d", name = "l", descriptor = "Z")
	private boolean aBoolean244 = false;

	@OriginalMember(owner = "loader!d", name = "s", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!d", name = "f", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!d", name = "p", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class101(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet2 = arg1;
		aString8 = "1.1";
		aString10 = "Unknown";
		try {
			aString10 = System.getProperty("java.vendor");
			aString8 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString9 = System.getProperty("user.home");
			if (aString9 != null) {
				aString9 = aString9 + "/";
			}
		} catch (@Pc(60) Exception local60) {
		}
		if (aString9 == null) {
			aString9 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(72) Throwable local72) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(99) Exception local99) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(127) Exception local127) {
		}
		this.method3428(arg2, arg3, arg4);
		this.aBoolean244 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(ILjava/lang/String;IZ)V")
	private void method3428(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(48) String[] local48 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString9, "/tmp/", "" };
		@Pc(73) String[] local73 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(75) int local75 = 0; local75 < 2; local75++) {
			for (@Pc(82) int local82 = 0; local82 < local73.length; local82++) {
				for (@Pc(88) int local88 = 0; local88 < local48.length; local88++) {
					try {
						@Pc(96) String local96 = local48[local88];
						if (local96.length() > 0 && !(new File(local96)).exists()) {
							continue;
						}
						@Pc(123) File local123 = new File(local96 + local73[local82]);
						@Pc(135) boolean local135;
						if (local75 == 1 && !local123.exists()) {
							local135 = local123.mkdir();
							if (!local135) {
								continue;
							}
						}
						@Pc(149) File local149;
						if (this.aClass103_1 == null) {
							try {
								local149 = new File(local123, "random.dat");
								if (local75 == 1 || local149.exists()) {
									this.aClass103_1 = new Class103(local149, "rw", 25L);
								}
							} catch (@Pc(168) Exception local168) {
								this.aClass103_1 = null;
							}
						}
						if (this.aFile5 == null) {
							@Pc(225) int local225;
							try {
								local123 = new File(local123, arg1);
								if (local75 == 1 && !local123.exists()) {
									local135 = local123.mkdir();
									if (!local135) {
										continue;
									}
								}
								local149 = new File(local123, "main_file_cache.dat2");
								if (local75 == 0 && !local149.exists()) {
									continue;
								}
								this.aClass103_3 = new Class103(local149, "rw", 104857600L);
								this.aClass103Array1 = new Class103[24];
								for (local225 = 0; local225 < 24; local225++) {
									this.aClass103Array1[local225] = new Class103(new File(local123, "main_file_cache.idx" + local225), "rw", 1048576L);
								}
								this.aClass103_2 = new Class103(new File(local123, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile4 = this.aFile5 = local123;
							} catch (@Pc(275) Exception local275) {
								try {
									this.aClass103_3.method3455();
									for (local225 = 0; local225 < 24; local225++) {
										this.aClass103Array1[local225].method3455();
									}
									this.aClass103_2.method3455();
								} catch (@Pc(302) Exception local302) {
								}
								this.aFile4 = this.aFile5 = null;
								this.aClass103_3 = this.aClass103_2 = null;
								this.aClass103Array1 = null;
							}
						}
					} catch (@Pc(319) Exception local319) {
					}
					if (this.aClass103_1 != null && this.aFile5 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile5 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!d", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class102 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean244) {
						return;
					}
					if (this.aClass102_1 != null) {
						local17 = this.aClass102_1;
						this.aClass102_1 = this.aClass102_1.aClass102_3;
						if (this.aClass102_1 == null) {
							this.aClass102_2 = null;
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
				@Pc(45) int local45 = local17.anInt4523;
				if (local45 == 1) {
					local17.anObject5 = new Socket(InetAddress.getByName((String) local17.anObject6), local17.anInt4522);
				} else if (local45 == 2) {
					@Pc(209) Thread local209 = new Thread((Runnable) local17.anObject6);
					local209.setDaemon(true);
					local209.start();
					local209.setPriority(local17.anInt4522);
					local17.anObject5 = local209;
				} else if (local45 == 4) {
					local17.anObject5 = new DataInputStream(((URL) local17.anObject6).openStream());
				} else {
					@Pc(92) Object[] local92;
					if (local45 == 8) {
						local92 = (Object[]) local17.anObject6;
						if (((Class) local92[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local92[0]).getDeclaredMethod((String) local92[1], (Class[]) local92[2]);
					} else if (local45 == 9) {
						local92 = (Object[]) local17.anObject6;
						if (((Class) local92[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local92[0]).getDeclaredField((String) local92[1]);
					} else if (local45 == 3) {
						@Pc(164) String local164 = (local17.anInt4522 >> 24 & 0xFF) + "." + (local17.anInt4522 >> 16 & 0xFF) + "." + (local17.anInt4522 >> 8 & 0xFF) + "." + (local17.anInt4522 & 0xFF);
						local17.anObject5 = InetAddress.getByName(local164).getHostName();
					} else {
						throw new Exception();
					}
				}
				local17.anInt4524 = 1;
			} catch (@Pc(226) ThreadDeath local226) {
				throw local226;
			} catch (@Pc(229) Throwable local229) {
				local17.anInt4524 = 2;
			}
		}
	}
}
