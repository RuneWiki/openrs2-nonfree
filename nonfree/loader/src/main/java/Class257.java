import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!g")
public final class Class257 {

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "()V")
	public Class257() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(15) GraphicsDevice[] local15 = local3.getScreenDevices();
			for (@Pc(19) int local19 = 0; local19 < local15.length; local19++) {
				@Pc(27) GraphicsDevice local27 = local15[local19];
				if (local27 != null && local27.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local27;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	private void method5687(@OriginalArg(0) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(16) boolean local16 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local16) {
				local1 = true;
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
			}
		} catch (@Pc(28) Throwable local28) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(64) Field local64 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local64.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(71) Throwable local71) {
				}
			}
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(ILjava/awt/Frame;IIIB)V")
	public void method5688(@OriginalArg(0) int arg0, @OriginalArg(1) Frame arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg1.setUndecorated(true);
		arg1.enableInputMethods(false);
		this.method5687(arg1);
		if (arg0 == 0) {
			@Pc(38) int local38 = this.aDisplayMode1.getRefreshRate();
			@Pc(42) DisplayMode[] local42 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(44) boolean local44 = false;
			for (@Pc(46) int local46 = 0; local46 < local42.length; local46++) {
				if (local42[local46].getWidth() == arg4 && local42[local46].getHeight() == arg3 && arg2 == local42[local46].getBitDepth()) {
					@Pc(74) int local74 = local42[local46].getRefreshRate();
					if (!local44 || Math.abs(local74 - local38) < Math.abs(arg0 - local38)) {
						arg0 = local74;
						local44 = true;
					}
				}
			}
			if (!local44) {
				arg0 = local38;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg4, arg3, arg2, arg0));
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(I)[I")
	public int[] method5689() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(9) int[] local9 = new int[local3.length << 2];
		for (@Pc(19) int local19 = 0; local19 < local3.length; local19++) {
			local9[local19 << 2] = local3[local19].getWidth();
			local9[(local19 << 2) + 1] = local3[local19].getHeight();
			local9[(local19 << 2) + 2] = local3[local19].getBitDepth();
			local9[(local19 << 2) + 3] = local3[local19].getRefreshRate();
		}
		return local9;
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(B)V")
	public void method5690() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method5687(null);
	}
}
