import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!d")
public final class Class275 {

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "()V")
	public Class275() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(14) GraphicsDevice[] local14 = local3.getScreenDevices();
			for (@Pc(18) int local18 = 0; local18 < local14.length; local18++) {
				@Pc(26) GraphicsDevice local26 = local14[local18];
				if (local26 != null && local26.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local26;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(IILjava/awt/Frame;III)V")
	public void method6342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Frame arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg2.setUndecorated(true);
		arg2.enableInputMethods(false);
		this.method6344(arg2);
		if (arg4 == 0) {
			@Pc(32) int local32 = this.aDisplayMode1.getRefreshRate();
			@Pc(36) DisplayMode[] local36 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(38) boolean local38 = false;
			for (@Pc(40) int local40 = 0; local40 < local36.length; local40++) {
				if (local36[local40].getWidth() == arg1 && arg0 == local36[local40].getHeight() && arg3 == local36[local40].getBitDepth()) {
					@Pc(67) int local67 = local36[local40].getRefreshRate();
					if (!local38 || Math.abs(local67 - local32) < Math.abs(arg4 - local32)) {
						arg4 = local67;
						local38 = true;
					}
				}
			}
			if (!local38) {
				arg4 = local32;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg1, arg0, arg3, arg4));
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(I)V")
	public void method6343() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method6344(null);
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(BLjava/awt/Frame;)V")
	private void method6344(@OriginalArg(1) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(22) boolean local22 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local22) {
				local1 = true;
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
			}
		} catch (@Pc(34) Throwable local34) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(63) Field local63 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local63.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(70) Throwable local70) {
				}
			}
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(B)[I")
	public int[] method6345() {
		@Pc(9) DisplayMode[] local9 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(15) int[] local15 = new int[local9.length << 2];
		for (@Pc(17) int local17 = 0; local17 < local9.length; local17++) {
			local15[local17 << 2] = local9[local17].getWidth();
			local15[(local17 << 2) + 1] = local9[local17].getHeight();
			local15[(local17 << 2) + 2] = local9[local17].getBitDepth();
			local15[(local17 << 2) + 3] = local9[local17].getRefreshRate();
		}
		return local15;
	}
}
